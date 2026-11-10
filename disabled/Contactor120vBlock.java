package net.interrouted.gaugedwires.content.devices;

import net.interrouted.gaugedwires.Lang;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.patryk3211.powergrid.config.ThermalValues;
import org.patryk3211.powergrid.electricity.info.Current;
import org.patryk3211.powergrid.electricity.info.Resistance;
import org.patryk3211.powergrid.electricity.info.Voltage;

import java.util.List;

public class Contactor120vBlock extends ContactorBaseBlock {
    public static final Component SWITCH1 = Lang.builder()
            .translate("contactor.switch1")
            .style(ChatFormatting.GRAY)
            .component();
    public static final Component SWITCH2 = Lang.builder()
            .translate("contactor.switch2")
            .style(ChatFormatting.GRAY)
            .component();

    public Contactor120vBlock(Properties settings) {
        super(settings);
        setTerminalCollection(horizontalZTerminals(this, TERMINALS_NORTH, SHAPE_NORTH));
    }

    @Override
    public void appendProperties(ItemStack stack, Player player, List<Component> tooltip) {
        Resistance.coil(120, player, tooltip);
        Voltage.rated(120, player, tooltip);
        Resistance.switchResistance(resistance("switch"), player, tooltip);
        // Subtract the coil's rated power.
        Current.max(resistance("switch"), ThermalValues.getPower(this) - 48, player, tooltip);
    }
}
