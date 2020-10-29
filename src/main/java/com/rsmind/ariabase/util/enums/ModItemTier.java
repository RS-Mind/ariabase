package com.rsmind.ariabase.util.enums;

import java.util.function.Supplier;

import com.rsmind.ariabase.init.ModItems;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {
	
	MANASTEEL_ENERGY(4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_ENERGY.get());
	}),
	MANASTEEL_AIR   (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_AIR.get());
	}),
	MANASTEEL_FIRE  (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_FIRE.get());
	}),
	MANASTEEL_LIFE  (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_LIFE.get());
	}),
	MANASTEEL_LIGHT (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_LIGHT.get());
	}),
	MANASTEEL_VOID  (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_VOID.get());
	}),
	MANASTEEL_EARTH (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_EARTH.get());
	}),
	MANASTEEL_WATER (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_WATER.get());
	}),
	MANASTEEL_DEATH (4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_DEATH.get());
	}),
	MANASTEEL_SHADOW(4, 2000, 10.0F, 4.0F, 15, () -> {
		return Ingredient.fromItems(ModItems.MANASTEEL_INGOT_SHADOW.get());
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Supplier<Ingredient> repairMaterial;

	ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getMaxUses() {
		// TODO Auto-generated method stub
		return maxUses;
	}

	@Override
	public float getEfficiency() {
		// TODO Auto-generated method stub
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		// TODO Auto-generated method stub
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return repairMaterial.get();
	}

}
