
package simon_mc.better_mcdonalds_mod_fabric.item;

import simon_mc.better_mcdonalds_mod_fabric.init.BetterMcdonaldsModFabricModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SaltItem extends Item {
	public SaltItem() {
		super(new Item.Properties().tab(BetterMcdonaldsModFabricModTabs.TAB_MOD_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
