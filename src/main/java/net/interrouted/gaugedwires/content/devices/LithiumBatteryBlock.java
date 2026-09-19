package net.interrouted.gaugedwires.content.devices;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.patryk3211.powergrid.collections.ModdedBlockEntities;
import org.patryk3211.powergrid.electricity.battery.BatteryBlock;
import org.patryk3211.powergrid.electricity.battery.BatterySpec;
import org.patryk3211.powergrid.electricity.battery.MultiBlockBatteryEntity;

public class LithiumBatteryBlock extends BatteryBlock {
    public LithiumBatteryBlock(Properties settings) {
        super(settings);
    }

    @Override
    public BlockEntityType<? extends MultiBlockBatteryEntity> getBlockEntityType() {
        return ModdedBlockEntities.MULTIBLOCK_BATTERY.get();
    }

    public static boolean isBattery(BlockState state) {
        return state.getBlock() instanceof LithiumBatteryBlock;
    }
}
