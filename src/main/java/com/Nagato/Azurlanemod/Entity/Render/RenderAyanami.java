package com.Nagato.Azurlanemod.Entity.Render;

import com.Nagato.Azurlanemod.Entity.EntityAyanami;
import com.Nagato.Azurlanemod.Util.Reference;
import com.init.model.ModelAyanami;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderAyanami extends RenderLiving<EntityAyanami> {
    public static final ResourceLocation TEXTURES1 = new ResourceLocation(Reference.MOD_ID + ":textures/entity/ayanami.png");

    public RenderAyanami(RenderManager manager)
    {
        super(manager, new ModelAyanami(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityAyanami entity) {
        return TEXTURES1;
    }


    @Override
    protected void applyRotations(EntityAyanami entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
