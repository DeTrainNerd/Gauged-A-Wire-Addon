package net.interrouted.gaugedwires.datagen.recipes;

import com.simibubi.create.api.data.recipe.DeployingRecipeGen;
import net.interrouted.gaugedwires.GaugedWires;
import net.interrouted.gaugedwires.content.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Deploying extends DeployingRecipeGen {
    public Deploying(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, GaugedWires.MODID);
        BuildRecipes();
    }

    private void BuildRecipes() {
        record WireInsulateEntry(String id, Item input, Item output) {}
        List<WireInsulateEntry> WireInsulateEntries = List.of(
                new WireInsulateEntry("cu_ins_18awg",  ModItems.CU_WIRE_18AWG.get(),  ModItems.CU_INS_WIRE_18AWG.get()),
                new WireInsulateEntry("cu_ins_16awg",  ModItems.CU_WIRE_16AWG.get(),  ModItems.CU_INS_WIRE_16AWG.get()),
                new WireInsulateEntry("cu_ins_14awg",  ModItems.CU_WIRE_14AWG.get(),  ModItems.CU_INS_WIRE_14AWG.get()),
                new WireInsulateEntry("cu_ins_12awg",  ModItems.CU_WIRE_12AWG.get(),  ModItems.CU_INS_WIRE_12AWG.get()),
                new WireInsulateEntry("cu_ins_10awg",  ModItems.CU_WIRE_10AWG.get(),  ModItems.CU_INS_WIRE_10AWG.get()),
                new WireInsulateEntry("cu_ins_8awg",   ModItems.CU_WIRE_8AWG.get(),   ModItems.CU_INS_WIRE_8AWG.get()),
                new WireInsulateEntry("cu_ins_6awg",   ModItems.CU_WIRE_6AWG.get(),   ModItems.CU_INS_WIRE_6AWG.get()),
                new WireInsulateEntry("cu_ins_4awg",   ModItems.CU_WIRE_4AWG.get(),   ModItems.CU_INS_WIRE_4AWG.get()),
                new WireInsulateEntry("cu_ins_3awg",   ModItems.CU_WIRE_3AWG.get(),   ModItems.CU_INS_WIRE_3AWG.get()),
                new WireInsulateEntry("cu_ins_2awg",   ModItems.CU_WIRE_2AWG.get(),   ModItems.CU_INS_WIRE_2AWG.get()),
                new WireInsulateEntry("cu_ins_1awg",   ModItems.CU_WIRE_1AWG.get(),   ModItems.CU_INS_WIRE_1AWG.get()),
                new WireInsulateEntry("cu_ins_0awg",   ModItems.CU_WIRE_0AWG.get(),   ModItems.CU_INS_WIRE_0AWG.get()),
                new WireInsulateEntry("cu_ins_00awg",  ModItems.CU_WIRE_00AWG.get(),  ModItems.CU_INS_WIRE_00AWG.get()),
                new WireInsulateEntry("cu_ins_000awg", ModItems.CU_WIRE_000AWG.get(), ModItems.CU_INS_WIRE_000AWG.get()),
                new WireInsulateEntry("cu_ins_0000awg", ModItems.CU_WIRE_0000AWG.get(), ModItems.CU_INS_WIRE_0000AWG.get()),
                new WireInsulateEntry("cu_ins_250mcm",  ModItems.CU_WIRE_250MCM.get(),  ModItems.CU_INS_WIRE_250MCM.get()),
                new WireInsulateEntry("cu_ins_300mcm",  ModItems.CU_WIRE_300MCM.get(),  ModItems.CU_INS_WIRE_300MCM.get()),
                new WireInsulateEntry("cu_ins_350mcm",  ModItems.CU_WIRE_350MCM.get(),  ModItems.CU_INS_WIRE_350MCM.get()),
                new WireInsulateEntry("cu_ins_400mcm",  ModItems.CU_WIRE_400MCM.get(),  ModItems.CU_INS_WIRE_400MCM.get()),
                new WireInsulateEntry("cu_ins_500mcm",  ModItems.CU_WIRE_500MCM.get(),  ModItems.CU_INS_WIRE_500MCM.get()),
                new WireInsulateEntry("cu_ins_600mcm",  ModItems.CU_WIRE_600MCM.get(),  ModItems.CU_INS_WIRE_600MCM.get()),
                new WireInsulateEntry("cu_ins_750mcm",  ModItems.CU_WIRE_750MCM.get(),  ModItems.CU_INS_WIRE_750MCM.get()),
                new WireInsulateEntry("cu_ins_1000mcm", ModItems.CU_WIRE_1000MCM.get(), ModItems.CU_INS_WIRE_1000MCM.get()),
                new WireInsulateEntry("cu_ins_1250mcm", ModItems.CU_WIRE_1250MCM.get(), ModItems.CU_INS_WIRE_1250MCM.get()),
                new WireInsulateEntry("cu_ins_1500mcm", ModItems.CU_WIRE_1500MCM.get(), ModItems.CU_INS_WIRE_1500MCM.get()),
                new WireInsulateEntry("cu_ins_1750mcm", ModItems.CU_WIRE_1750MCM.get(), ModItems.CU_INS_WIRE_1750MCM.get()),
                new WireInsulateEntry("cu_ins_2000mcm", ModItems.CU_WIRE_2000MCM.get(), ModItems.CU_INS_WIRE_2000MCM.get()),

                new WireInsulateEntry("al_ins_14awg",  ModItems.AL_WIRE_14AWG.get(),  ModItems.AL_INS_WIRE_14AWG.get()),
                new WireInsulateEntry("al_ins_12awg",  ModItems.AL_WIRE_12AWG.get(),  ModItems.AL_INS_WIRE_12AWG.get()),
                new WireInsulateEntry("al_ins_10awg",  ModItems.AL_WIRE_10AWG.get(),  ModItems.AL_INS_WIRE_10AWG.get()),
                new WireInsulateEntry("al_ins_8awg",   ModItems.AL_WIRE_8AWG.get(),   ModItems.AL_INS_WIRE_8AWG.get()),
                new WireInsulateEntry("al_ins_6awg",   ModItems.AL_WIRE_6AWG.get(),   ModItems.AL_INS_WIRE_6AWG.get()),
                new WireInsulateEntry("al_ins_4awg",   ModItems.AL_WIRE_4AWG.get(),   ModItems.AL_INS_WIRE_4AWG.get()),
                new WireInsulateEntry("al_ins_3awg",   ModItems.AL_WIRE_3AWG.get(),   ModItems.AL_INS_WIRE_3AWG.get()),
                new WireInsulateEntry("al_ins_2awg",   ModItems.AL_WIRE_2AWG.get(),   ModItems.AL_INS_WIRE_2AWG.get()),
                new WireInsulateEntry("al_ins_1awg",   ModItems.AL_WIRE_1AWG.get(),   ModItems.AL_INS_WIRE_1AWG.get()),
                new WireInsulateEntry("al_ins_0awg",   ModItems.AL_WIRE_0AWG.get(),   ModItems.AL_INS_WIRE_0AWG.get()),
                new WireInsulateEntry("al_ins_00awg",  ModItems.AL_WIRE_00AWG.get(),  ModItems.AL_INS_WIRE_00AWG.get()),
                new WireInsulateEntry("al_ins_000awg", ModItems.AL_WIRE_000AWG.get(), ModItems.AL_INS_WIRE_000AWG.get()),
                new WireInsulateEntry("al_ins_0000awg", ModItems.AL_WIRE_0000AWG.get(), ModItems.AL_INS_WIRE_0000AWG.get()),
                new WireInsulateEntry("al_ins_250mcm",  ModItems.AL_WIRE_250MCM.get(),  ModItems.AL_INS_WIRE_250MCM.get()),
                new WireInsulateEntry("al_ins_300mcm",  ModItems.AL_WIRE_300MCM.get(),  ModItems.AL_INS_WIRE_300MCM.get()),
                new WireInsulateEntry("al_ins_350mcm",  ModItems.AL_WIRE_350MCM.get(),  ModItems.AL_INS_WIRE_350MCM.get()),
                new WireInsulateEntry("al_ins_400mcm",  ModItems.AL_WIRE_400MCM.get(),  ModItems.AL_INS_WIRE_400MCM.get()),
                new WireInsulateEntry("al_ins_500mcm",  ModItems.AL_WIRE_500MCM.get(),  ModItems.AL_INS_WIRE_500MCM.get()),
                new WireInsulateEntry("al_ins_600mcm",  ModItems.AL_WIRE_600MCM.get(),  ModItems.AL_INS_WIRE_600MCM.get()),
                new WireInsulateEntry("al_ins_750mcm",  ModItems.AL_WIRE_750MCM.get(),  ModItems.AL_INS_WIRE_750MCM.get()),
                new WireInsulateEntry("al_ins_1000mcm", ModItems.AL_WIRE_1000MCM.get(), ModItems.AL_INS_WIRE_1000MCM.get()),
                new WireInsulateEntry("al_ins_1250mcm", ModItems.AL_WIRE_1250MCM.get(), ModItems.AL_INS_WIRE_1250MCM.get()),
                new WireInsulateEntry("al_ins_1500mcm", ModItems.AL_WIRE_1500MCM.get(), ModItems.AL_INS_WIRE_1500MCM.get()),
                new WireInsulateEntry("al_ins_1750mcm", ModItems.AL_WIRE_1750MCM.get(), ModItems.AL_INS_WIRE_1750MCM.get()),
                new WireInsulateEntry("al_ins_2000mcm", ModItems.AL_WIRE_2000MCM.get(), ModItems.AL_INS_WIRE_2000MCM.get())
        );

        for (WireInsulateEntry entry : WireInsulateEntries) {
            create(
                    "deploying/insulate_" + entry.id(), b -> b
                            .require(entry.input())
                            .require(Items.DRIED_KELP)
                            .output(entry.output())
            );
        }
    }
}
