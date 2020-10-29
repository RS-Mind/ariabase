package com.rsmind.ariabase.util;

import com.rsmind.ariabase.AriaBase;
import com.rsmind.ariabase.client.tileentity.renderer.ManaTankRendererEnergy;
import com.rsmind.ariabase.init.ModBlocks;
import com.rsmind.ariabase.init.ModTileEntityTypes;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = AriaBase.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_ENERGY.get(), RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_AIR.get(),    RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_FIRE.get(),   RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_LIFE.get(),   RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_LIGHT.get(),  RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_VOID.get(),   RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_EARTH.get(),  RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_WATER.get(),  RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_DEATH.get(),  RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.CRYSTAL_CLUSTER_SHADOW.get(), RenderType.getTranslucent());

    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_ENERGY.get(),   RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_AIR.get(),      RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_FIRE.get(),     RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_LIFE.get(),     RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_LIGHT.get(),    RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_VOID.get(),     RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_EARTH.get(),    RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_WATER.get(),    RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_DEATH.get(),    RenderType.getTranslucent());
    	RenderTypeLookup.setRenderLayer(ModBlocks.INFUSED_GLASS_SHADOW.get(),   RenderType.getTranslucent());

    	RenderTypeLookup.setRenderLayer(ModBlocks.IRONGLASS.get(),              RenderType.getCutout());
    	
    	RenderTypeLookup.setRenderLayer(ModBlocks.IRON_MANA_PIPE.get(),         RenderType.getCutout());
		
    	ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.ENERGY_MANA_TANK.get(), ManaTankRendererEnergy::new);
	}
}
