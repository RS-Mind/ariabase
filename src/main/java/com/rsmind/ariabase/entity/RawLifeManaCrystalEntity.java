package com.rsmind.ariabase.entity;

import com.rsmind.ariabase.init.ModBlocks;
import com.rsmind.ariabase.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class RawLifeManaCrystalEntity extends ProjectileItemEntity {
	public int explosionPower = 1;
	   
	public RawLifeManaCrystalEntity(EntityType<? extends RawLifeManaCrystalEntity> p_i50159_1_, World p_i50159_2_) {
		super(p_i50159_1_, p_i50159_2_);
		}

	public RawLifeManaCrystalEntity(World worldIn, LivingEntity throwerIn) {
		super(EntityType.SNOWBALL, throwerIn, worldIn);
		}

   public RawLifeManaCrystalEntity(World worldIn, double x, double y, double z) {
      super(EntityType.SNOWBALL, x, y, z, worldIn);
   }

   protected Item getDefaultItem() {
      return Items.SNOWBALL;
   }

   @OnlyIn(Dist.CLIENT)
   private IParticleData makeParticle() {
      ItemStack itemstack = this.func_213882_k();
      return (IParticleData)(itemstack.isEmpty() ? new ItemParticleData(ParticleTypes.ITEM, new ItemStack(ModItems.RAW_MANA_CRYSTAL_LIFE.get())) : new ItemParticleData(ParticleTypes.ITEM, itemstack));
   }

   /**
    * Handler for {@link World#setEntityState}
    */
   @OnlyIn(Dist.CLIENT)
   public void handleStatusUpdate(byte id) {
      if (id == 3) {
         IParticleData iparticledata = this.makeParticle();

         for(int i = 0; i < 8; ++i) {
            this.world.addParticle(iparticledata, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
         }
      }

   }

   /**
    * Called when the arrow hits an entity
    */
   protected void onEntityHit(EntityRayTraceResult p_213868_1_) {
      super.onEntityHit(p_213868_1_);
      Entity entity = p_213868_1_.getEntity();
      int i = entity instanceof BlazeEntity ? 3 : 0;
      entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.func_234616_v_()), (float)i);
   }

   /**
    * Called when this EntityFireball hits a block or entity.
    */
   protected void onImpact(RayTraceResult result) {
      super.onImpact(result);
      if (!this.world.isRemote) {
    	  BlockPos pos1 = new BlockPos(result.getHitVec().getX(),result.getHitVec().getY(),result.getHitVec().getZ());
    	  BlockPos pos2 = new BlockPos(result.getHitVec().getX() - 0.1,result.getHitVec().getY() - 0.1,result.getHitVec().getZ() - 0.1);
    	  boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this.func_234616_v_());
    	  if(this.world.getBlockState(pos1).getBlock() == Blocks.GLASS) {
    		  Block block = ModBlocks.INFUSED_GLASS_LIFE.get();
    		  BlockState state = block.getDefaultState();
    		  this.world.setBlockState(pos1, state);
    	  }
    	  else if(this.world.getBlockState(pos1).getBlock() == Blocks.IRON_BLOCK) {
    		  Block block = ModBlocks.MANASTEEL_ORE_LIFE.get();
    		  BlockState state = block.getDefaultState();
    		  this.world.setBlockState(pos1, state);
    	  }
    	  else if(this.world.getBlockState(pos2).getBlock() == Blocks.GLASS) {
    		  Block block = ModBlocks.INFUSED_GLASS_LIFE.get();
    		  BlockState state = block.getDefaultState();
    		  this.world.setBlockState(pos2, state);
    	  }
    	  else if(this.world.getBlockState(pos2).getBlock() == Blocks.IRON_BLOCK) {
    		  Block block = ModBlocks.MANASTEEL_ORE_LIFE.get();
    		  BlockState state = block.getDefaultState();
    		  this.world.setBlockState(pos2, state);
    	  }
    	  this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.NEUTRAL, 1.0F, 1.0F);
          this.world.createExplosion((Entity)null, this.getPosX(), this.getPosY(), this.getPosZ(), (float)this.explosionPower, false, flag ? Explosion.Mode.DESTROY : Explosion.Mode.NONE);
          this.remove();
      }

   }
}