
package simon_mc.better_mcdonalds_mod_fabric.block;

import simon_mc.better_mcdonalds_mod_fabric.init.BetterMcdonaldsModFabricModBlocks;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class SaltBlockBlock extends FallingBlock {
	public static BlockBehaviour.Properties PROPERTIES = FabricBlockSettings.of(Material.SAND).sound(SoundType.SAND).strength(0.5f);

	public SaltBlockBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(BetterMcdonaldsModFabricModBlocks.SALT_BLOCK, RenderType.solid());
	}
}
