package com.Nagato.Azurlanemod;

import com.Nagato.Azurlanemod.proxy.CommonProxy;
import com.init.ModBlocks;
import com.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Azurlanemod.MODID, name = Azurlanemod.NAME, version = Azurlanemod.VERSION)
public class Azurlanemod
{
    public static final String MODID = "azr";
    public static final String NAME = "Azurlanemod";
    public static final String VERSION = "@VERSION@";

    private static Logger logger;


    @Mod.Instance
    public static Azurlanemod instance;

    @SidedProxy(clientSide = com.Nagato.Azurlanemod.Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)

    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();


    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}
