package com.init.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * Ayanami - Cleveland
 * Created using Tabula 7.0.0
 */
public class ModelAyanami extends ModelBase {
    public ModelRenderer larm;
    public ModelRenderer rleg;
    public ModelRenderer rarm;
    public ModelRenderer head;
    public ModelRenderer lleg;
    public ModelRenderer body;
    public ModelRenderer head_1;
    public ModelRenderer larm_1;
    public ModelRenderer rleg_1;
    public ModelRenderer lleg_1;
    public ModelRenderer rarm_1;
    public ModelRenderer body_1;
    public ModelRenderer back;
    public ModelRenderer b1;
    public ModelRenderer right;
    public ModelRenderer b2;
    public ModelRenderer b3;
    public ModelRenderer b4;
    public ModelRenderer left;
    public ModelRenderer b4_1;
    public ModelRenderer r1;
    public ModelRenderer r2;
    public ModelRenderer r3;
    public ModelRenderer b2a;
    public ModelRenderer b2b;
    public ModelRenderer b2c;
    public ModelRenderer b2d;
    public ModelRenderer b2e;
    public ModelRenderer b3a;
    public ModelRenderer b4a;
    public ModelRenderer l1;
    public ModelRenderer l2;
    public ModelRenderer l3;
    public ModelRenderer b4a_1;
    public ModelRenderer h1;
    public ModelRenderer hr;
    public ModelRenderer hl;
    public ModelBiped.ArmPose leftArmPose;
    public ModelBiped.ArmPose rightArmPose;

