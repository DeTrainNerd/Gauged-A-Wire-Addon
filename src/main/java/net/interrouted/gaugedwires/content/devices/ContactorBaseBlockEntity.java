package net.interrouted.gaugedwires.content.devices;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.patryk3211.powergrid.collections.ModdedBlockEntities;
import org.patryk3211.powergrid.collections.ModdedConfigs;
import org.patryk3211.powergrid.collections.ModdedSoundEvents;
import org.patryk3211.powergrid.electricity.contactor.ContactorBlock;
import org.patryk3211.powergrid.electricity.contactor.ContactorBlockEntity;
import org.patryk3211.powergrid.electricity.sim.ElectricWire;
import org.patryk3211.powergrid.electricity.sim.SwitchedWire;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactorBaseBlockEntity extends ContactorBlockEntity {
    protected ElectricWire coil;

    @Nullable
    protected SwitchedWire switch1;
    protected SwitchedWire switch2;

    protected int splitCooldown;

    protected boolean state;
    protected final Set<ContactorBlockEntity> external = new HashSet<>();

    protected float thresholdCurrent = 2.0f;
    protected float coilResistance = 12f;

    public ContactorBaseBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    protected void checkPos(BlockPos pos, boolean newState, List<BlockPos> checkQueue) {
        assert level != null;
        if(pos.equals(worldPosition))
            return;
        level.getBlockEntity(pos, ModdedBlockEntities.CONTACTOR.get())
                .ifPresent(be -> {
                    if(newState) {
                        be.addExternal(this);
                    } else {
                        be.removeExternal(this);
                    }
                    checkQueue.add(pos);
                });
    }

    protected void setState(boolean newState) {
        if(newState || external.isEmpty()) {
            if(switch1 != null) {
                switch1.setState(newState);
                switch2.setState(newState);
            } else if(newState) {
                electricBehaviour.rebuildCircuit(false);
            }
        }
        if(state != newState) {
            if(!level.isClientSide) {
                // Play sound
                if (newState) {
                    ModdedSoundEvents.CONTACTOR_ON.playOnServer(level, worldPosition);
                } else {
                    ModdedSoundEvents.CONTACTOR_OFF.playOnServer(level, worldPosition);
                }
            }

            var checkQueue = new ArrayList<BlockPos>();
            checkQueue.add(worldPosition);
            var checkedSet = new HashSet<BlockPos>();
            var axis = getBlockState().getValue(ContactorBlock.HORIZONTAL_AXIS);
            if (axis == Direction.Axis.X) {
                axis = Direction.Axis.Z;
            } else if (axis == Direction.Axis.Z) {
                axis = Direction.Axis.X;
            }

            while (!checkQueue.isEmpty()) {
                var checkPos = checkQueue.remove(0);
                if (!checkedSet.add(checkPos))
                    continue;
                var pos1 = checkPos.relative(axis, 1);
                checkPos(pos1, newState, checkQueue);
                var pos2 = checkPos.relative(axis, -1);
                checkPos(pos2, newState, checkQueue);
            }
        }
        state = newState;
        setChanged();
        updateComparators();
    }

    protected void updateComparators() {
        level.updateNeighbourForOutputSignal(worldPosition, getBlockState().getBlock());
    }

    @Override
    public void electricalTick() {
        applyPower(switch1);
        applyPower(switch2);
        applyPower(coil);

        var I = Math.abs(coil.current());
        if(coil.isConverged()) {
            if (I >= thresholdCurrent) {
                setState(true);
                splitCooldown = 0;
            } else if (I < thresholdCurrent * ModdedConfigs.server().electricity.holdingCurrentPercent.getF()) {
                setState(false);
            }
        }
        if(!state && external.isEmpty() && switch1 != null && splitCooldown++ >= 100) {
            electricBehaviour.rebuildCircuit(false);
        }
    }

    @Override
    public void buildCircuit(CircuitBuilder builder) {
        builder.setTerminalCount(6);
        coil = builder.connect(coilResistance, builder.terminalNode(0), builder.terminalNode(1));

        if(state || (external != null && !external.isEmpty())) {
            splitCooldown = 0;
            switch1 = builder.connectSwitch(resistance("switch"), builder.terminalNode(2), builder.terminalNode(3), state);
            switch2 = builder.connectSwitch(resistance("switch"), builder.terminalNode(4), builder.terminalNode(5), state);
        } else {
            switch1 = null;
            switch2 = null;
        }
    }
}