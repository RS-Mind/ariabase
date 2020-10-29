package com.rsmind.ariabase.blocks;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Ironglass extends AbstractGlassBlock {
	public Ironglass() {
		super(Block.Properties.create(Material.GLASS)
				.hardnessAndResistance(5.0F, 6.0F)
				.sound(SoundType.GLASS)
				.harvestTool(ToolType.PICKAXE)
				.notSolid()
				);
	}
}
