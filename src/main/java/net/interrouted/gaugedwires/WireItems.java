package net.interrouted.gaugedwires;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.interrouted.gaugedwires.content.*;

import java.util.function.Supplier;

public class WireItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GaugedWires.MODID);

    // add wires here, following this format
    // public static final DeferredItem<Item> ITEM_ID = registerItem("item_id", ItemClass::new);
    public static final DeferredItem<Item> CREATIVE_WIRE = registerItem("creative_wire", CreativeWire::new);
    // Uninsulated Copper Wires
    public static final DeferredItem<Item> CU_WIRE_14AWG = registerItem("cu_wire_14awg", CuWire14awg::new);
    public static final DeferredItem<Item> CU_WIRE_12AWG = registerItem("cu_wire_12awg", CuWire12awg::new);
    public static final DeferredItem<Item> CU_WIRE_10AWG = registerItem("cu_wire_10awg", CuWire10awg::new);
    public static final DeferredItem<Item> CU_WIRE_8AWG = registerItem("cu_wire_8awg", CuWire8awg::new);
    public static final DeferredItem<Item> CU_WIRE_6AWG = registerItem("cu_wire_6awg", CuWire6awg::new);
    public static final DeferredItem<Item> CU_WIRE_4AWG = registerItem("cu_wire_4awg", CuWire4awg::new);
    public static final DeferredItem<Item> CU_WIRE_3AWG = registerItem("cu_wire_3awg", CuWire3awg::new);
    public static final DeferredItem<Item> CU_WIRE_2AWG = registerItem("cu_wire_2awg", CuWire2awg::new);
    public static final DeferredItem<Item> CU_WIRE_1AWG = registerItem("cu_wire_1awg", CuWire1awg::new);
    public static final DeferredItem<Item> CU_WIRE_0AWG = registerItem("cu_wire_0awg", CuWire0awg::new);
    public static final DeferredItem<Item> CU_WIRE_00AWG = registerItem("cu_wire_00awg", CuWire00awg::new);
    public static final DeferredItem<Item> CU_WIRE_000AWG = registerItem("cu_wire_000awg", CuWire000awg::new);
    public static final DeferredItem<Item> CU_WIRE_0000AWG = registerItem("cu_wire_0000awg", CuWire0000awg::new);
    public static final DeferredItem<Item> CU_WIRE_250MCM = registerItem("cu_wire_250mcm", CuWire250mcm::new);
    public static final DeferredItem<Item> CU_WIRE_300MCM = registerItem("cu_wire_300mcm", CuWire300mcm::new);
    public static final DeferredItem<Item> CU_WIRE_350MCM = registerItem("cu_wire_350mcm", CuWire350mcm::new);
    public static final DeferredItem<Item> CU_WIRE_400MCM = registerItem("cu_wire_400mcm", CuWire400mcm::new);
    public static final DeferredItem<Item> CU_WIRE_500MCM = registerItem("cu_wire_500mcm", CuWire500mcm::new);
    public static final DeferredItem<Item> CU_WIRE_600MCM = registerItem("cu_wire_600mcm", CuWire600mcm::new);
    public static final DeferredItem<Item> CU_WIRE_750MCM = registerItem("cu_wire_750mcm", CuWire750mcm::new);
    public static final DeferredItem<Item> CU_WIRE_1000MCM = registerItem("cu_wire_1000mcm", CuWire1000mcm::new);
    public static final DeferredItem<Item> CU_WIRE_1250MCM = registerItem("cu_wire_1250mcm", CuWire1250mcm::new);
    public static final DeferredItem<Item> CU_WIRE_1500MCM = registerItem("cu_wire_1500mcm", CuWire1500mcm::new);
    public static final DeferredItem<Item> CU_WIRE_1750MCM = registerItem("cu_wire_1750mcm", CuWire1750mcm::new);
    public static final DeferredItem<Item> CU_WIRE_2000MCM = registerItem("cu_wire_2000mcm", CuWire2000mcm::new);
    // Insulated Copper Wires
    public static final DeferredItem<Item> CU_INS_WIRE_14AWG = registerItem("cu_ins_wire_14awg", CuInsWire14awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_12AWG = registerItem("cu_ins_wire_12awg", CuInsWire12awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_10AWG = registerItem("cu_ins_wire_10awg", CuInsWire10awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_8AWG = registerItem("cu_ins_wire_8awg", CuInsWire8awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_6AWG = registerItem("cu_ins_wire_6awg", CuInsWire6awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_4AWG = registerItem("cu_ins_wire_4awg", CuInsWire4awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_3AWG = registerItem("cu_ins_wire_3awg", CuInsWire3awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_2AWG = registerItem("cu_ins_wire_2awg", CuInsWire2awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_1AWG = registerItem("cu_ins_wire_1awg", CuInsWire1awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_0AWG = registerItem("cu_ins_wire_0awg", CuInsWire0awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_00AWG = registerItem("cu_ins_wire_00awg", CuInsWire00awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_000AWG = registerItem("cu_ins_wire_000awg", CuInsWire000awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_0000AWG = registerItem("cu_ins_wire_0000awg", CuInsWire0000awg::new);
    public static final DeferredItem<Item> CU_INS_WIRE_250MCM = registerItem("cu_ins_wire_250mcm", CuInsWire250mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_300MCM = registerItem("cu_ins_wire_300mcm", CuInsWire300mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_350MCM = registerItem("cu_ins_wire_350mcm", CuInsWire350mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_400MCM = registerItem("cu_ins_wire_400mcm", CuInsWire400mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_500MCM = registerItem("cu_ins_wire_500mcm", CuInsWire500mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_600MCM = registerItem("cu_ins_wire_600mcm", CuInsWire600mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_750MCM = registerItem("cu_ins_wire_750mcm", CuInsWire750mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_1000MCM = registerItem("cu_ins_wire_1000mcm", CuInsWire1000mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_1250MCM = registerItem("cu_ins_wire_1250mcm", CuInsWire1250mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_1500MCM = registerItem("cu_ins_wire_1500mcm", CuInsWire1500mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_1750MCM = registerItem("cu_ins_wire_1750mcm", CuInsWire1750mcm::new);
    public static final DeferredItem<Item> CU_INS_WIRE_2000MCM = registerItem("cu_ins_wire_2000mcm", CuInsWire2000mcm::new);


    private static DeferredItem<Item> registerItem(String name, Supplier<? extends Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