    public ModelAyanami() {
        this.leftArmPose = ModelBiped.ArmPose.EMPTY;
        this.rightArmPose = ModelBiped.ArmPose.EMPTY;
        this.textureWidth = 76;
        this.textureHeight = 64;
        this.b2c = new ModelRenderer(this, 58, 32);
        this.b2c.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.b2c.addBox(-0.5F, -6.0F, -0.5F, 1, 12, 1, 0.0F);
        this.setRotateAngle(b2c, 0.0F, 0.0F, 1.5707963267948966F);
        this.hr = new ModelRenderer(this, 56, 0);
        this.hr.setRotationPoint(-3.2F, -7.5F, -1.0F);
        this.hr.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(hr, 0.0F, 0.6632251157578453F, -0.08726646259971647F);
        this.rleg = new ModelRenderer(this, 0, 32);
        this.rleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.rleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.left = new ModelRenderer(this, 62, 48);
        this.left.setRotationPoint(5.0F, 6.5F, 2.5F);
        this.left.addBox(-2.0F, 0.0F, -2.5F, 2, 7, 5, 0.0F);
        this.setRotateAngle(left, 0.0F, 2.679953066437293F, -0.3141592653589793F);
        this.b4 = new ModelRenderer(this, 62, 32);
        this.b4.setRotationPoint(-3.5F, 0.0F, 2.0F);
        this.b4.addBox(-2.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.b2b = new ModelRenderer(this, 58, 32);
        this.b2b.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.b2b.addBox(-0.5F, 0.0F, -0.5F, 1, 10, 1, 0.0F);
        this.setRotateAngle(b2b, 0.0F, 0.0F, 0.2792526803190927F);
        this.l3 = new ModelRenderer(this, 54, 32);
        this.l3.setRotationPoint(-1.0F, 5.8F, 2.4F);
        this.l3.addBox(-0.5F, -7.0F, -1.7F, 1, 12, 1, 0.0F);
        this.body_1 = new ModelRenderer(this, 16, 16);
        this.body_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body_1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.b2d = new ModelRenderer(this, 58, 32);
        this.b2d.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.b2d.addBox(-0.5F, -7.0F, -0.5F, 1, 7, 1, 0.0F);
        this.head = new ModelRenderer(this, 32, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.body = new ModelRenderer(this, 16, 32);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.rarm_1 = new ModelRenderer(this, 40, 16);
        this.rarm_1.setRotationPoint(-5.0F, 2.5F, 0.0F);
        this.rarm_1.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.right = new ModelRenderer(this, 62, 48);
        this.right.setRotationPoint(-5.0F, 6.5F, 2.5F);
        this.right.addBox(-2.0F, 0.0F, -2.5F, 2, 7, 5, 0.0F);
        this.setRotateAngle(right, 0.0F, 0.46163958715250014F, 0.3141592653589793F);
        this.h1 = new ModelRenderer(this, 64, 0);
        this.h1.setRotationPoint(0.0F, -10.5F, 4.0F);
        this.h1.addBox(-1.5F, 0.0F, -2.0F, 3, 13, 2, 0.0F);
        this.setRotateAngle(h1, 0.43615778007338296F, 0.0F, 0.0F);
        this.b2 = new ModelRenderer(this, 58, 45);
        this.b2.setRotationPoint(0.0F, -10.0F, 2.0F);
        this.b2.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.lleg = new ModelRenderer(this, 0, 48);
        this.lleg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.lleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F);
        this.l1 = new ModelRenderer(this, 54, 32);
        this.l1.setRotationPoint(-1.0F, 5.8F, 0.0F);
        this.l1.addBox(-0.5F, -7.0F, -1.7F, 1, 12, 1, 0.0F);
        this.head_1 = new ModelRenderer(this, 0, 0);
        this.head_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head_1.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.hl = new ModelRenderer(this, 56, 0);
        this.hl.setRotationPoint(3.2F, -7.5F, -1.0F);
        this.hl.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(hl, 0.0F, -0.6632251157578453F, 0.08726646259971647F);
        this.r2 = new ModelRenderer(this, 54, 32);
        this.r2.setRotationPoint(-1.0F, 5.8F, 1.2F);
        this.r2.addBox(-0.5F, -7.0F, -1.7F, 1, 12, 1, 0.0F);
        this.r3 = new ModelRenderer(this, 54, 32);
        this.r3.setRotationPoint(-1.0F, 5.8F, 2.4F);
        this.r3.addBox(-0.5F, -7.0F, -1.7F, 1, 12, 1, 0.0F);
        this.back = new ModelRenderer(this, 54, 16);
        this.back.setRotationPoint(0.0F, 1.0F, 3.2F);
        this.back.addBox(-3.5F, -3.0F, 0.0F, 7, 11, 4, 0.0F);
        this.setRotateAngle(back, -0.13281955607676849F, 0.0F, 0.0F);
        this.l2 = new ModelRenderer(this, 54, 32);
        this.l2.setRotationPoint(-1.0F, 5.8F, 1.2F);
        this.l2.addBox(-0.5F, -7.0F, -1.7F, 1, 12, 1, 0.0F);
        this.b2a = new ModelRenderer(this, 58, 32);
        this.b2a.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.b2a.addBox(-0.5F, 0.0F, -0.5F, 1, 10, 1, 0.0F);
        this.setRotateAngle(b2a, 0.0F, 0.0F, -0.2792526803190927F);
        this.b1 = new ModelRenderer(this, 58, 31);
        this.b1.setRotationPoint(0.0F, 8.5F, 1.5F);
        this.b1.addBox(-0.5F, -6.0F, 0.0F, 1, 12, 1, 0.0F);
        this.setRotateAngle(b1, 0.0F, 0.0F, 1.5707963267948966F);
        this.b3a = new ModelRenderer(this, 62, 39);
        this.b3a.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.b3a.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
        this.larm_1 = new ModelRenderer(this, 32, 48);
        this.larm_1.setRotationPoint(5.0F, 2.5F, 0.0F);
        this.larm_1.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.r1 = new ModelRenderer(this, 54, 32);
        this.r1.setRotationPoint(-1.0F, 5.8F, 0.0F);
        this.r1.addBox(-0.5F, -7.0F, -1.7F, 1, 12, 1, 0.0F);
        this.b4a_1 = new ModelRenderer(this, 62, 39);
        this.b4a_1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.b4a_1.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
        this.b4a = new ModelRenderer(this, 62, 39);
        this.b4a.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.b4a.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
        this.b3 = new ModelRenderer(this, 62, 32);
        this.b3.setRotationPoint(-3.5F, 0.0F, 2.0F);
        this.b3.addBox(-2.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.b4_1 = new ModelRenderer(this, 62, 32);
        this.b4_1.setRotationPoint(3.5F, 0.0F, 2.0F);
        this.b4_1.addBox(-2.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(b4_1, 0.0F, 3.141592653589793F, 0.0F);
        this.larm = new ModelRenderer(this, 48, 48);
        this.larm.setRotationPoint(5.0F, 2.5F, 0.0F);
        this.larm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.25F);
        this.lleg_1 = new ModelRenderer(this, 16, 48);
        this.lleg_1.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.lleg_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rarm = new ModelRenderer(this, 40, 32);
        this.rarm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        this.rarm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.25F);
        this.rleg_1 = new ModelRenderer(this, 0, 16);
        this.rleg_1.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.rleg_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.b2e = new ModelRenderer(this, 58, 32);
        this.b2e.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.b2e.addBox(-0.5F, -4.0F, -0.5F, 1, 8, 1, 0.0F);
        this.setRotateAngle(b2e, 0.0F, 0.0F, 1.5707963267948966F);
        this.b2.addChild(this.b2c);
        this.head_1.addChild(this.hr);
        this.back.addChild(this.left);
        this.back.addChild(this.b4);
        this.b2.addChild(this.b2b);
        this.left.addChild(this.l3);
        this.b2.addChild(this.b2d);
        this.back.addChild(this.right);
        this.head_1.addChild(this.h1);
        this.back.addChild(this.b2);
        this.left.addChild(this.l1);
        this.head_1.addChild(this.hl);
        this.right.addChild(this.r2);
        this.right.addChild(this.r3);
        this.body.addChild(this.back);
        this.left.addChild(this.l2);
        this.b2.addChild(this.b2a);
        this.back.addChild(this.b1);
        this.b3.addChild(this.b3a);
        this.right.addChild(this.r1);
        this.b4_1.addChild(this.b4a_1);
        this.b4.addChild(this.b4a);
        this.back.addChild(this.b3);
        this.back.addChild(this.b4_1);
        this.b2.addChild(this.b2e);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.rleg.render(f5);
        this.body_1.render(f5);
        this.head.render(f5);
        this.body.render(f5);
        this.rarm_1.render(f5);
        this.lleg.render(f5);
        this.head_1.render(f5);
        this.larm_1.render(f5);
        this.larm.render(f5);
        this.lleg_1.render(f5);
        this.rarm.render(f5);
        this.rleg_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase)entityIn).getTicksElytraFlying() > 4;

