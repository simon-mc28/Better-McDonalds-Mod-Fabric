
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package simon_mc.better_mcdonalds_mod_fabric.init;

import simon_mc.better_mcdonalds_mod_fabric.item.SaltItem;
import simon_mc.better_mcdonalds_mod_fabric.BetterMcdonaldsModFabricMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BetterMcdonaldsModFabricModItems {
	public static Item SALT_BLOCK;
	public static Item SALT;

	public static void load() {
		SALT_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "salt_block"),
				new BlockItem(BetterMcdonaldsModFabricModBlocks.SALT_BLOCK, new Item.Properties().tab(BetterMcdonaldsModFabricModTabs.TAB_MOD_CREATIVE_TAB)));
		SALT = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "salt"), new SaltItem());
	}
}
