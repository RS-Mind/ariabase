package com.rsmind.ariabase.client.tileentity.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.rsmind.ariabase.AriaBase;
import com.rsmind.ariabase.tileentity.ManaTankTileEntityEnergy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.inventory.container.PlayerContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;

public class ManaTankRendererEnergy extends TileEntityRenderer<ManaTankTileEntityEnergy> {

	public ManaTankRendererEnergy(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(ManaTankTileEntityEnergy tileEntityIn, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		AriaBase.LOGGER.debug("--------------------------------------rendering--------------------------------------");
		int mana = tileEntityIn.mana < 10 ? 10 : tileEntityIn.mana;
		boolean renderMana = tileEntityIn.mana > 0;
		float manaLevel = mana/1000f;
		matrixStackIn.push();
		IVertexBuilder builder = bufferIn.getBuffer(RenderType.getTranslucent());
		int fullbright = 0xF000F0;
		float startX = 127/1028f, startY = 1/8f, startZ = 127/1028f, endX = 897/1024f, endY = (manaLevel*(12/16f)) + (31/256f), endZ = 897/1024f;
		Matrix4f mat = matrixStackIn.getLast().getMatrix();
		ResourceLocation resource = new ResourceLocation("ariabase:block/energy_mana");
		TextureAtlasSprite icon = Minecraft.getInstance().getModelManager().getAtlasTexture(PlayerContainer.LOCATION_BLOCKS_TEXTURE).getSprite(resource);
		resource = new ResourceLocation("ariabase:block/energy_tank_side");
		TextureAtlasSprite icon2 = Minecraft.getInstance().getModelManager().getAtlasTexture(PlayerContainer.LOCATION_BLOCKS_TEXTURE).getSprite(resource);
        //up
		if(renderMana) {
			builder.pos(mat, startX, endY, endZ)  .color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) * 14 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, endY, endZ)    .color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) * 14 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) * 14 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, endY, startZ)  .color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) * 14 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, startX, endY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
	
	        //east
			builder.pos(mat, startX, endY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, endY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, startY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, startX, startY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		}

		builder.pos(mat, 2/16f, 14/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  14/16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 14/16f, 14/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(),
				((icon2.getMaxV() - icon2.getMinV()) *  14/16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 14/16f, 2/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 2/16f, 2/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();

        //west
		if(renderMana) {
			builder.pos(mat, startX, endY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, startX, startY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, startY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, endY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		}

		builder.pos(mat, 2/16f, 14/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  14/16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 2/16f, 2/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 14/16f, 2/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 14/16f, 14/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(),
				((icon2.getMaxV() - icon2.getMinV()) *  14/16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();

        //south
		if(renderMana) {
			builder.pos(mat, endX, startY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, startY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, endY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, endX, endY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		}

		builder.pos(mat, 14/16f, 2/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 14/16f, 2/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 14/16f, 14/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  endY) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 14/16f, 14/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(),
				((icon2.getMaxV() - icon2.getMinV()) *  endY) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();

        //north
		if(renderMana) {
			builder.pos(mat, startX, endY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, startX, startY, startZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  2 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, startX, startY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(), 
					((icon.getMaxV() - icon.getMinV()) *  2 / 16f) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
			builder.pos(mat, startX, endY, endZ).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon.getMinU()) *  14 / 16f) + icon.getMinU(),
					((icon.getMaxV() - icon.getMinV()) *  endY) + icon.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		}

		builder.pos(mat, 2/16f, 14/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  endY) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 2/16f, 2/16f, 2/16f).color(1f, 1f, 1f, 1f).tex(((icon.getMaxU() - icon2.getMinU()) *  2 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 2/16f, 2/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(), 
				((icon2.getMaxV() - icon2.getMinV()) *  2 / 16f) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		builder.pos(mat, 2/16f, 14/16f, 14/16f).color(1f, 1f, 1f, 1f).tex(((icon2.getMaxU() - icon2.getMinU()) *  14 / 16f) + icon2.getMinU(),
				((icon2.getMaxV() - icon2.getMinV()) *  endY) + icon2.getMinV()).lightmap(fullbright).normal(1, 1, 1).endVertex();
		matrixStackIn.translate(tileEntityIn.getPos().getX(), tileEntityIn.getPos().getY(), tileEntityIn.getPos().getZ());
		matrixStackIn.pop();
		AriaBase.LOGGER.debug("--------------------------------------Render completed--------------------------------------");
	}
}
