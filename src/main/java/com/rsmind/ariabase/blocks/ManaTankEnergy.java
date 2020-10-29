package com.rsmind.ariabase.blocks;

import com.rsmind.ariabase.init.ModTileEntityTypes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class ManaTankEnergy extends Block {
	
	private static final VoxelShape SHAPE = Block.makeCuboidShape( 2,  0,  2, 14, 16, 14);
	
	public ManaTankEnergy() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(3.0F, 3.0F)
				.sound(SoundType.METAL)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
				.notSolid()
				);
	}
	
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return ModTileEntityTypes.ENERGY_MANA_TANK.get().create();
	}
}
