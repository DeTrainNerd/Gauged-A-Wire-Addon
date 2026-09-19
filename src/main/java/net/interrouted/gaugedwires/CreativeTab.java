package net.interrouted.gaugedwires;


import net.interrouted.gaugedwires.content.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GaugedWires.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WIRES_TAB = CREATIVE_TABS.register("wires", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.gauged_wires.wires_tab"))
            .icon(() -> new ItemStack(ModItems.CREATIVE_WIRE.get()))
            .displayItems((parameters, output) -> {
                add(output,
                        ModItems.CREATIVE_WIRE,
                        ModItems.CREATIVE_CORD,

                        // Copper Wires
                        ModItems.CU_WIRE_14AWG,
                        ModItems.CU_WIRE_12AWG,
                        ModItems.CU_WIRE_10AWG,
                        ModItems.CU_WIRE_8AWG,
                        ModItems.CU_WIRE_6AWG,
                        ModItems.CU_WIRE_4AWG,
                        ModItems.CU_WIRE_3AWG,
                        ModItems.CU_WIRE_2AWG,
                        ModItems.CU_WIRE_1AWG,
                        ModItems.CU_WIRE_0AWG,
                        ModItems.CU_WIRE_00AWG,
                        ModItems.CU_WIRE_000AWG,
                        ModItems.CU_WIRE_0000AWG,
                        ModItems.CU_WIRE_250MCM,
                        ModItems.CU_WIRE_300MCM,
                        ModItems.CU_WIRE_350MCM,
                        ModItems.CU_WIRE_400MCM,
                        ModItems.CU_WIRE_500MCM,
                        ModItems.CU_WIRE_600MCM,
                        ModItems.CU_WIRE_750MCM,
                        ModItems.CU_WIRE_1000MCM,
                        ModItems.CU_WIRE_1250MCM,
                        ModItems.CU_WIRE_1500MCM,
                        ModItems.CU_WIRE_1750MCM,
                        ModItems.CU_WIRE_2000MCM,

                        // Copper Cords
                        ModItems.CU_CORD_14AWG,
                        ModItems.CU_CORD_12AWG,
                        ModItems.CU_CORD_10AWG,
                        ModItems.CU_CORD_8AWG,
                        ModItems.CU_CORD_6AWG,
                        ModItems.CU_CORD_4AWG,
                        ModItems.CU_CORD_3AWG,
                        ModItems.CU_CORD_2AWG,
                        ModItems.CU_CORD_1AWG,

                        // Insulated Copper Wires
                        ModItems.CU_INS_WIRE_14AWG,
                        ModItems.CU_INS_WIRE_12AWG,
                        ModItems.CU_INS_WIRE_10AWG,
                        ModItems.CU_INS_WIRE_8AWG,
                        ModItems.CU_INS_WIRE_6AWG,
                        ModItems.CU_INS_WIRE_4AWG,
                        ModItems.CU_INS_WIRE_3AWG,
                        ModItems.CU_INS_WIRE_2AWG,
                        ModItems.CU_INS_WIRE_1AWG,
                        ModItems.CU_INS_WIRE_0AWG,
                        ModItems.CU_INS_WIRE_00AWG,
                        ModItems.CU_INS_WIRE_000AWG,
                        ModItems.CU_INS_WIRE_0000AWG,
                        ModItems.CU_INS_WIRE_250MCM,
                        ModItems.CU_INS_WIRE_300MCM,
                        ModItems.CU_INS_WIRE_350MCM,
                        ModItems.CU_INS_WIRE_400MCM,
                        ModItems.CU_INS_WIRE_500MCM,
                        ModItems.CU_INS_WIRE_600MCM,
                        ModItems.CU_INS_WIRE_750MCM,
                        ModItems.CU_INS_WIRE_1000MCM,
                        ModItems.CU_INS_WIRE_1250MCM,
                        ModItems.CU_INS_WIRE_1500MCM,
                        ModItems.CU_INS_WIRE_1750MCM,
                        ModItems.CU_INS_WIRE_2000MCM,

                        // Aluminum Wires
                        ModItems.AL_WIRE_14AWG,
                        ModItems.AL_WIRE_12AWG,
                        ModItems.AL_WIRE_10AWG,
                        ModItems.AL_WIRE_8AWG,
                        ModItems.AL_WIRE_6AWG,
                        ModItems.AL_WIRE_4AWG,
                        ModItems.AL_WIRE_3AWG,
                        ModItems.AL_WIRE_2AWG,
                        ModItems.AL_WIRE_1AWG,
                        ModItems.AL_WIRE_0AWG,
                        ModItems.AL_WIRE_00AWG,
                        ModItems.AL_WIRE_000AWG,
                        ModItems.AL_WIRE_0000AWG,
                        ModItems.AL_WIRE_250MCM,
                        ModItems.AL_WIRE_300MCM,
                        ModItems.AL_WIRE_350MCM,
                        ModItems.AL_WIRE_400MCM,
                        ModItems.AL_WIRE_500MCM,
                        ModItems.AL_WIRE_600MCM,
                        ModItems.AL_WIRE_750MCM,
                        ModItems.AL_WIRE_1000MCM,
                        ModItems.AL_WIRE_1250MCM,
                        ModItems.AL_WIRE_1500MCM,
                        ModItems.AL_WIRE_1750MCM,
                        ModItems.AL_WIRE_2000MCM,

                        // Aluminum Cords
                        ModItems.AL_CORD_14AWG,
                        ModItems.AL_CORD_12AWG,
                        ModItems.AL_CORD_10AWG,
                        ModItems.AL_CORD_8AWG,
                        ModItems.AL_CORD_6AWG,
                        ModItems.AL_CORD_4AWG,
                        ModItems.AL_CORD_3AWG,
                        ModItems.AL_CORD_2AWG,
                        ModItems.AL_CORD_1AWG,

                        // Insulated Aluminum Wires
                        ModItems.AL_INS_WIRE_14AWG,
                        ModItems.AL_INS_WIRE_12AWG,
                        ModItems.AL_INS_WIRE_10AWG,
                        ModItems.AL_INS_WIRE_8AWG,
                        ModItems.AL_INS_WIRE_6AWG,
                        ModItems.AL_INS_WIRE_4AWG,
                        ModItems.AL_INS_WIRE_3AWG,
                        ModItems.AL_INS_WIRE_2AWG,
                        ModItems.AL_INS_WIRE_1AWG,
                        ModItems.AL_INS_WIRE_0AWG,
                        ModItems.AL_INS_WIRE_00AWG,
                        ModItems.AL_INS_WIRE_000AWG,
                        ModItems.AL_INS_WIRE_0000AWG,
                        ModItems.AL_INS_WIRE_250MCM,
                        ModItems.AL_INS_WIRE_300MCM,
                        ModItems.AL_INS_WIRE_350MCM,
                        ModItems.AL_INS_WIRE_400MCM,
                        ModItems.AL_INS_WIRE_500MCM,
                        ModItems.AL_INS_WIRE_600MCM,
                        ModItems.AL_INS_WIRE_750MCM,
                        ModItems.AL_INS_WIRE_1000MCM,
                        ModItems.AL_INS_WIRE_1250MCM,
                        ModItems.AL_INS_WIRE_1500MCM,
                        ModItems.AL_INS_WIRE_1750MCM,
                        ModItems.AL_INS_WIRE_2000MCM
                );

            })
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COMPONENTS_TAB = CREATIVE_TABS.register("components", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.gauged_wires.components_tab"))
            .icon(() -> new ItemStack(ModItems.CREATIVE_WIRE.get()))
            .displayItems((parameters, output) -> {
                add(output,
                        ModItems.FILM_LIGHT_BULB
                );

            })
            .build());

    @SafeVarargs
    private static void add(CreativeModeTab.Output output, DeferredItem<? extends Item>... items) {
        for (DeferredItem<? extends Item> item : items) {
            output.accept(item.get());
        }
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
