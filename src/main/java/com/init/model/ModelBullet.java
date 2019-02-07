package com.init.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelShulkerBullet - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelBullet extends ModelBase {
    public ModelRenderer face;

    public ModelBullet() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.face = new ModelRenderer(this, 0, 0);
        this.face.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.face.addBox(-4.0F, -4.0F, -1.0F, 8, 8, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.face.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
