package com.rsmind.ariabase.world.gen;

import com.rsmind.ariabase.AriaBase;
import com.rsmind.ariabase.init.ModBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = AriaBase.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClusterGen {
	public static OreFeatureConfig.FillerBlockType CAVE_AIR =  OreFeatureConfig.FillerBlockType.create("CAVE_AIR", "cave_air", new BlockMatcher(Blocks.CAVE_AIR));
	
	@SubscribeEvent
    public static void generateClusters(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
        	if (biome.getCategory() == Biome.Category.NETHER) {
        		
        	}
        	else if (biome.getCategory() == Biome.Category.THEEND) {
        		
        	}
        	else {
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_ENERGY.get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_AIR   .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_FIRE  .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_LIFE  .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_LIGHT .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_VOID  .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_EARTH .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_WATER .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_DEATH .get().getDefaultState(), 3);
        		genOre(biome, 5, 0, 5, 150, CAVE_AIR, ModBlocks.CRYSTAL_CLUSTER_SHADOW.get().getDefaultState(), 3);
        	}
        }
    }
	
	private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler,
			BlockState defaultBlockState, int size) {
		CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
		OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
		ConfiguredPlacement<CountRangeConfig> config = Placement.COUNT_RANGE.configure(range);
		biome.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.ORE.withConfiguration(feature).withPlacement(config));
	}
}