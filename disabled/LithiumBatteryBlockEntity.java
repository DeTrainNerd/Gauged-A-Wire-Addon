package net.interrouted.gaugedwires.content.devices;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.patryk3211.powergrid.electricity.battery.BatteryBlockEntity;
import org.patryk3211.powergrid.electricity.battery.BatterySpec;

public class LithiumBatteryBlockEntity extends BatteryBlockEntity {
    protected BatterySpec spec = new BatterySpec(
            () -> 0, // Initial Charge (joules) (multiply joules by 3600 to get watt-hours)
            () -> 5280 * 3600, // Max Charge (joules)
            e -> 0.012 + 0.07 * Math.exp(e / -0.035) + Math.pow(0.003 * e, 8) , // Resistance function
            e -> 13.20 - 2.70 / (1 + Math.exp((e - 0.08) / 0.025)) + 0.30 / (1 + Math.exp(-(e - 0.90) / 0.04)) // Voltage Function
    );

    public LithiumBatteryBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public BatterySpec getSpec() {
        return spec;
    }
}
