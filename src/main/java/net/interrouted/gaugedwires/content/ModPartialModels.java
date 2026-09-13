package net.interrouted.gaugedwires.content;

import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.interrouted.gaugedwires.GaugedWires;
import net.minecraft.resources.ResourceLocation;

public class ModPartialModels {
    public static final PartialModel FILM_LIGHT_BULB =
            PartialModel.of(
                ResourceLocation.fromNamespaceAndPath(
                    GaugedWires.MODID,
                    "block/lamps/film_light_bulb"
                )
            );

    public static final PartialModel FILM_LIGHT_BULB_ON =
            PartialModel.of(
                ResourceLocation.fromNamespaceAndPath(
                    GaugedWires.MODID,
                    "block/lamps/film_light_bulb_on"
                )
            );

    public static final PartialModel FILM_LIGHT_BULB_BROKEN =
            PartialModel.of(
                ResourceLocation.fromNamespaceAndPath(
                    GaugedWires.MODID,
                    "block/lamps/film_light_bulb_broken"
                )
            );

    public static final PartialModel FILM_LIGHT_BULB_LIGHT =
            PartialModel.of(
                ResourceLocation.fromNamespaceAndPath(
                    GaugedWires.MODID,
                    "block/lamps/film_light_bulb_light"
                )
            );

    public static void register() {}
}