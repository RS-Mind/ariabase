package com.rsmind.ariabase.util.enums;

import java.util.function.Supplier;

import com.rsmind.ariabase.AriaBase;
import com.rsmind.ariabase.init.ModItems;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModArmorMaterial implements IArmorMaterial {
	
	MANASTEEL_ENERGY(AriaBase.MOD_ID + ":energy_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_ENERGY.get()); }, 0.0F),
	MANASTEEL_AIR(AriaBase.MOD_ID + ":air_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_AIR.get()); }, 0.0F),
	MANASTEEL_FIRE(AriaBase.MOD_ID + ":fire_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_FIRE.get()); }, 0.0F),
	MANASTEEL_LIFE(AriaBase.MOD_ID + ":life_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_LIFE.get()); }, 0.0F),
	MANASTEEL_LIGHT(AriaBase.MOD_ID + ":light_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_LIGHT.get()); }, 0.0F),
	MANASTEEL_VOID(AriaBase.MOD_ID + ":void_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_VOID.get()); }, 0.0F),
	MANASTEEL_EARTH(AriaBase.MOD_ID + ":earth_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_EARTH.get()); }, 0.0F),
	MANASTEEL_WATER(AriaBase.MOD_ID + ":water_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_WATER.get()); }, 0.0F),
	MANASTEEL_DEATH(AriaBase.MOD_ID + ":death_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_DEATH.get()); }, 0.0F),
	MANASTEEL_SHADOW(AriaBase.MOD_ID + ":shadow_manasteel", 50, new int[] {4,7,10,4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 
			() -> {return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_SHADOW.get()); }, 0.0F);
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	private final float knockbackResistance;
	
	ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;
		this.knockbackResistance = knockbackResistance;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.get();
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}
	
	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
