package com.rsmind.ariabase.tileentity;

import com.rsmind.ariabase.init.ModTileEntityTypes;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;

public class ManaTankTileEntityEnergy extends TileEntity implements ITickableTileEntity {
	
	public int mana;// = 0;
	private CompoundNBT customTileData;
	
	private CompoundNBT writeInternal(CompoundNBT compound) {
	      ResourceLocation resourcelocation = TileEntityType.getId(this.getType());
	      if (resourcelocation == null) {
	         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
	      } else {
	         compound.putString("id", resourcelocation.toString());
	         compound.putInt("x", this.pos.getX());
	         compound.putInt("y", this.pos.getY());
	         compound.putInt("z", this.pos.getZ());
	         if (this.customTileData != null) compound.put("ForgeData", this.customTileData);
	         if (getCapabilities() != null) compound.put("ForgeCaps", serializeCaps());
	         return compound;
	      }
	   }

	public ManaTankTileEntityEnergy(final TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}

	public ManaTankTileEntityEnergy() {
		this(ModTileEntityTypes.ENERGY_MANA_TANK.get());
	}

	@Override
	public void tick() {
		int oldMana = mana;
		if (mana < 0) {
			mana = 0;
		}
		else if (mana > 1000) {
			mana = 1000;
		}
		if (oldMana != mana) {
			this.markDirty();
		}
	}
	
	@Override
	public CompoundNBT write(CompoundNBT compound) {
		super.write(compound);
		compound.putInt("mana", this.mana);
		return compound;
	}
	
	@Override
	public void read(BlockState state, CompoundNBT nbt) {
		super.read(state, nbt);
      	this.mana = nbt.getInt("mana");
	}
	
	@Override
	public SUpdateTileEntityPacket  getUpdatePacket() {
		CompoundNBT compound = new CompoundNBT();
		compound.putInt("mana", this.mana);
		return new SUpdateTileEntityPacket(getPos(), 0, compound);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket packet) {
		CompoundNBT nbt = packet.getNbtCompound();
		this.mana = nbt.getInt("mana");
	}
	
	@Override
	public CompoundNBT  getUpdateTag() {
		CompoundNBT compound = new CompoundNBT();
		compound.putInt("mana", this.mana);
		return this.writeInternal(compound);
	}
	
	@Override
	public void handleUpdateTag(BlockState state, CompoundNBT nbt) {
		this.mana = nbt.getInt("mana");
	}
}
