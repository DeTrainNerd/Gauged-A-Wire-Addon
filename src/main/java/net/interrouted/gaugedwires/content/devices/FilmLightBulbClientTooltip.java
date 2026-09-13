package net.interrouted.gaugedwires.content.devices;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public class FilmLightBulbClientTooltip {

	public static void appendTooltip(FilmLightBulb bulb, ItemStack stack, List<Component> tooltipComponents) {
		final boolean holdingShift = Screen.hasShiftDown();
		if (holdingShift)
			bulb.appendProperties(stack, Minecraft.getInstance().player, tooltipComponents);
		else
			tooltipComponents.add(propertiesHeader(false));

	}

	private static Component propertiesHeader(boolean holdingShift) {
		final String[] headerParts = Component.translatable("powergrid.tooltip.holdForDescription", "$").getString().split("\\$");
		final MutableComponent keyComponent = Component.translatable("create.tooltip.keyShift").copy()
				.withStyle(holdingShift ? ChatFormatting.WHITE : ChatFormatting.GRAY);
		return Component.empty().append(Component.literal(headerParts[0]).withStyle(ChatFormatting.DARK_GRAY)).append(keyComponent)
				.append(Component.literal(headerParts[1]).withStyle(ChatFormatting.DARK_GRAY));
	}
}