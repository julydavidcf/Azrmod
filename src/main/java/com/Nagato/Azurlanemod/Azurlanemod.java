package com.Nagato.Azurlanemod;

import com.Nagato.Azurlanemod.Util.Reference;
import com.Nagato.Azurlanemod.Util.handlers.RegistryHandler;
import com.Nagato.Azurlanemod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
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

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)

    public static CommonProxy proxy;

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        RegistryHandler.initRegistries();}
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        RegistryHandler.postInitRegistries(event);}

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        RegistryHandler.preInitRegistries(event);

    }



}
