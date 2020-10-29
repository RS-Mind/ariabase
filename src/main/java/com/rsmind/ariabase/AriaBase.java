package com.rsmind.ariabase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rsmind.ariabase.init.ModBlocks;
import com.rsmind.ariabase.init.ModItems;
import com.rsmind.ariabase.init.ModTileEntityTypes;
import com.rsmind.ariabase.util.ClientEventBusSubscriber;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("ariabase")
public class AriaBase
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ariabase";

    public AriaBase() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModTileEntityTypes.TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

	@OnlyIn(Dist.CLIENT)
    private void doClientStuff(final FMLClientSetupEvent event) {
		ClientEventBusSubscriber.clientSetup(event);
    }
    
    public static final ItemGroup TAB = new ItemGroup("ariaBaseTab") {
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(ModItems.MANASTEEL_INGOT_FIRE.get());
    	}
    };
}
