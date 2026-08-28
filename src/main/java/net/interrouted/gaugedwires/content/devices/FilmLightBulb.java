package net.interrouted.gaugedwires.content.devices;

import net.interrouted.gaugedwires.GaugedWires;
import net.interrouted.gaugedwires.content.ModPartialModels;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.fml.loading.FMLEnvironment;
import org.patryk3211.powergrid.electricity.light.bulb.IFixtureEntity;
import org.patryk3211.powergrid.electricity.light.bulb.ILightBulb;
import org.patryk3211.powergrid.electricity.light.bulb.LightBulb;
import org.patryk3211.powergrid.electricity.light.bulb.LightBulbState;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FilmLightBulb extends LightBulb {
    public FilmLightBulb(Item.Properties settings) {
        super(settings);
        this.T_max = 3200.0f; // Running Temperature
        this.R_max = 2.88f; // Warm Resistance
        this.R_min = 0.2f; // Cold Resistance
        this.thermalProperties =
                new ILightBulb.Properties(
                        7.0f,
                        50.0f,
                        3500.0f
                );
        this.power = 20000f;
        this.voltage = 240f;
    }


    @Override
    public <F extends SmartBlockEntity & IFixtureEntity> LightBulbState createState(F fixture) {
        return new State(this,
                fixture,
                this.modelSupplier = () -> state -> switch (state) {
                    case OFF -> ModPartialModels.FILM_LIGHT_BULB;
                    case LOW_POWER, ON -> ModPartialModels.FILM_LIGHT_BULB_ON;
                    case BROKEN -> ModPartialModels.FILM_LIGHT_BULB_BROKEN;
                    case LIGHT -> ModPartialModels.FILM_LIGHT_BULB_LIGHT;
                },
                dyedModelSupplier);
    }

    public static ResourceLocation model(String path) {
        return ResourceLocation.fromNamespaceAndPath(GaugedWires.MODID, path);
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

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        if (FMLEnvironment.dist.isClient())
            FilmLightBulbClientTooltip.appendTooltip(this, stack, tooltipComponents);
    }
}
