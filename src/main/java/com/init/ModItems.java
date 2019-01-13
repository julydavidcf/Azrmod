package com.init;

import com.items.ItemBase;
import com.items.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();
    //Material

    public static final Item.ToolMaterial AYNM = EnumHelper.addToolMaterial("AYNM",3,600,8.0F,3.0F,10);





    //Items
    public static final Item COIN = new ItemBase("coin");
    public static final Item EMBLEM = new ItemBase("emblem");
    public static final Item MAGICCUBE = new ItemBase("magiccube");
    public static final Item REDDIMOND = new ItemBase("reddimond");

    //Tools
    public static final ItemSword AYANAMI_SWORD = new ToolSword("ayanami's sword",AYNM);

}