        this.head_1.rotateAngleY = netHeadYaw * 0.017453292F;

        if (flag)
        {
            this.head_1.rotateAngleX = -((float)Math.PI / 4F);
        }
        else
        {
            this.head_1.rotateAngleX = headPitch * 0.017453292F;
        }

        this.body_1.rotateAngleY = 0.0F;
        this.rarm_1.rotationPointZ = 0.0F;
        this.rarm_1.rotationPointX = -5.0F;
        this.larm.rotationPointZ = 0.0F;
        this.larm_1.rotationPointX = 5.0F;
        float f = 1.0F;

        if (flag)
        {
            f = (float)(entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
            f = f / 0.2F;
            f = f * f * f;
        }

        if (f < 1.0F)
        {
            f = 1.0F;
        }

        this.rarm_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.larm_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.rarm_1.rotateAngleZ = 0.0F;
        this.larm_1.rotateAngleZ = 0.0F;
        this.rleg_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.lleg_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
        this.rleg_1.rotateAngleY = 0.0F;
        this.lleg_1.rotateAngleY = 0.0F;
        this.rleg_1.rotateAngleZ = 0.0F;
        this.lleg_1.rotateAngleZ = 0.0F;

        if (this.isRiding)
        {
            this.rarm_1.rotateAngleX += -((float)Math.PI / 5F);
            this.larm_1.rotateAngleX += -((float)Math.PI / 5F);
            this.rleg_1.rotateAngleX = -1.4137167F;
            this.rleg_1.rotateAngleY = ((float)Math.PI / 10F);
            this.rleg_1.rotateAngleZ = 0.07853982F;
            this.lleg_1.rotateAngleX = -1.4137167F;
            this.lleg_1.rotateAngleY = -((float)Math.PI / 10F);
            this.lleg_1.rotateAngleZ = -0.07853982F;
        }

        this.rarm_1.rotateAngleY = 0.0F;
        this.rarm_1.rotateAngleZ = 0.0F;

        switch (this.leftArmPose)
        {
            case EMPTY:
                this.larm_1.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.larm_1.rotateAngleX = this.larm_1.rotateAngleX * 0.5F - 0.9424779F;
                this.larm_1.rotateAngleY = 0.5235988F;
                break;
            case ITEM:
                this.larm_1.rotateAngleX = this.larm_1.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.larm_1.rotateAngleY = 0.0F;
        }

        switch (this.rightArmPose)
        {
            case EMPTY:
                this.rarm_1.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.rarm_1.rotateAngleX = this.rarm_1.rotateAngleX * 0.5F - 0.9424779F;
                this.rarm_1.rotateAngleY = -0.5235988F;
                break;
            case ITEM:
                this.rarm_1.rotateAngleX = this.rarm_1.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.rarm_1.rotateAngleY = 0.0F;
        }

//        if (this.swingProgress > 0.0F)
//        {
//            EnumHandSide enumhandside = this.getMainHand(entityIn);
//            ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
//            float f1 = this.swingProgress;
//            this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float)Math.PI * 2F)) * 0.2F;
//
//            if (enumhandside == EnumHandSide.LEFT)
//            {
//                this.body.rotateAngleY *= -1.0F;
//            }
//
//            this.rarm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
//            this.rarm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
//            this.larm_1.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
//            this.larm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
//            this.rarm.rotateAngleY += this.body.rotateAngleY;
//            this.larm.rotateAngleY += this.body.rotateAngleY;
//            this.larm.rotateAngleX += this.body.rotateAngleY;
//            f1 = 1.0F - this.swingProgress;
//            f1 = f1 * f1;
//            f1 = f1 * f1;
//            f1 = 1.0F - f1;
//            float f2 = MathHelper.sin(f1 * (float)Math.PI);
//            float f3 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
//            modelrenderer.rotateAngleX = (float)((double)modelrenderer.rotateAngleX - ((double)f2 * 1.2D + (double)f3));
//            modelrenderer.rotateAngleY += this.body.rotateAngleY * 2.0F;
//            modelrenderer.rotateAngleZ += MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F;
//        }

//        if (this.isSneak)
//        {
//            this.body.rotateAngleX = 0.5F;
//            this.rarm.rotateAngleX += 0.4F;
//            this.larm.rotateAngleX += 0.4F;
//            this.rleg.rotationPointZ = 4.0F;
//            this.lleg.rotationPointZ = 4.0F;
//            this.rleg.rotationPointY = 9.0F;
//            this.lleg.rotationPointY = 9.0F;
//            this.head.rotationPointY = 1.0F;
//        }
//        else
//        {
//            this.body.rotateAngleX = 0.0F;
//            this.rleg.rotationPointZ = 0.1F;
//            this.lleg.rotationPointZ = 0.1F;
//            this.rleg.rotationPointY = 12.0F;
//            this.lleg.rotationPointY = 12.0F;
//            this.head.rotationPointY = 0.0F;
//        }

        this.rarm_1.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.larm_1.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.rarm_1.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.larm_1.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

        if (this.rightArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
        {
            this.rarm_1.rotateAngleY = -0.1F + this.head.rotateAngleY;
            this.larm_1.rotateAngleY = 0.1F + this.head.rotateAngleY + 0.4F;
            this.rarm_1.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
            this.larm_1.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
        }
        else if (this.leftArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
        {
            this.rarm_1.rotateAngleY = -0.1F + this.head.rotateAngleY - 0.4F;
            this.larm_1.rotateAngleY = 0.1F + this.head.rotateAngleY;
            this.rarm_1.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
            this.larm_1.rotateAngleX = -((float)Math.PI / 2F) + this.head.rotateAngleX;
        }

        copyModelAngles(this.head_1, this.head);
        copyModelAngles(this.larm_1, this.larm);
        copyModelAngles(this.rarm_1, this.rarm);
        copyModelAngles(this.lleg_1, this.lleg);
        copyModelAngles(this.rleg_1, this.rleg);
        copyModelAngles(this.body_1, this.body);
    }
}
