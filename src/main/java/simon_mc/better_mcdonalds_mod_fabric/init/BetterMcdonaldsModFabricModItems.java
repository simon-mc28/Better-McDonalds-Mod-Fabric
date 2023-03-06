
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package simon_mc.better_mcdonalds_mod_fabric.init;

import simon_mc.better_mcdonalds_mod_fabric.item.SweetSourSauceItem;
import simon_mc.better_mcdonalds_mod_fabric.item.SpriteItem;
import simon_mc.better_mcdonalds_mod_fabric.item.SaltItem;
import simon_mc.better_mcdonalds_mod_fabric.item.McChickenItem;
import simon_mc.better_mcdonalds_mod_fabric.item.MayonnaiseItem;
import simon_mc.better_mcdonalds_mod_fabric.item.LiptonIceTeaPeachItem;
import simon_mc.better_mcdonalds_mod_fabric.item.KnifeItem;
import simon_mc.better_mcdonalds_mod_fabric.item.HamburgerItem;
import simon_mc.better_mcdonalds_mod_fabric.item.FriesItem;
import simon_mc.better_mcdonalds_mod_fabric.item.FiletOFishItem;
import simon_mc.better_mcdonalds_mod_fabric.item.FantaItem;
import simon_mc.better_mcdonalds_mod_fabric.item.CookedBeefPattyItem;
import simon_mc.better_mcdonalds_mod_fabric.item.CocaColaItem;
import simon_mc.better_mcdonalds_mod_fabric.item.ChickenburgerItem;
import simon_mc.better_mcdonalds_mod_fabric.item.ChickenNuggetsItem;
import simon_mc.better_mcdonalds_mod_fabric.item.CheeseburgerItem;
import simon_mc.better_mcdonalds_mod_fabric.item.CheeseItem;
import simon_mc.better_mcdonalds_mod_fabric.item.BigMacItem;
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
	public static Item SWEET_SOUR_SAUCE;
	public static Item HAMBURGER;
	public static Item CHEESEBURGER;
	public static Item BIG_MAC;
	public static Item CHICKENBURGER;
	public static Item MC_CHICKEN;
	public static Item FILET_O_FISH;
	public static Item CHICKEN_NUGGETS;
	public static Item FRIES;
	public static Item COCA_COLA;
	public static Item FANTA;
	public static Item SPRITE;
	public static Item LIPTON_ICE_TEA_PEACH;
	public static Item KNIFE;

	public static void load() {
		SALT_BLOCK = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "salt_block"),
				new BlockItem(BetterMcdonaldsModFabricModBlocks.SALT_BLOCK, new Item.Properties().tab(BetterMcdonaldsModFabricModTabs.TAB_MOD_CREATIVE_TAB)));
		SALT = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "salt"), new SaltItem());
		CHEESE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "cheese"), new CheeseItem());
		BEEF_PATTY = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "beef_patty"), new BeefPattyItem());
		COOKED_BEEF_PATTY = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "cooked_beef_patty"), new CookedBeefPattyItem());
		MAYONNAISE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "mayonnaise"), new MayonnaiseItem());
		SWEET_SOUR_SAUCE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "sweet_sour_sauce"), new SweetSourSauceItem());
		HAMBURGER = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "hamburger"), new HamburgerItem());
		CHEESEBURGER = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "cheeseburger"), new CheeseburgerItem());
		BIG_MAC = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "big_mac"), new BigMacItem());
		CHICKENBURGER = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "chickenburger"), new ChickenburgerItem());
		MC_CHICKEN = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "mc_chicken"), new McChickenItem());
		FILET_O_FISH = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "filet_o_fish"), new FiletOFishItem());
		CHICKEN_NUGGETS = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "chicken_nuggets"), new ChickenNuggetsItem());
		FRIES = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "fries"), new FriesItem());
		COCA_COLA = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "coca_cola"), new CocaColaItem());
		FANTA = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "fanta"), new FantaItem());
		SPRITE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "sprite"), new SpriteItem());
		LIPTON_ICE_TEA_PEACH = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "lipton_ice_tea_peach"), new LiptonIceTeaPeachItem());
		KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "knife"), new KnifeItem());
	}
}
