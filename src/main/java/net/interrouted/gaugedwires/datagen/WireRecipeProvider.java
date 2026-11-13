package net.interrouted.gaugedwires.datagen;

import net.interrouted.gaugedwires.GaugedWires;
import net.interrouted.gaugedwires.content.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class WireRecipeProvider extends RecipeProvider {
    public WireRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        StripWires(output);
        CordCrafting(output);
        CordUncrafting(output);
        DrawPlateCrafting(output);
    }

    private void StripWires(RecipeOutput output) {
        record WireStripEntry(String size, Item input, Item output) {}
        List<WireStripEntry> WireStripEntries = List.of(
                new WireStripEntry("cu_18awg", ModItems.CU_INS_WIRE_18AWG.get(), ModItems.CU_WIRE_18AWG.get()),
                new WireStripEntry("cu_16awg",  ModItems.CU_INS_WIRE_16AWG.get(),  ModItems.CU_WIRE_16AWG.get()),
                new WireStripEntry("cu_14awg",  ModItems.CU_INS_WIRE_14AWG.get(),  ModItems.CU_WIRE_14AWG.get()),
                new WireStripEntry("cu_12awg",  ModItems.CU_INS_WIRE_12AWG.get(),  ModItems.CU_WIRE_12AWG.get()),
                new WireStripEntry("cu_10awg",  ModItems.CU_INS_WIRE_10AWG.get(),  ModItems.CU_WIRE_10AWG.get()),
                new WireStripEntry("cu_8awg",   ModItems.CU_INS_WIRE_8AWG.get(),   ModItems.CU_WIRE_8AWG.get()),
                new WireStripEntry("cu_6awg",   ModItems.CU_INS_WIRE_6AWG.get(),   ModItems.CU_WIRE_6AWG.get()),
                new WireStripEntry("cu_4awg",   ModItems.CU_INS_WIRE_4AWG.get(),   ModItems.CU_WIRE_4AWG.get()),
                new WireStripEntry("cu_3awg",   ModItems.CU_INS_WIRE_3AWG.get(),   ModItems.CU_WIRE_3AWG.get()),
                new WireStripEntry("cu_2awg",   ModItems.CU_INS_WIRE_2AWG.get(),   ModItems.CU_WIRE_2AWG.get()),
                new WireStripEntry("cu_1awg",   ModItems.CU_INS_WIRE_1AWG.get(),   ModItems.CU_WIRE_1AWG.get()),
                new WireStripEntry("cu_0awg",   ModItems.CU_INS_WIRE_0AWG.get(),   ModItems.CU_WIRE_0AWG.get()),
                new WireStripEntry("cu_00awg",   ModItems.CU_INS_WIRE_00AWG.get(),   ModItems.CU_WIRE_00AWG.get()),
                new WireStripEntry("cu_000awg",   ModItems.CU_INS_WIRE_000AWG.get(),   ModItems.CU_WIRE_000AWG.get()),
                new WireStripEntry("cu_0000awg",   ModItems.CU_INS_WIRE_0000AWG.get(),   ModItems.CU_WIRE_0000AWG.get()),
                new WireStripEntry("cu_250mcm",  ModItems.CU_INS_WIRE_250MCM.get(),  ModItems.CU_WIRE_250MCM.get()),
                new WireStripEntry("cu_300mcm",  ModItems.CU_INS_WIRE_300MCM.get(),  ModItems.CU_WIRE_300MCM.get()),
                new WireStripEntry("cu_350mcm",  ModItems.CU_INS_WIRE_350MCM.get(),  ModItems.CU_WIRE_350MCM.get()),
                new WireStripEntry("cu_400mcm",  ModItems.CU_INS_WIRE_400MCM.get(),  ModItems.CU_WIRE_400MCM.get()),
                new WireStripEntry("cu_500mcm",  ModItems.CU_INS_WIRE_500MCM.get(),  ModItems.CU_WIRE_500MCM.get()),
                new WireStripEntry("cu_600mcm",  ModItems.CU_INS_WIRE_600MCM.get(),  ModItems.CU_WIRE_600MCM.get()),
                new WireStripEntry("cu_750mcm",  ModItems.CU_INS_WIRE_750MCM.get(),  ModItems.CU_WIRE_750MCM.get()),
                new WireStripEntry("cu_1000mcm", ModItems.CU_INS_WIRE_1000MCM.get(), ModItems.CU_WIRE_1000MCM.get()),
                new WireStripEntry("cu_1250mcm", ModItems.CU_INS_WIRE_1250MCM.get(), ModItems.CU_WIRE_1250MCM.get()),
                new WireStripEntry("cu_1500mcm", ModItems.CU_INS_WIRE_1500MCM.get(), ModItems.CU_WIRE_1500MCM.get()),
                new WireStripEntry("cu_1750mcm", ModItems.CU_INS_WIRE_1750MCM.get(), ModItems.CU_WIRE_1750MCM.get()),
                new WireStripEntry("cu_2000mcm", ModItems.CU_INS_WIRE_2000MCM.get(), ModItems.CU_WIRE_2000MCM.get()),

                new WireStripEntry("al_14awg",  ModItems.AL_INS_WIRE_14AWG.get(),  ModItems.AL_WIRE_14AWG.get()),
                new WireStripEntry("al_12awg",  ModItems.AL_INS_WIRE_12AWG.get(),  ModItems.AL_WIRE_12AWG.get()),
                new WireStripEntry("al_10awg",  ModItems.AL_INS_WIRE_10AWG.get(),  ModItems.AL_WIRE_10AWG.get()),
                new WireStripEntry("al_8awg",   ModItems.AL_INS_WIRE_8AWG.get(),   ModItems.AL_WIRE_8AWG.get()),
                new WireStripEntry("al_6awg",   ModItems.AL_INS_WIRE_6AWG.get(),   ModItems.AL_WIRE_6AWG.get()),
                new WireStripEntry("al_4awg",   ModItems.AL_INS_WIRE_4AWG.get(),   ModItems.AL_WIRE_4AWG.get()),
                new WireStripEntry("al_3awg",   ModItems.AL_INS_WIRE_3AWG.get(),   ModItems.AL_WIRE_3AWG.get()),
                new WireStripEntry("al_2awg",   ModItems.AL_INS_WIRE_2AWG.get(),   ModItems.AL_WIRE_2AWG.get()),
                new WireStripEntry("al_1awg",   ModItems.AL_INS_WIRE_1AWG.get(),   ModItems.AL_WIRE_1AWG.get()),
                new WireStripEntry("al_0awg",   ModItems.AL_INS_WIRE_0AWG.get(),   ModItems.AL_WIRE_0AWG.get()),
                new WireStripEntry("al_00awg",   ModItems.AL_INS_WIRE_00AWG.get(),   ModItems.AL_WIRE_00AWG.get()),
                new WireStripEntry("al_000awg",   ModItems.AL_INS_WIRE_000AWG.get(),   ModItems.AL_WIRE_000AWG.get()),
                new WireStripEntry("al_0000awg",   ModItems.AL_INS_WIRE_0000AWG.get(),   ModItems.AL_WIRE_0000AWG.get()),
                new WireStripEntry("al_250mcm",  ModItems.AL_INS_WIRE_250MCM.get(),  ModItems.AL_WIRE_250MCM.get()),
                new WireStripEntry("al_300mcm",  ModItems.AL_INS_WIRE_300MCM.get(),  ModItems.AL_WIRE_300MCM.get()),
                new WireStripEntry("al_350mcm",  ModItems.AL_INS_WIRE_350MCM.get(),  ModItems.AL_WIRE_350MCM.get()),
                new WireStripEntry("al_400mcm",  ModItems.AL_INS_WIRE_400MCM.get(),  ModItems.AL_WIRE_400MCM.get()),
                new WireStripEntry("al_500mcm",  ModItems.AL_INS_WIRE_500MCM.get(),  ModItems.AL_WIRE_500MCM.get()),
                new WireStripEntry("al_600mcm",  ModItems.AL_INS_WIRE_600MCM.get(),  ModItems.AL_WIRE_600MCM.get()),
                new WireStripEntry("al_750mcm",  ModItems.AL_INS_WIRE_750MCM.get(),  ModItems.AL_WIRE_750MCM.get()),
                new WireStripEntry("al_1000mcm", ModItems.AL_INS_WIRE_1000MCM.get(), ModItems.AL_WIRE_1000MCM.get()),
                new WireStripEntry("al_1250mcm", ModItems.AL_INS_WIRE_1250MCM.get(), ModItems.AL_WIRE_1250MCM.get()),
                new WireStripEntry("al_1500mcm", ModItems.AL_INS_WIRE_1500MCM.get(), ModItems.AL_WIRE_1500MCM.get()),
                new WireStripEntry("al_1750mcm", ModItems.AL_INS_WIRE_1750MCM.get(), ModItems.AL_WIRE_1750MCM.get()),
                new WireStripEntry("al_2000mcm", ModItems.AL_INS_WIRE_2000MCM.get(), ModItems.AL_WIRE_2000MCM.get())
        );

        for (WireStripEntry entry : WireStripEntries) {
            SingleItemRecipeBuilder.stonecutting(
                            Ingredient.of(entry.input()),
                            RecipeCategory.MISC,
                            entry.output()
                    ).unlockedBy("has_" + entry.size(), has(entry.input()))
                    .save(output, ResourceLocation.fromNamespaceAndPath(GaugedWires.MODID, "stonecutting/strip_" + entry.size() + "_wire"));
        }
    }

    private void CordCrafting(RecipeOutput output) {
        record CordCraftEntry(String size, Item input, Item output) {}
        List<CordCraftEntry> WireStripEntries = List.of(
                new CordCraftEntry("cu_18awg",   ModItems.CU_INS_WIRE_18AWG.get(),   ModItems.CU_CORD_18AWG.get()),
                new CordCraftEntry("cu_16awg",   ModItems.CU_INS_WIRE_16AWG.get(),   ModItems.CU_CORD_16AWG.get()),
                new CordCraftEntry("cu_14awg",   ModItems.CU_INS_WIRE_14AWG.get(),   ModItems.CU_CORD_14AWG.get()),
                new CordCraftEntry("cu_12awg",   ModItems.CU_INS_WIRE_12AWG.get(),   ModItems.CU_CORD_12AWG.get()),
                new CordCraftEntry("cu_10awg",   ModItems.CU_INS_WIRE_10AWG.get(),   ModItems.CU_CORD_10AWG.get()),
                new CordCraftEntry("cu_8awg",    ModItems.CU_INS_WIRE_8AWG.get(),    ModItems.CU_CORD_8AWG.get()),
                new CordCraftEntry("cu_6awg",    ModItems.CU_INS_WIRE_6AWG.get(),    ModItems.CU_CORD_6AWG.get()),
                new CordCraftEntry("cu_4awg",    ModItems.CU_INS_WIRE_4AWG.get(),    ModItems.CU_CORD_4AWG.get()),
                new CordCraftEntry("cu_3awg",    ModItems.CU_INS_WIRE_3AWG.get(),    ModItems.CU_CORD_3AWG.get()),
                new CordCraftEntry("cu_2awg",    ModItems.CU_INS_WIRE_2AWG.get(),    ModItems.CU_CORD_2AWG.get()),
                new CordCraftEntry("cu_1awg",    ModItems.CU_INS_WIRE_1AWG.get(),    ModItems.CU_CORD_1AWG.get()),
                new CordCraftEntry("cu_0awg",    ModItems.CU_INS_WIRE_0AWG.get(),    ModItems.CU_CORD_0AWG.get()),
                new CordCraftEntry("cu_00awg",   ModItems.CU_INS_WIRE_00AWG.get(),   ModItems.CU_CORD_00AWG.get()),
                new CordCraftEntry("cu_000awg",  ModItems.CU_INS_WIRE_000AWG.get(),  ModItems.CU_CORD_000AWG.get()),
                new CordCraftEntry("cu_0000awg", ModItems.CU_INS_WIRE_0000AWG.get(), ModItems.CU_CORD_0000AWG.get()),

                new CordCraftEntry("al_14awg",   ModItems.AL_INS_WIRE_14AWG.get(),   ModItems.AL_CORD_14AWG.get()),
                new CordCraftEntry("al_12awg",   ModItems.AL_INS_WIRE_12AWG.get(),   ModItems.AL_CORD_12AWG.get()),
                new CordCraftEntry("al_10awg",   ModItems.AL_INS_WIRE_10AWG.get(),   ModItems.AL_CORD_10AWG.get()),
                new CordCraftEntry("al_8awg",    ModItems.AL_INS_WIRE_8AWG.get(),    ModItems.AL_CORD_8AWG.get()),
                new CordCraftEntry("al_6awg",    ModItems.AL_INS_WIRE_6AWG.get(),    ModItems.AL_CORD_6AWG.get()),
                new CordCraftEntry("al_4awg",    ModItems.AL_INS_WIRE_4AWG.get(),    ModItems.AL_CORD_4AWG.get()),
                new CordCraftEntry("al_3awg",    ModItems.AL_INS_WIRE_3AWG.get(),    ModItems.AL_CORD_3AWG.get()),
                new CordCraftEntry("al_2awg",    ModItems.AL_INS_WIRE_2AWG.get(),    ModItems.AL_CORD_2AWG.get()),
                new CordCraftEntry("al_1awg",    ModItems.AL_INS_WIRE_1AWG.get(),    ModItems.AL_CORD_1AWG.get()),
                new CordCraftEntry("al_0awg",    ModItems.AL_INS_WIRE_0AWG.get(),    ModItems.AL_CORD_0AWG.get()),
                new CordCraftEntry("al_00awg",   ModItems.AL_INS_WIRE_00AWG.get(),   ModItems.AL_CORD_00AWG.get()),
                new CordCraftEntry("al_000awg",  ModItems.AL_INS_WIRE_000AWG.get(),  ModItems.AL_CORD_000AWG.get()),
                new CordCraftEntry("al_0000awg", ModItems.AL_INS_WIRE_0000AWG.get(), ModItems.AL_CORD_0000AWG.get())
        );

        for (CordCraftEntry entry : WireStripEntries) {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, entry.output())
                    .requires(entry.input(), 2)
                    .requires(Items.DRIED_KELP)
                    .unlockedBy("has_" + entry.size(), has(entry.input()))
                    .save(output, ResourceLocation.fromNamespaceAndPath(GaugedWires.MODID, "crafting/shapeless/" + entry.size() + "_cord"));
        }
    }

    private void CordUncrafting(RecipeOutput output) {
        record CordStripEntry(String size, Item input, Item output) {}
        List<CordStripEntry> WireStripEntries = List.of(
                new CordStripEntry("cu_18awg",   ModItems.CU_CORD_18AWG.get(),   ModItems.CU_INS_WIRE_18AWG.get()),
                new CordStripEntry("cu_16awg",   ModItems.CU_CORD_16AWG.get(),   ModItems.CU_INS_WIRE_16AWG.get()),
                new CordStripEntry("cu_14awg",   ModItems.CU_CORD_14AWG.get(),   ModItems.CU_INS_WIRE_14AWG.get()),
                new CordStripEntry("cu_12awg",   ModItems.CU_CORD_12AWG.get(),   ModItems.CU_INS_WIRE_12AWG.get()),
                new CordStripEntry("cu_10awg",   ModItems.CU_CORD_10AWG.get(),   ModItems.CU_INS_WIRE_10AWG.get()),
                new CordStripEntry("cu_8awg",    ModItems.CU_CORD_8AWG.get(),    ModItems.CU_INS_WIRE_8AWG.get()),
                new CordStripEntry("cu_6awg",    ModItems.CU_CORD_6AWG.get(),    ModItems.CU_INS_WIRE_6AWG.get()),
                new CordStripEntry("cu_4awg",    ModItems.CU_CORD_4AWG.get(),    ModItems.CU_INS_WIRE_4AWG.get()),
                new CordStripEntry("cu_3awg",    ModItems.CU_CORD_3AWG.get(),    ModItems.CU_INS_WIRE_3AWG.get()),
                new CordStripEntry("cu_2awg",    ModItems.CU_CORD_2AWG.get(),    ModItems.CU_INS_WIRE_2AWG.get()),
                new CordStripEntry("cu_1awg",    ModItems.CU_CORD_1AWG.get(),    ModItems.CU_INS_WIRE_1AWG.get()),
                new CordStripEntry("cu_0awg",    ModItems.CU_CORD_0AWG.get(),    ModItems.CU_INS_WIRE_0AWG.get()),
                new CordStripEntry("cu_00awg",   ModItems.CU_CORD_00AWG.get(),   ModItems.CU_INS_WIRE_00AWG.get()),
                new CordStripEntry("cu_000awg",  ModItems.CU_CORD_000AWG.get(),  ModItems.CU_INS_WIRE_000AWG.get()),
                new CordStripEntry("cu_0000awg", ModItems.CU_CORD_0000AWG.get(), ModItems.CU_INS_WIRE_0000AWG.get()),

                new CordStripEntry("al_14awg",   ModItems.AL_CORD_14AWG.get(),   ModItems.AL_INS_WIRE_14AWG.get()),
                new CordStripEntry("al_12awg",   ModItems.AL_CORD_12AWG.get(),   ModItems.AL_INS_WIRE_12AWG.get()),
                new CordStripEntry("al_10awg",   ModItems.AL_CORD_10AWG.get(),   ModItems.AL_INS_WIRE_10AWG.get()),
                new CordStripEntry("al_8awg",    ModItems.AL_CORD_8AWG.get(),    ModItems.AL_INS_WIRE_8AWG.get()),
                new CordStripEntry("al_6awg",    ModItems.AL_CORD_6AWG.get(),    ModItems.AL_INS_WIRE_6AWG.get()),
                new CordStripEntry("al_4awg",    ModItems.AL_CORD_4AWG.get(),    ModItems.AL_INS_WIRE_4AWG.get()),
                new CordStripEntry("al_3awg",    ModItems.AL_CORD_3AWG.get(),    ModItems.AL_INS_WIRE_3AWG.get()),
                new CordStripEntry("al_2awg",    ModItems.AL_CORD_2AWG.get(),    ModItems.AL_INS_WIRE_2AWG.get()),
                new CordStripEntry("al_1awg",    ModItems.AL_CORD_1AWG.get(),    ModItems.AL_INS_WIRE_1AWG.get()),
                new CordStripEntry("al_0awg",    ModItems.AL_CORD_0AWG.get(),    ModItems.AL_INS_WIRE_0AWG.get()),
                new CordStripEntry("al_00awg",   ModItems.AL_CORD_00AWG.get(),   ModItems.AL_INS_WIRE_00AWG.get()),
                new CordStripEntry("al_000awg",  ModItems.AL_CORD_000AWG.get(),  ModItems.AL_INS_WIRE_000AWG.get()),
                new CordStripEntry("al_0000awg", ModItems.AL_CORD_0000AWG.get(), ModItems.AL_INS_WIRE_0000AWG.get())

        );

        for (CordStripEntry entry : WireStripEntries) {
            SingleItemRecipeBuilder.stonecutting(
                    Ingredient.of(entry.input()),
                    RecipeCategory.MISC,
                    entry.output()
                    ).unlockedBy("has_" + entry.size(), has(entry.input()))
                    .save(output, ResourceLocation.fromNamespaceAndPath(GaugedWires.MODID, "stonecutting/strip_" + entry.size() + "_cord"));
        }
    }

    private void DrawPlateCrafting(RecipeOutput output) {
        record DrawPlateEntry(String size, Item input) {}
        List<DrawPlateEntry> WireStripEntries = List.of(
                new DrawPlateEntry("18awg", ModItems.DRAW_PLATE_18AWG.get()),
                new DrawPlateEntry("16awg", ModItems.DRAW_PLATE_16AWG.get()),
                new DrawPlateEntry("14awg", ModItems.DRAW_PLATE_14AWG.get()),
                new DrawPlateEntry("12awg", ModItems.DRAW_PLATE_12AWG.get()),
                new DrawPlateEntry("10awg", ModItems.DRAW_PLATE_10AWG.get()),
                new DrawPlateEntry("8awg",  ModItems.DRAW_PLATE_8AWG.get()),
                new DrawPlateEntry("6awg",  ModItems.DRAW_PLATE_6AWG.get()),
                new DrawPlateEntry("4awg",  ModItems.DRAW_PLATE_4AWG.get()),
                new DrawPlateEntry("3awg",  ModItems.DRAW_PLATE_3AWG.get()),
                new DrawPlateEntry("2awg",  ModItems.DRAW_PLATE_2AWG.get()),
                new DrawPlateEntry("1awg",  ModItems.DRAW_PLATE_1AWG.get())
        );

        for (DrawPlateEntry entry : WireStripEntries) {
            SingleItemRecipeBuilder.stonecutting(
                            Ingredient.of(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ingots/iron"))),
                            RecipeCategory.MISC,
                            entry.input()
                    ).unlockedBy("has_" + entry.size(), has(entry.input()))
                    .save(output, ResourceLocation.fromNamespaceAndPath(GaugedWires.MODID, "stonecutting/drawplates/" + entry.size() + "_draw_plate"));
        }
    }

}
