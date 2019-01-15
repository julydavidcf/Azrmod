package com.init;

import com.items.ItemBase;
import com.items.T4box;
import com.items.food.FoodEffectBase;
import com.items.tools.ToolArrow;
import com.items.tools.ToolBow;
import com.items.tools.ToolPickaxe;
import com.items.tools.ToolSword;
import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();
    //Material

    public static final Item.ToolMaterial AYNM = EnumHelper.addToolMaterial("AYNM",3,600,8.0F,5.0F,10);
    public static final Item.ToolMaterial YHC = EnumHelper.addToolMaterial("YHC",3,2500,8.0F,1.0F,10);





    //Items
    public static final Item COIN = new ItemBase("coin");
    public static final Item EMBLEM = new ItemBase("emblem");
    public static final Item MAGICCUBE = new ItemBase("magiccube");
    public static final Item REDDIMOND = new ItemBase("reddimond");
    public static final Item T4BOX = new T4box("t4box");
    public static final Item OIL = new ItemBase("oil");



    //Tools
    public static final ItemSword AYANAMI_SWORD = new ToolSword("ayanami_sword",AYNM);
    public static final ItemPickaxe YHC_PICKAXE = new ToolPickaxe("yhc_pickaxe",AYNM);
    public static final ItemBow MK6= new ToolBow("mk6");
    public static final Item HEAVYA = new ToolArrow("heavya");

    //Food
    //public static final Item COKE = new FoodBase("coke",4,3f,false);
    public static final Item COKE = new FoodEffectBase("coke",4,3f,false,new PotionEffect(MobEffects.STRENGTH,(60*10),0,false,true));

}
