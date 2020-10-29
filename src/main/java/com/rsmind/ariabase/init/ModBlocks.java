package com.rsmind.ariabase.init;

import com.rsmind.ariabase.AriaBase;
import com.rsmind.ariabase.blocks.CrystalCluster;
import com.rsmind.ariabase.blocks.InfusedGlass;
import com.rsmind.ariabase.blocks.IronManaPipe;
import com.rsmind.ariabase.blocks.Ironglass;
import com.rsmind.ariabase.blocks.ManaTankEnergy;
import com.rsmind.ariabase.blocks.ManasteelBlock;
import com.rsmind.ariabase.blocks.ManasteelOre;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AriaBase.MOD_ID);
	
	// Blocks
	public static final RegistryObject<Block> MANASTEEL_BLOCK_ENERGY = BLOCKS.register("energy_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_AIR    = BLOCKS.register(   "air_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_FIRE   = BLOCKS.register(  "fire_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_LIFE   = BLOCKS.register(  "life_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_LIGHT  = BLOCKS.register( "light_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_VOID   = BLOCKS.register(  "void_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_EARTH  = BLOCKS.register( "earth_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_WATER  = BLOCKS.register( "water_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_DEATH  = BLOCKS.register( "death_manasteel_block", ManasteelBlock::new);
	public static final RegistryObject<Block> MANASTEEL_BLOCK_SHADOW = BLOCKS.register("shadow_manasteel_block", ManasteelBlock::new);
	
	public static final RegistryObject<Block> MANASTEEL_ORE_ENERGY = BLOCKS.register("energy_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_AIR    = BLOCKS.register(   "air_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_FIRE   = BLOCKS.register(  "fire_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_LIFE   = BLOCKS.register(  "life_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_LIGHT  = BLOCKS.register( "light_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_VOID   = BLOCKS.register(  "void_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_EARTH  = BLOCKS.register( "earth_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_WATER  = BLOCKS.register( "water_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_DEATH  = BLOCKS.register( "death_manasteel_ore", ManasteelOre::new);
	public static final RegistryObject<Block> MANASTEEL_ORE_SHADOW = BLOCKS.register("shadow_manasteel_ore", ManasteelOre::new);

	public static final RegistryObject<Block> INFUSED_GLASS_ENERGY = BLOCKS.register("energy_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_AIR    = BLOCKS.register(   "air_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_FIRE   = BLOCKS.register(  "fire_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_LIFE   = BLOCKS.register(  "life_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_LIGHT  = BLOCKS.register( "light_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_VOID   = BLOCKS.register(  "void_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_EARTH  = BLOCKS.register( "earth_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_WATER  = BLOCKS.register( "water_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_DEATH  = BLOCKS.register( "death_infused_glass", InfusedGlass::new);
	public static final RegistryObject<Block> INFUSED_GLASS_SHADOW = BLOCKS.register("shadow_infused_glass", InfusedGlass::new);

	public static final RegistryObject<Block> MANA_TANK_ENERGY = BLOCKS.register("energy_mana_tank", ManaTankEnergy::new);

	public static final RegistryObject<Block> IRONGLASS = BLOCKS.register("ironglass", Ironglass::new);
	
	public static final RegistryObject<Block> IRON_MANA_PIPE = BLOCKS.register("iron_mana_pipe", IronManaPipe::new);
	
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_ENERGY = BLOCKS.register("energy_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_AIR    = BLOCKS.register(   "air_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_FIRE   = BLOCKS.register(  "fire_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_LIFE   = BLOCKS.register(  "life_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_LIGHT  = BLOCKS.register( "light_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_VOID   = BLOCKS.register(  "void_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_EARTH  = BLOCKS.register( "earth_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_WATER  = BLOCKS.register( "water_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_DEATH  = BLOCKS.register( "death_crystal_cluster", CrystalCluster::new);
	public static final RegistryObject<Block> CRYSTAL_CLUSTER_SHADOW = BLOCKS.register("shadow_crystal_cluster", CrystalCluster::new);
}
