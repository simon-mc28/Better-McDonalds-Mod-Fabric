
package simon_mc.better_mcdonalds_mod_fabric.item;

import simon_mc.better_mcdonalds_mod_fabric.init.BetterMcdonaldsModFabricModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BeefPattyItem extends Item {
	public BeefPattyItem() {
		super(new Item.Properties().tab(BetterMcdonaldsModFabricModTabs.TAB_MOD_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f)

				.meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
