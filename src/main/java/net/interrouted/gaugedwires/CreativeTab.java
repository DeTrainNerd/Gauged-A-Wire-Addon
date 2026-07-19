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

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WIRES_TAB = CREATIVE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.gauged_wires"))
            .icon(() -> new ItemStack(WireItems.CREATIVE_WIRE.get()))
            .displayItems((parameters, output) -> {
                add(output,
                        WireItems.CREATIVE_WIRE,
                        // Copper Wires
                        WireItems.CU_WIRE_14AWG,
                        WireItems.CU_WIRE_12AWG,
                        WireItems.CU_WIRE_10AWG,
                        WireItems.CU_WIRE_8AWG,
                        WireItems.CU_WIRE_6AWG,
                        WireItems.CU_WIRE_4AWG,
                        WireItems.CU_WIRE_3AWG,
                        WireItems.CU_WIRE_2AWG,
                        WireItems.CU_WIRE_1AWG,
                        WireItems.CU_WIRE_0AWG,
                        WireItems.CU_WIRE_00AWG,
                        WireItems.CU_WIRE_000AWG,
                        WireItems.CU_WIRE_0000AWG,
                        WireItems.CU_WIRE_250MCM,
                        WireItems.CU_WIRE_300MCM,
                        WireItems.CU_WIRE_350MCM,
                        WireItems.CU_WIRE_400MCM,
                        WireItems.CU_WIRE_500MCM,
                        WireItems.CU_WIRE_600MCM,
                        WireItems.CU_WIRE_750MCM,
                        WireItems.CU_WIRE_1000MCM,
                        WireItems.CU_WIRE_1250MCM,
                        WireItems.CU_WIRE_1500MCM,
                        WireItems.CU_WIRE_1750MCM,
                        WireItems.CU_WIRE_2000MCM
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
