
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package simon_mc.better_mcdonalds_mod_fabric.init;

import simon_mc.better_mcdonalds_mod_fabric.block.SaltBlockBlock;
import simon_mc.better_mcdonalds_mod_fabric.BetterMcdonaldsModFabricMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class BetterMcdonaldsModFabricModBlocks {
	public static Block SALT_BLOCK;

	public static void load() {
		SALT_BLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(BetterMcdonaldsModFabricMod.MODID, "salt_block"), new SaltBlockBlock());
	}

	public static void clientLoad() {
		SaltBlockBlock.clientInit();
	}
}
