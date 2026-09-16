package net.interrouted.gaugedwires;


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
            .icon(() -> new ItemStack(Items.CREATIVE_WIRE.get()))
            .displayItems((parameters, output) -> {
                add(output,
                        Items.CREATIVE_WIRE,
                        Items.CREATIVE_CORD,

                        // Copper Wires
                        Items.CU_WIRE_14AWG,
                        Items.CU_WIRE_12AWG,
                        Items.CU_WIRE_10AWG,
                        Items.CU_WIRE_8AWG,
                        Items.CU_WIRE_6AWG,
                        Items.CU_WIRE_4AWG,
                        Items.CU_WIRE_3AWG,
                        Items.CU_WIRE_2AWG,
                        Items.CU_WIRE_1AWG,
                        Items.CU_WIRE_0AWG,
                        Items.CU_WIRE_00AWG,
                        Items.CU_WIRE_000AWG,
                        Items.CU_WIRE_0000AWG,
                        Items.CU_WIRE_250MCM,
                        Items.CU_WIRE_300MCM,
                        Items.CU_WIRE_350MCM,
                        Items.CU_WIRE_400MCM,
                        Items.CU_WIRE_500MCM,
                        Items.CU_WIRE_600MCM,
                        Items.CU_WIRE_750MCM,
                        Items.CU_WIRE_1000MCM,
                        Items.CU_WIRE_1250MCM,
                        Items.CU_WIRE_1500MCM,
                        Items.CU_WIRE_1750MCM,
                        Items.CU_WIRE_2000MCM,

                        // Copper Cords
                        Items.CU_CORD_14AWG,
                        Items.CU_CORD_12AWG,
                        Items.CU_CORD_10AWG,
                        Items.CU_CORD_8AWG,
                        Items.CU_CORD_6AWG,
                        Items.CU_CORD_4AWG,
                        Items.CU_CORD_3AWG,
                        Items.CU_CORD_2AWG,
                        Items.CU_CORD_1AWG,

                        // Insulated Copper Wires
                        Items.CU_INS_WIRE_14AWG,
                        Items.CU_INS_WIRE_12AWG,
                        Items.CU_INS_WIRE_10AWG,
                        Items.CU_INS_WIRE_8AWG,
                        Items.CU_INS_WIRE_6AWG,
                        Items.CU_INS_WIRE_4AWG,
                        Items.CU_INS_WIRE_3AWG,
                        Items.CU_INS_WIRE_2AWG,
                        Items.CU_INS_WIRE_1AWG,
                        Items.CU_INS_WIRE_0AWG,
                        Items.CU_INS_WIRE_00AWG,
                        Items.CU_INS_WIRE_000AWG,
                        Items.CU_INS_WIRE_0000AWG,
                        Items.CU_INS_WIRE_250MCM,
                        Items.CU_INS_WIRE_300MCM,
                        Items.CU_INS_WIRE_350MCM,
                        Items.CU_INS_WIRE_400MCM,
                        Items.CU_INS_WIRE_500MCM,
                        Items.CU_INS_WIRE_600MCM,
                        Items.CU_INS_WIRE_750MCM,
                        Items.CU_INS_WIRE_1000MCM,
                        Items.CU_INS_WIRE_1250MCM,
                        Items.CU_INS_WIRE_1500MCM,
                        Items.CU_INS_WIRE_1750MCM,
                        Items.CU_INS_WIRE_2000MCM,

                        // Aluminum Wires
                        Items.AL_WIRE_14AWG,
                        Items.AL_WIRE_12AWG,
                        Items.AL_WIRE_10AWG,
                        Items.AL_WIRE_8AWG,
                        Items.AL_WIRE_6AWG,
                        Items.AL_WIRE_4AWG,
                        Items.AL_WIRE_3AWG,
                        Items.AL_WIRE_2AWG,
                        Items.AL_WIRE_1AWG,
                        Items.AL_WIRE_0AWG,
                        Items.AL_WIRE_00AWG,
                        Items.AL_WIRE_000AWG,
                        Items.AL_WIRE_0000AWG,
                        Items.AL_WIRE_250MCM,
                        Items.AL_WIRE_300MCM,
                        Items.AL_WIRE_350MCM,
                        Items.AL_WIRE_400MCM,
                        Items.AL_WIRE_500MCM,
                        Items.AL_WIRE_600MCM,
                        Items.AL_WIRE_750MCM,
                        Items.AL_WIRE_1000MCM,
                        Items.AL_WIRE_1250MCM,
                        Items.AL_WIRE_1500MCM,
                        Items.AL_WIRE_1750MCM,
                        Items.AL_WIRE_2000MCM,

                        // Aluminum Cords
                        Items.AL_CORD_14AWG,
                        Items.AL_CORD_12AWG,
                        Items.AL_CORD_10AWG,
                        Items.AL_CORD_8AWG,
                        Items.AL_CORD_6AWG,
                        Items.AL_CORD_4AWG,
                        Items.AL_CORD_3AWG,
                        Items.AL_CORD_2AWG,
                        Items.AL_CORD_1AWG,

                        // Insulated Aluminum Wires
                        Items.AL_INS_WIRE_14AWG,
                        Items.AL_INS_WIRE_12AWG,
                        Items.AL_INS_WIRE_10AWG,
                        Items.AL_INS_WIRE_8AWG,
                        Items.AL_INS_WIRE_6AWG,
                        Items.AL_INS_WIRE_4AWG,
                        Items.AL_INS_WIRE_3AWG,
                        Items.AL_INS_WIRE_2AWG,
                        Items.AL_INS_WIRE_1AWG,
                        Items.AL_INS_WIRE_0AWG,
                        Items.AL_INS_WIRE_00AWG,
                        Items.AL_INS_WIRE_000AWG,
                        Items.AL_INS_WIRE_0000AWG,
                        Items.AL_INS_WIRE_250MCM,
                        Items.AL_INS_WIRE_300MCM,
                        Items.AL_INS_WIRE_350MCM,
                        Items.AL_INS_WIRE_400MCM,
                        Items.AL_INS_WIRE_500MCM,
                        Items.AL_INS_WIRE_600MCM,
                        Items.AL_INS_WIRE_750MCM,
                        Items.AL_INS_WIRE_1000MCM,
                        Items.AL_INS_WIRE_1250MCM,
                        Items.AL_INS_WIRE_1500MCM,
                        Items.AL_INS_WIRE_1750MCM,
                        Items.AL_INS_WIRE_2000MCM
                );

            })
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COMPONENTS_TAB = CREATIVE_TABS.register("components", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.gauged_wires.components_tab"))
            .icon(() -> new ItemStack(Items.CREATIVE_WIRE.get()))
            .displayItems((parameters, output) -> {
                add(output,
                        Items.FILM_LIGHT_BULB
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
