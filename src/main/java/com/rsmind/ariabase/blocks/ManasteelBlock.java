package com.rsmind.ariabase.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ManasteelBlock extends Block {
	public ManasteelBlock() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0F, 6.0F)
				.sound(SoundType.METAL)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
				.setLightLevel(value -> 8)
				);
	}
}
