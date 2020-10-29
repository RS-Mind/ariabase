package com.rsmind.ariabase.init;

import com.rsmind.ariabase.AriaBase;
import com.rsmind.ariabase.tileentity.ManaTankTileEntityEnergy;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, AriaBase.MOD_ID);
	
	//Tile Entities
	public static final RegistryObject<TileEntityType<ManaTankTileEntityEnergy>> ENERGY_MANA_TANK = TILE_ENTITY_TYPES.register("energy_mana_tank", () -> TileEntityType.Builder.create(ManaTankTileEntityEnergy::new, ModBlocks.MANA_TANK_ENERGY.get()).build(null));
}
