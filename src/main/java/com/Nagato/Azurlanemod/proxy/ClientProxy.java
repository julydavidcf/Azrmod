package com.Nagato.Azurlanemod.proxy;

import com.init.ModBlocks;
import com.init.ModItems;

public class ClientProxy implements CommonProxy {
    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
