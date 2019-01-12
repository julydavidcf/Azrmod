package com.init;

import com.items.ItemCoin;
import com.items.ItemEmblem;
import com.items.ItemMagiccube;
import com.items.ItemReddimond;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();



    //Items


    public static Item magiccube;
    public static Item coin;
    public static Item reddimond;
    public static Item emblem;





    public static void init(){
        magiccube = new ItemMagiccube();
        coin = new ItemCoin();
        reddimond = new ItemReddimond();
        emblem = new ItemEmblem();

    }

    public static void register(){
       ForgeRegistries.ITEMS.register(magiccube);
       ForgeRegistries.ITEMS.register(coin);
       ForgeRegistries.ITEMS.register(reddimond);
       ForgeRegistries.ITEMS.register(emblem);

    }

    public static void registerRenders(){
        registerRender(magiccube);
        registerRender(coin);
        registerRender(reddimond);
        registerRender(emblem);

    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));

    }


}
