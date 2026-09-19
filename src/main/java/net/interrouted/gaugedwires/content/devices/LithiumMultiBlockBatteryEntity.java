package net.interrouted.gaugedwires.content.devices;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.patryk3211.powergrid.electricity.battery.MultiBlockBatteryEntity;

public class LithiumMultiBlockBatteryEntity extends MultiBlockBatteryEntity {
    public LithiumMultiBlockBatteryEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
