package com.rsmind.ariabase.init;

import com.rsmind.ariabase.AriaBase;
import com.rsmind.ariabase.blocks.BlockItemBase;
import com.rsmind.ariabase.items.ItemBase;
import com.rsmind.ariabase.items.RawAirManaCrystal;
import com.rsmind.ariabase.items.RawDeathManaCrystal;
import com.rsmind.ariabase.items.RawEarthManaCrystal;
import com.rsmind.ariabase.items.RawEnergyManaCrystal;
import com.rsmind.ariabase.items.RawFireManaCrystal;
import com.rsmind.ariabase.items.RawLifeManaCrystal;
import com.rsmind.ariabase.items.RawLightManaCrystal;
import com.rsmind.ariabase.items.RawShadowManaCrystal;
import com.rsmind.ariabase.items.RawVoidManaCrystal;
import com.rsmind.ariabase.items.RawWaterManaCrystal;
import com.rsmind.ariabase.util.enums.ModArmorMaterial;
import com.rsmind.ariabase.util.enums.ModItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AriaBase.MOD_ID);
	
	// Items
	public static final RegistryObject<Item> MANASTEEL_INGOT_ENERGY = ITEMS.register("energy_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_AIR    = ITEMS.register(   "air_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_FIRE   = ITEMS.register(  "fire_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_LIFE   = ITEMS.register(  "life_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_LIGHT  = ITEMS.register( "light_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_VOID   = ITEMS.register(  "void_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_EARTH  = ITEMS.register( "earth_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_WATER  = ITEMS.register( "water_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_DEATH  = ITEMS.register( "death_manasteel_ingot", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_INGOT_SHADOW = ITEMS.register("shadow_manasteel_ingot", ItemBase::new);
	
	public static final RegistryObject<Item> MANASTEEL_NUGGET_ENERGY = ITEMS.register("energy_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_AIR    = ITEMS.register(   "air_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_FIRE   = ITEMS.register(  "fire_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_LIFE   = ITEMS.register(  "life_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_LIGHT  = ITEMS.register( "light_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_VOID   = ITEMS.register(  "void_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_EARTH  = ITEMS.register( "earth_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_WATER  = ITEMS.register( "water_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_DEATH  = ITEMS.register( "death_manasteel_nugget", ItemBase::new);
	public static final RegistryObject<Item> MANASTEEL_NUGGET_SHADOW = ITEMS.register("shadow_manasteel_nugget", ItemBase::new);
	
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_ENERGY = ITEMS.register("raw_energy_mana_crystal", RawEnergyManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_AIR    = ITEMS.register(   "raw_air_mana_crystal", RawAirManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_FIRE   = ITEMS.register(  "raw_fire_mana_crystal", RawFireManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_LIFE   = ITEMS.register(  "raw_life_mana_crystal", RawLifeManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_LIGHT  = ITEMS.register( "raw_light_mana_crystal", RawLightManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_VOID   = ITEMS.register(  "raw_void_mana_crystal", RawVoidManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_EARTH  = ITEMS.register( "raw_earth_mana_crystal", RawEarthManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_WATER  = ITEMS.register( "raw_water_mana_crystal", RawWaterManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_DEATH  = ITEMS.register( "raw_death_mana_crystal", RawDeathManaCrystal::new);
	public static final RegistryObject<Item> RAW_MANA_CRYSTAL_SHADOW = ITEMS.register("raw_shadow_mana_crystal", RawShadowManaCrystal::new);
	
	//Tools
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_ENERGY   = ITEMS.register(  "energy_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_ENERGY,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_ENERGY  = ITEMS.register( "energy_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_ENERGY, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_ENERGY = ITEMS.register("energy_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_ENERGY,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_ENERGY     = ITEMS.register(    "energy_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_ENERGY,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_ENERGY     = ITEMS.register(    "energy_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_ENERGY,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final   RegistryObject<SwordItem> MANASTEEL_SWORD_AIR   = ITEMS.register(  "air_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_AIR,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final  RegistryObject<ShovelItem> MANASTEEL_SHOVEL_AIR  = ITEMS.register( "air_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_AIR, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_AIR = ITEMS.register("air_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_AIR,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final     RegistryObject<AxeItem> MANASTEEL_AXE_AIR     = ITEMS.register(    "air_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_AIR,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final     RegistryObject<HoeItem> MANASTEEL_HOE_AIR     = ITEMS.register(    "air_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_AIR,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_FIRE   = ITEMS.register(  "fire_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_FIRE,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_FIRE  = ITEMS.register( "fire_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_FIRE, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_FIRE = ITEMS.register("fire_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_FIRE,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_FIRE     = ITEMS.register(    "fire_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_FIRE,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_FIRE     = ITEMS.register(    "fire_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_FIRE,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_LIFE   = ITEMS.register(  "life_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_LIFE,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_LIFE  = ITEMS.register( "life_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_LIFE, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_LIFE = ITEMS.register("life_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_LIFE,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_LIFE     = ITEMS.register(    "life_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_LIFE,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_LIFE     = ITEMS.register(    "life_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_LIFE,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_LIGHT   = ITEMS.register(  "light_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_LIGHT,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_LIGHT  = ITEMS.register( "light_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_LIGHT, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_LIGHT = ITEMS.register("light_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_LIGHT,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_LIGHT     = ITEMS.register(    "light_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_LIGHT,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_LIGHT     = ITEMS.register(    "light_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_LIGHT,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>    MANASTEEL_SWORD_VOID  = ITEMS.register(  "void_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_VOID,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_VOID  = ITEMS.register( "void_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_VOID, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_VOID = ITEMS.register("void_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_VOID,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_VOID     = ITEMS.register(    "void_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_VOID,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_VOID     = ITEMS.register(    "void_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_VOID,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_EARTH   = ITEMS.register(  "earth_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_EARTH,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_EARTH  = ITEMS.register( "earth_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_EARTH, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_EARTH = ITEMS.register("earth_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_EARTH,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_EARTH     = ITEMS.register(    "earth_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_EARTH,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_EARTH     = ITEMS.register(    "earth_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_EARTH,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_WATER   = ITEMS.register(  "water_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_WATER,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_WATER  = ITEMS.register( "water_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_WATER, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_WATER = ITEMS.register("water_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_WATER,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_WATER     = ITEMS.register(    "water_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_WATER,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_WATER     = ITEMS.register(    "water_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_WATER,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_DEATH   = ITEMS.register(  "death_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_DEATH,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_DEATH  = ITEMS.register( "death_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_DEATH, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_DEATH = ITEMS.register("death_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_DEATH,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_DEATH     = ITEMS.register(    "death_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_DEATH,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_DEATH     = ITEMS.register(    "death_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_DEATH,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	public static final RegistryObject<SwordItem>   MANASTEEL_SWORD_SHADOW   = ITEMS.register(  "shadow_manasteel_sword",
			() -> new   SwordItem(ModItemTier.MANASTEEL_SHADOW,    3, -2.4F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ShovelItem>  MANASTEEL_SHOVEL_SHADOW  = ITEMS.register( "shadow_manasteel_shovel",
			() -> new  ShovelItem(ModItemTier.MANASTEEL_SHADOW, 1.5F, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<PickaxeItem> MANASTEEL_PICKAXE_SHADOW = ITEMS.register("shadow_manasteel_pickaxe",
			() -> new PickaxeItem(ModItemTier.MANASTEEL_SHADOW,    1, -2.8F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<AxeItem>     MANASTEEL_AXE_SHADOW     = ITEMS.register(    "shadow_manasteel_axe",
			() -> new     AxeItem(ModItemTier.MANASTEEL_SHADOW,    5, -3.0F, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<HoeItem>     MANASTEEL_HOE_SHADOW     = ITEMS.register(    "shadow_manasteel_hoe",
			() -> new     HoeItem(ModItemTier.MANASTEEL_SHADOW,   -3,  0.0F, new Item.Properties().group(AriaBase.TAB)));
	
	//Armor
	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_ENERGY = ITEMS.register(    "energy_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_ENERGY, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_ENERGY = ITEMS.register("energy_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_ENERGY, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_ENERGY = ITEMS.register(  "energy_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_ENERGY, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_ENERGY = ITEMS.register(     "energy_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_ENERGY, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_AIR = ITEMS.register(    "air_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_AIR, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_AIR = ITEMS.register("air_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_AIR, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_AIR = ITEMS.register(  "air_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_AIR, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_AIR = ITEMS.register(     "air_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_AIR, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_FIRE = ITEMS.register(    "fire_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_FIRE, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_FIRE = ITEMS.register("fire_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_FIRE, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_FIRE = ITEMS.register(  "fire_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_FIRE, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_FIRE = ITEMS.register(     "fire_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_FIRE, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_LIFE = ITEMS.register(    "life_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIFE, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_LIFE = ITEMS.register("life_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIFE, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_LIFE = ITEMS.register(  "life_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIFE, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_LIFE = ITEMS.register(     "life_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIFE, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_LIGHT = ITEMS.register(    "light_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIGHT, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_LIGHT = ITEMS.register("light_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIGHT, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_LIGHT = ITEMS.register(  "light_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIGHT, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_LIGHT = ITEMS.register(     "light_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_LIGHT, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_VOID = ITEMS.register(    "void_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_VOID, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_VOID = ITEMS.register("void_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_VOID, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_VOID = ITEMS.register(  "void_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_VOID, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_VOID = ITEMS.register(     "void_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_VOID, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_EARTH = ITEMS.register(    "earth_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_EARTH, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_EARTH = ITEMS.register("earth_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_EARTH, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_EARTH = ITEMS.register(  "earth_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_EARTH, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_EARTH = ITEMS.register(     "earth_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_EARTH, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_WATER = ITEMS.register(    "water_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_WATER, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_WATER = ITEMS.register("water_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_WATER, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_WATER = ITEMS.register(  "water_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_WATER, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_WATER = ITEMS.register(     "water_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_WATER, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_DEATH = ITEMS.register(    "death_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_DEATH, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_DEATH = ITEMS.register("death_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_DEATH, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_DEATH = ITEMS.register(  "death_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_DEATH, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_DEATH = ITEMS.register(     "death_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_DEATH, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));

	public static final RegistryObject<ArmorItem>     MANASTEEL_HELMET_SHADOW = ITEMS.register(    "shadow_manasteel_helmet",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_SHADOW, EquipmentSlotType.HEAD,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem> MANASTEEL_CHESTPLATE_SHADOW = ITEMS.register("shadow_manasteel_chestplate",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_SHADOW, EquipmentSlotType.CHEST, new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>   MANASTEEL_LEGGINGS_SHADOW = ITEMS.register(  "shadow_manasteel_leggings",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_SHADOW, EquipmentSlotType.LEGS,  new Item.Properties().group(AriaBase.TAB)));
	public static final RegistryObject<ArmorItem>      MANASTEEL_BOOTS_SHADOW = ITEMS.register(     "shadow_manasteel_boots",
			() -> new ArmorItem(ModArmorMaterial.MANASTEEL_SHADOW, EquipmentSlotType.FEET,  new Item.Properties().group(AriaBase.TAB)));
	
	// Block Items
		public static final RegistryObject<Item> MANASTEEL_BLOCK_ENERGY_ITEM = ITEMS.register("energy_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_ENERGY.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_AIR_ITEM    = ITEMS.register(   "air_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_AIR.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_FIRE_ITEM   = ITEMS.register(  "fire_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_FIRE.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_LIFE_ITEM   = ITEMS.register(  "life_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_LIFE.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_LIGHT_ITEM  = ITEMS.register( "light_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_LIGHT.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_VOID_ITEM   = ITEMS.register(  "void_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_VOID.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_EARTH_ITEM  = ITEMS.register( "earth_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_EARTH.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_WATER_ITEM  = ITEMS.register( "water_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_WATER.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_DEATH_ITEM  = ITEMS.register( "death_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_DEATH.get()));
		public static final RegistryObject<Item> MANASTEEL_BLOCK_SHADOW_ITEM = ITEMS.register("shadow_manasteel_block",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_BLOCK_SHADOW.get()));
		
		public static final RegistryObject<Item> MANASTEEL_ORE_ENERGY_ITEM = ITEMS.register("energy_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_ENERGY.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_AIR_ITEM    = ITEMS.register(   "air_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_AIR.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_FIRE_ITEM   = ITEMS.register(  "fire_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_FIRE.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_LIFE_ITEM   = ITEMS.register(  "life_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_LIFE.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_LIGHT_ITEM  = ITEMS.register( "light_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_LIGHT.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_VOID_ITEM   = ITEMS.register(  "void_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_VOID.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_EARTH_ITEM  = ITEMS.register( "earth_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_EARTH.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_WATER_ITEM  = ITEMS.register( "water_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_WATER.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_DEATH_ITEM  = ITEMS.register( "death_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_DEATH.get()));
		public static final RegistryObject<Item> MANASTEEL_ORE_SHADOW_ITEM = ITEMS.register("shadow_manasteel_ore",
				() -> new BlockItemBase(ModBlocks.MANASTEEL_ORE_SHADOW.get()));

		public static final RegistryObject<Item> INFUSED_GLASS_ENERGY_ITEM = ITEMS.register("energy_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_ENERGY.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_AIR_ITEM    = ITEMS.register(   "air_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_AIR.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_FIRE_ITEM   = ITEMS.register(  "fire_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_FIRE.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_LIFE_ITEM   = ITEMS.register(  "life_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_LIFE.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_LIGHT_ITEM  = ITEMS.register( "light_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_LIGHT.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_VOID_ITEM   = ITEMS.register(  "void_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_VOID.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_EARTH_ITEM  = ITEMS.register( "earth_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_EARTH.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_WATER_ITEM  = ITEMS.register( "water_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_WATER.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_DEATH_ITEM  = ITEMS.register( "death_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_DEATH.get()));
		public static final RegistryObject<Item> INFUSED_GLASS_SHADOW_ITEM = ITEMS.register("shadow_infused_glass",
				() -> new BlockItemBase(ModBlocks.INFUSED_GLASS_SHADOW.get()));
		
		public static final RegistryObject<Item> MANA_TANK_ENERGY_ITEM = ITEMS.register("energy_mana_tank",
				() -> new BlockItemBase(ModBlocks.MANA_TANK_ENERGY.get()));

		public static final RegistryObject<Item> IRONGLASS_ITEM = ITEMS.register("ironglass",
				() -> new BlockItemBase(ModBlocks.IRONGLASS.get()));
		
		public static final RegistryObject<Item> IRON_MANA_PIPE_ITEM = ITEMS.register("iron_mana_pipe",
				() -> new BlockItemBase(ModBlocks.IRON_MANA_PIPE.get()));
		
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_ENERGY_ITEM = ITEMS.register("energy_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_ENERGY.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_AIR_ITEM    = ITEMS.register(   "air_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_AIR.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_FIRE_ITEM   = ITEMS.register(  "fire_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_FIRE.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_LIFE_ITEM   = ITEMS.register(  "life_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_LIFE.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_LIGHT_ITEM  = ITEMS.register( "light_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_LIGHT.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_VOID_ITEM   = ITEMS.register(  "void_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_VOID.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_EARTH_ITEM  = ITEMS.register( "earth_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_EARTH.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_WATER_ITEM  = ITEMS.register( "water_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_WATER.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_DEATH_ITEM  = ITEMS.register( "death_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_DEATH.get()));
		public static final RegistryObject<Item> CRYSTAL_CLUSTER_SHADOW_ITEM = ITEMS.register("shadow_crystal_cluster",
				() -> new BlockItemBase(ModBlocks.CRYSTAL_CLUSTER_SHADOW.get()));
}
