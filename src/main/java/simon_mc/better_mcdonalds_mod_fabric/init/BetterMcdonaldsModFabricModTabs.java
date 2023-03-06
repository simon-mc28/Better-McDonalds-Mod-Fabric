
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package simon_mc.better_mcdonalds_mod_fabric.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class BetterMcdonaldsModFabricModTabs {
	public static CreativeModeTab TAB_MOD_CREATIVE_TAB;

	public static void load() {
		TAB_MOD_CREATIVE_TAB = FabricItemGroupBuilder.create(new ResourceLocation("better_mcdonalds_mod_fabric", "mod_creative_tab")).icon(() -> new ItemStack(BetterMcdonaldsModFabricModItems.HAPPY_MEAL)).build();
	}
}
