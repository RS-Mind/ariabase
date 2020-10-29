package com.rsmind.ariabase.blocks;

import javax.annotation.Nullable;

import com.rsmind.ariabase.init.ModBlocks;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.ToolType;

public class IronManaPipe extends Block {
	
	protected final VoxelShape[] shapes;
	
	private static final BooleanProperty NORTH = BooleanProperty.create("north");
	private static final BooleanProperty EAST  = BooleanProperty.create("east");
	private static final BooleanProperty SOUTH = BooleanProperty.create("south");
	private static final BooleanProperty WEST  = BooleanProperty.create("west");
	private static final BooleanProperty UP    = BooleanProperty.create("up");
	private static final BooleanProperty DOWN  = BooleanProperty.create("down");
   private final Object2IntMap<BlockState> field_223008_i = new Object2IntOpenHashMap<>();
	
	public IronManaPipe() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(3.0F, 3.0F)
				.sound(SoundType.METAL)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE)
				.setRequiresTool()
				.notSolid()
				);
		this.setDefaultState(
			    this.stateContainer.getBaseState()
			        .with(NORTH, false)
			        .with(SOUTH, false)
			        .with(EAST,  false)
			        .with(WEST,  false)
			        .with(UP,    false)
			        .with(DOWN,  false)
			);
		this.shapes = this.makeShapes();
	}
	
	protected VoxelShape[] makeShapes() { //            x1  y1  z1  x2  y2  z2
	      VoxelShape coreShape  = Block.makeCuboidShape( 6,  6,  6, 10, 10, 10);
	      VoxelShape northShape = Block.makeCuboidShape( 6,  6,  0, 10, 10,  6);
	      VoxelShape southShape = Block.makeCuboidShape( 6,  6, 10, 10, 10, 16);
	      VoxelShape eastShape  = Block.makeCuboidShape(10,  6,  6, 16, 10, 10);
	      VoxelShape westShape  = Block.makeCuboidShape( 0,  6,  6,  6, 10, 10);
	      VoxelShape upShape    = Block.makeCuboidShape( 6, 10,  6, 10, 16, 10);
	      VoxelShape downShape  = Block.makeCuboidShape( 6,  0,  6, 10,  6, 10);
	      VoxelShape zShape = VoxelShapes.or(northShape, southShape);
	      VoxelShape xShape = VoxelShapes.or(eastShape, westShape);
	      VoxelShape euShape = VoxelShapes.or(eastShape, upShape);
	      VoxelShape wuShape = VoxelShapes.or(westShape, upShape);
	      VoxelShape xuShape = VoxelShapes.or(euShape, westShape);
	      VoxelShape ndShape = VoxelShapes.or(northShape, downShape);
	      VoxelShape sdShape = VoxelShapes.or(southShape, downShape);
	      VoxelShape zdShape = VoxelShapes.or(northShape, sdShape);
	      VoxelShape[] avoxelshape = new VoxelShape[]{VoxelShapes.empty(), northShape, southShape, zShape, eastShape, VoxelShapes.or(northShape, eastShape), VoxelShapes.or(southShape, eastShape), VoxelShapes.or(zShape, eastShape), westShape, VoxelShapes.or(northShape, westShape), VoxelShapes.or(southShape, westShape), VoxelShapes.or(zShape, westShape), xShape, VoxelShapes.or(northShape, xShape), VoxelShapes.or(southShape, xShape), VoxelShapes.or(zShape, xShape), upShape, VoxelShapes.or(northShape, upShape), VoxelShapes.or(southShape, upShape), VoxelShapes.or(upShape, zShape), VoxelShapes.or(eastShape, upShape), VoxelShapes.or(northShape, euShape), VoxelShapes.or(southShape, euShape), VoxelShapes.or(zShape, euShape), VoxelShapes.or(westShape, upShape), VoxelShapes.or(northShape, wuShape), VoxelShapes.or(southShape, wuShape), VoxelShapes.or(zShape, wuShape), xuShape, VoxelShapes.or(northShape, xuShape), VoxelShapes.or(southShape, xuShape), VoxelShapes.or(zShape, xuShape), downShape, ndShape, sdShape, zdShape, VoxelShapes.or(eastShape, downShape), VoxelShapes.or(eastShape, ndShape), VoxelShapes.or(eastShape, sdShape), VoxelShapes.or(eastShape, zdShape), VoxelShapes.or(westShape, downShape), VoxelShapes.or(westShape, ndShape), VoxelShapes.or(westShape, sdShape), VoxelShapes.or(westShape, zdShape), VoxelShapes.or(downShape, xShape), VoxelShapes.or(xShape, ndShape), VoxelShapes.or(xShape, sdShape), VoxelShapes.or(xShape, zdShape), VoxelShapes.or(upShape, downShape), VoxelShapes.or(upShape, ndShape), VoxelShapes.or(upShape, sdShape), VoxelShapes.or(upShape, zdShape), VoxelShapes.or(downShape, euShape), VoxelShapes.or(ndShape, euShape), VoxelShapes.or(sdShape, euShape), VoxelShapes.or(zdShape, euShape), VoxelShapes.or(downShape, wuShape), VoxelShapes.or(ndShape, wuShape), VoxelShapes.or(sdShape, wuShape), VoxelShapes.or(zdShape, wuShape), VoxelShapes.or(downShape, xuShape), VoxelShapes.or(ndShape, xuShape), VoxelShapes.or(sdShape, xuShape), VoxelShapes.or(zdShape, xuShape)};

	      for(int i = 0; i < 64; ++i) {
	         avoxelshape[i] = VoxelShapes.or(coreShape, avoxelshape[i]);
	      }

	      return avoxelshape;
	   }
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(NORTH, SOUTH, EAST, WEST, UP, DOWN);
	}
	
	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		BlockState blockstate = this.getDefaultState();
		if(context.getWorld().getBlockState(context.getPos().up()).getBlock() == ModBlocks.IRON_MANA_PIPE.get() || context.getWorld().getBlockState(context.getPos().up()).getBlock() == ModBlocks.MANA_TANK_ENERGY.get()) {
			blockstate = blockstate.with(UP, true);
		}
		if(context.getWorld().getBlockState(context.getPos().down()).getBlock() == ModBlocks.IRON_MANA_PIPE.get() || context.getWorld().getBlockState(context.getPos().down()).getBlock() == ModBlocks.MANA_TANK_ENERGY.get()) {
			blockstate = blockstate.with(DOWN, true);
		}
		if(context.getWorld().getBlockState(context.getPos().north()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
			blockstate = blockstate.with(NORTH, true);
		}
		if(context.getWorld().getBlockState(context.getPos().south()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
			blockstate = blockstate.with(SOUTH, true);
		}
		if(context.getWorld().getBlockState(context.getPos().east()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
			blockstate = blockstate.with(EAST, true);
		}
		if(context.getWorld().getBlockState(context.getPos().west()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
			blockstate = blockstate.with(WEST, true);
		}
		return blockstate;
	}
	
	public BlockState updatePostPlacement(BlockState blockstate, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		switch(facing) {
			case UP:
				if(worldIn.getWorld().getBlockState(currentPos.up()).getBlock() == ModBlocks.IRON_MANA_PIPE.get() || worldIn.getWorld().getBlockState(currentPos.up()).getBlock() == ModBlocks.MANA_TANK_ENERGY.get()) {
					blockstate = blockstate.with(UP, true);
				}
				else {
					blockstate = blockstate.with(UP, false);
				}
				break;
			case DOWN:
				if(worldIn.getWorld().getBlockState(currentPos.down()).getBlock() == ModBlocks.IRON_MANA_PIPE.get() || worldIn.getWorld().getBlockState(currentPos.down()).getBlock() == ModBlocks.MANA_TANK_ENERGY.get()) {
					blockstate = blockstate.with(DOWN, true);
				}
				else {
					blockstate = blockstate.with(DOWN,  false);
				}
				break;
			case NORTH:
				if(worldIn.getWorld().getBlockState(currentPos.north()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
					blockstate = blockstate.with(NORTH, true);
				}
				else {
					blockstate = blockstate.with(NORTH, false);
				}
				break;
			case SOUTH:
				if(worldIn.getWorld().getBlockState(currentPos.south()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
					blockstate = blockstate.with(SOUTH, true);
				}
				else {
					blockstate = blockstate.with(SOUTH, false);
				}
				break;
			case EAST:
				if(worldIn.getWorld().getBlockState(currentPos.east()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
					blockstate = blockstate.with(EAST, true);
				}
				else { 
					blockstate = blockstate.with(EAST, false);
				}
				break;
			case WEST:
				if(worldIn.getWorld().getBlockState(currentPos.west()).getBlock() == ModBlocks.IRON_MANA_PIPE.get()) {
					blockstate = blockstate.with(WEST, true);
				}
				else {
					blockstate = blockstate.with(WEST, false);
				}
				break;
			default:
				break;
		}
		return blockstate;
	   }
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return this.shapes[this.getIndex(state)];
	}
	
	protected int getIndex(BlockState state) {
	      return this.field_223008_i.computeIntIfAbsent(state, (p_223007_0_) -> {
	         int i = 0;
	         if (p_223007_0_.get(NORTH)) {
	            i += 1;
	         }

	         if (p_223007_0_.get(SOUTH)) {
	            i += 2;
	         }

	         if (p_223007_0_.get(EAST)) {
	            i += 4;
	         }

	         if (p_223007_0_.get(WEST)) {
	            i += 8;
	         }

	         if (p_223007_0_.get(UP)) {
	            i += 16;
	         }

	         if (p_223007_0_.get(DOWN)) {
	            i += 32;
	         }

	         return i;
	      });
	   }
}
