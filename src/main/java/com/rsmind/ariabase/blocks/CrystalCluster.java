package com.rsmind.ariabase.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class CrystalCluster extends OreBlock {
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape( 6,  0,  6, 10, 16, 10),
			Block.makeCuboidShape( 4,  5,  4,  8, 13,  8),
			Block.makeCuboidShape( 8,  2,  8, 12,  9, 12),
			Block.makeCuboidShape( 5,  4,  8,  8, 11, 11),
			Block.makeCuboidShape( 8,  4,  5, 11, 11,  8),
			Block.makeCuboidShape( 7,  8,  3,  9, 15,  5),
			Block.makeCuboidShape( 7,  6, 11,  9, 14, 13),
			Block.makeCuboidShape( 3,  2,  7,  5, 14,  9),
			Block.makeCuboidShape(11,  5,  7, 13, 12,  9)
			).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();
	
	public CrystalCluster() {
		super(Block.Properties.create(Material.ROCK)
				.hardnessAndResistance(3.0F, 3.0F)
				.sound(SoundType.STONE)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
				.setLightLevel(value -> 8)
				.notSolid()
				);
	}
	
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
	
	@Override
	public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
		return silktouch == 0 ? this.getExperience(RANDOM) : 0;
	}
}
