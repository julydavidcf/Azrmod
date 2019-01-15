package com.Nagato.Azurlanemod.Entity.Render;

import com.Nagato.Azurlanemod.Entity.EntityStuff;
import com.Nagato.Azurlanemod.Util.Reference;
import com.init.ModelBullet;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderStuff extends RenderLiving<EntityStuff> {
    public static final ResourceLocation TEXTURES1 = new ResourceLocation(Reference.MOD_ID + ":textures/entity/projectile/bullet.png");

    public RenderStuff(RenderManager manager)
    {
        super(manager, new ModelBullet(), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityStuff entity) {
        return TEXTURES1;
    }


    @Override
    protected void applyRotations(EntityStuff entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
