
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package simon_mc.better_mcdonalds_mod_fabric.init;

import simon_mc.better_mcdonalds_mod_fabric.item.SaltItem;
import simon_mc.better_mcdonalds_mod_fabric.item.MayonnaiseItem;
import simon_mc.better_mcdonalds_mod_fabric.item.KnifeItem;
import simon_mc.better_mcdonalds_mod_fabric.item.FriesItem;
import simon_mc.better_mcdonalds_mod_fabric.item.CookedBeefPattyItem;
import simon_mc.better_mcdonalds_mod_fabric.item.CheeseItem;
import simon_mc.better_mcdonalds_mod_fabric.item.BeefPattyItem;
import simon_mc.better_mcdonalds_mod_fabric.BetterMcdonaldsModFabricMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BetterMcdonaldsModFabricModItems {
	public static Item SALT_BLOCK;
	public static Item SALT;
	public static Item CHEESE;
	public static Item BEEF_PATTY;
	public static Item COOKED_BEEF_PATTY;
	public static Item MAYONNAISE;
	public static Item KNIFE;
	public static Item FRIES;

	public static void load() {
		SALT_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "salt_block"),
				new BlockItem(BetterMcdonaldsModFabricModBlocks.SALT_BLOCK, new Item.Properties().tab(BetterMcdonaldsModFabricModTabs.TAB_MOD_CREATIVE_TAB)));
		SALT = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "salt"), new SaltItem());
		CHEESE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "cheese"), new CheeseItem());
		BEEF_PATTY = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "beef_patty"), new BeefPattyItem());
		COOKED_BEEF_PATTY = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "cooked_beef_patty"), new CookedBeefPattyItem());
		MAYONNAISE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "mayonnaise"), new MayonnaiseItem());
		KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "knife"), new KnifeItem());
		FRIES = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "fries"), new FriesItem());
	}
}
