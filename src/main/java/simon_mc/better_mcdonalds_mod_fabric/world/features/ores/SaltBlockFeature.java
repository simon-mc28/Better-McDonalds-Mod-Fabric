
package simon_mc.better_mcdonalds_mod_fabric.world.features.ores;

import simon_mc.better_mcdonalds_mod_fabric.init.BetterMcdonaldsModFabricModBlocks;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;
import java.util.List;

public class SaltBlockFeature extends OreFeature {
	public static SaltBlockFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SaltBlockFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("better_mcdonalds_mod_fabric:salt_block", FEATURE, new OreConfiguration(SaltBlockFeatureRuleTest.INSTANCE, BetterMcdonaldsModFabricModBlocks.SALT_BLOCK.defaultBlockState(), 8));
		PLACED_FEATURE = PlacementUtils.register("better_mcdonalds_mod_fabric:salt_block", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(40), VerticalAnchor.absolute(70)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.includeByKey(ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("frozen_river")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("river")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("cold_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("frozen_ocean")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("lukewarm_ocean")),
			ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("ocean")), ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("warm_ocean")));

	public SaltBlockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class SaltBlockFeatureRuleTest extends RuleTest {
		static final SaltBlockFeatureRuleTest INSTANCE = new SaltBlockFeatureRuleTest();
		static final com.mojang.serialization.Codec<SaltBlockFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<SaltBlockFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST, new ResourceLocation("better_mcdonalds_mod_fabric:salt_block_match"), () -> codec);

		public boolean test(BlockState blockAt, RandomSource random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.SAND)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
