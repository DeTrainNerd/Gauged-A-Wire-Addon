package net.interrouted.gaugedwires.datagen;


import net.interrouted.gaugedwires.GaugedWires;
import net.interrouted.gaugedwires.datagen.recipes.Deploying;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = GaugedWires.MODID)
public class ModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(
                event.includeServer(),
                new WireRecipeProvider(output, lookupProvider)
        );

        generator.addProvider(
                event.includeServer(),
                new Deploying(output, lookupProvider)
        );
    }
}
