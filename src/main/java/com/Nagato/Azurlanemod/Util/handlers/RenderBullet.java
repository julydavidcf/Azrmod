package com.Nagato.Azurlanemod.Util.handlers;

import com.Nagato.Azurlanemod.Entity.EntityHva;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderBullet {
    public static void RenderBullet(){
        RenderingRegistry.registerEntityRenderingHandler(EntityHva.class, new IRenderFactory<EntityHva>()
        {
        @Override
            public Render<? super EntityHva> createRenderFor(RenderManager manager)
            {
                return new com.Nagato.Azurlanemod.Entity.Render.RenderBullet(manager);
            }
        });
    }
}
