package com.Nagato.Azurlanemod.Entity.Render;

import com.Nagato.Azurlanemod.Entity.EntityHva;
import com.Nagato.Azurlanemod.Util.Reference;
import com.init.model.ModelBullet;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
@SideOnly(Side.CLIENT)
public class RenderBullet extends RenderArrow<EntityHva> {
    private ModelBullet model;

    public static final ResourceLocation TEXTURES1 = new ResourceLocation(Reference.MOD_ID + ":textures/entity/bullet.png");



    public RenderBullet(RenderManager renderManagerIn) {
        super(renderManagerIn);
        model = new ModelBullet();
    }


    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHva entity) {
        return TEXTURES1;
    }

    @Override
    public void doRender(EntityHva entity, double x, double y, double z, float entityYaw, float partialTicks) {
        bindTexture(TEXTURES1);
        model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
    }
}
