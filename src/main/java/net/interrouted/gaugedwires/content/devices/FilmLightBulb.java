package net.interrouted.gaugedwires.content.devices;

import net.minecraft.world.item.Item;

import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import org.patryk3211.powergrid.electricity.light.bulb.IFixtureEntity;
import org.patryk3211.powergrid.electricity.light.bulb.ILightBulb;
import org.patryk3211.powergrid.electricity.light.bulb.LightBulb;
import org.patryk3211.powergrid.electricity.light.bulb.LightBulbState;

import java.util.function.Function;
import java.util.function.Supplier;

public class FilmLightBulb extends LightBulb {
    public FilmLightBulb(Item.Properties settings) {
        super(settings);
        this.T_max = 1800.0f; // Running Temperature
        this.R_max = 240.0f; // Warm Resistance
        this.R_min = 15.0f; // Cold Resistance
        this.thermalProperties =
                new ILightBulb.Properties(
                        0.04f,
                        10.0f,
                        2200.0f
                );
    }

    @Override
    public <F extends SmartBlockEntity & IFixtureEntity> LightBulbState createState(F fixture) {
        return new State(this, fixture, modelSupplier, dyedModelSupplier);
    }

    public static class State extends SimpleState {
        public <T extends Item & ILightBulb,
                F extends SmartBlockEntity & IFixtureEntity> State(
                T bulb,
                F fixture,
                Supplier<Function<LightBulb.State, PartialModel>> modelProviderSupplier,
                Supplier<Function<DyedState, PartialModel>> dyedModelProviderSupplier) {
            super(bulb, fixture, modelProviderSupplier, dyedModelProviderSupplier);
        }

        @Override
        protected void updatePowerLevel(int newLevel) {
            super.updatePowerLevel(Math.min(newLevel, 1));
        }
    }
}
