package net.interrouted.gaugedwires.content.devices;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class Contactor120vBlockEntity extends ContactorBaseBlockEntity {
    protected float thresholdCurrent = 1.0f;
    protected float coilResistance = 120f;

    public Contactor120vBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
