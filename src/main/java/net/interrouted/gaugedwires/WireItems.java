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

    // Uninsulated Aluminum Wires
    public static final DeferredItem<Item> AL_WIRE_14AWG = registerItem("al_wire_14awg", AlWire14awg::new);
    public static final DeferredItem<Item> AL_WIRE_12AWG = registerItem("al_wire_12awg", AlWire12awg::new);
    public static final DeferredItem<Item> AL_WIRE_10AWG = registerItem("al_wire_10awg", AlWire10awg::new);
    public static final DeferredItem<Item> AL_WIRE_8AWG = registerItem("al_wire_8awg", AlWire8awg::new);
    public static final DeferredItem<Item> AL_WIRE_6AWG = registerItem("al_wire_6awg", AlWire6awg::new);
    public static final DeferredItem<Item> AL_WIRE_4AWG = registerItem("al_wire_4awg", AlWire4awg::new);
    public static final DeferredItem<Item> AL_WIRE_3AWG = registerItem("al_wire_3awg", AlWire3awg::new);
    public static final DeferredItem<Item> AL_WIRE_2AWG = registerItem("al_wire_2awg", AlWire2awg::new);
    public static final DeferredItem<Item> AL_WIRE_1AWG = registerItem("al_wire_1awg", AlWire1awg::new);
    public static final DeferredItem<Item> AL_WIRE_0AWG = registerItem("al_wire_0awg", AlWire0awg::new);
    public static final DeferredItem<Item> AL_WIRE_00AWG = registerItem("al_wire_00awg", AlWire00awg::new);
    public static final DeferredItem<Item> AL_WIRE_000AWG = registerItem("al_wire_000awg", AlWire000awg::new);
    public static final DeferredItem<Item> AL_WIRE_0000AWG = registerItem("al_wire_0000awg", AlWire0000awg::new);
    public static final DeferredItem<Item> AL_WIRE_250MCM = registerItem("al_wire_250mcm", AlWire250mcm::new);
    public static final DeferredItem<Item> AL_WIRE_300MCM = registerItem("al_wire_300mcm", AlWire300mcm::new);
    public static final DeferredItem<Item> AL_WIRE_350MCM = registerItem("al_wire_350mcm", AlWire350mcm::new);
    public static final DeferredItem<Item> AL_WIRE_400MCM = registerItem("al_wire_400mcm", AlWire400mcm::new);
    public static final DeferredItem<Item> AL_WIRE_500MCM = registerItem("al_wire_500mcm", AlWire500mcm::new);
    public static final DeferredItem<Item> AL_WIRE_600MCM = registerItem("al_wire_600mcm", AlWire600mcm::new);
    public static final DeferredItem<Item> AL_WIRE_750MCM = registerItem("al_wire_750mcm", AlWire750mcm::new);
    public static final DeferredItem<Item> AL_WIRE_1000MCM = registerItem("al_wire_1000mcm", AlWire1000mcm::new);
    public static final DeferredItem<Item> AL_WIRE_1250MCM = registerItem("al_wire_1250mcm", AlWire1250mcm::new);
    public static final DeferredItem<Item> AL_WIRE_1500MCM = registerItem("al_wire_1500mcm", AlWire1500mcm::new);
    public static final DeferredItem<Item> AL_WIRE_1750MCM = registerItem("al_wire_1750mcm", AlWire1750mcm::new);
    public static final DeferredItem<Item> AL_WIRE_2000MCM = registerItem("al_wire_2000mcm", AlWire2000mcm::new);

    // Insulated Aluminum Wires
    public static final DeferredItem<Item> AL_INS_WIRE_14AWG = registerItem("al_ins_wire_14awg", AlInsWire14awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_12AWG = registerItem("al_ins_wire_12awg", AlInsWire12awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_10AWG = registerItem("al_ins_wire_10awg", AlInsWire10awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_8AWG = registerItem("al_ins_wire_8awg", AlInsWire8awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_6AWG = registerItem("al_ins_wire_6awg", AlInsWire6awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_4AWG = registerItem("al_ins_wire_4awg", AlInsWire4awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_3AWG = registerItem("al_ins_wire_3awg", AlInsWire3awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_2AWG = registerItem("al_ins_wire_2awg", AlInsWire2awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_1AWG = registerItem("al_ins_wire_1awg", AlInsWire1awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_0AWG = registerItem("al_ins_wire_0awg", AlInsWire0awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_00AWG = registerItem("al_ins_wire_00awg", AlInsWire00awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_000AWG = registerItem("al_ins_wire_000awg", AlInsWire000awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_0000AWG = registerItem("al_ins_wire_0000awg", AlInsWire0000awg::new);
    public static final DeferredItem<Item> AL_INS_WIRE_250MCM = registerItem("al_ins_wire_250mcm", AlInsWire250mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_300MCM = registerItem("al_ins_wire_300mcm", AlInsWire300mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_350MCM = registerItem("al_ins_wire_350mcm", AlInsWire350mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_400MCM = registerItem("al_ins_wire_400mcm", AlInsWire400mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_500MCM = registerItem("al_ins_wire_500mcm", AlInsWire500mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_600MCM = registerItem("al_ins_wire_600mcm", AlInsWire600mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_750MCM = registerItem("al_ins_wire_750mcm", AlInsWire750mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_1000MCM = registerItem("al_ins_wire_1000mcm", AlInsWire1000mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_1250MCM = registerItem("al_ins_wire_1250mcm", AlInsWire1250mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_1500MCM = registerItem("al_ins_wire_1500mcm", AlInsWire1500mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_1750MCM = registerItem("al_ins_wire_1750mcm", AlInsWire1750mcm::new);
    public static final DeferredItem<Item> AL_INS_WIRE_2000MCM = registerItem("al_ins_wire_2000mcm", AlInsWire2000mcm::new);


    private static DeferredItem<Item> registerItem(String name, Supplier<? extends Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
