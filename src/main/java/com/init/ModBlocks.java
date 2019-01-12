package com.init;


import com.Nagato.Azurlanemod.blocks.Reddimondblock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks {

    public static Block reddimondblock;


    public static void init(){

        reddimondblock = new Reddimondblock();

    }

    public static void register(){

        registerBlock(reddimondblock);

    }

    private static void registerBlock(Block block){
        ForgeRegistries.BLOCKS.register(reddimondblock);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);
    }

    public static void registerRenders(){

        registerRender(reddimondblock);

    }

    private static void registerRender(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0,new ModelResourceLocation(block.getRegistryName(),"inventory"));

    }
}
