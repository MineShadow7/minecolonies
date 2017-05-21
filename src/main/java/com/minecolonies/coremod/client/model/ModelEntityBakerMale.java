package com.minecolonies.coremod.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEntityBakerMale extends ModelBiped
{
    //fields
    ModelRenderer top;
    ModelRenderer base;
    ModelRenderer middle;

    public ModelEntityBakerMale()
    {
        textureWidth = 128;
        textureHeight = 64;

        bipedRightArm = new ModelRenderer(this, 40, 16);
        bipedRightArm.addBox(-1F, -2F, -2F, 4, 12, 4);
        bipedRightArm.setRotationPoint(-7F, 2F, 0F);
        bipedRightArm.setTextureSize(128, 64);
        bipedRightArm.mirror = true;
        setRotation(bipedRightArm, 0F, 0F, 0F);

        bipedLeftArm = new ModelRenderer(this, 40, 16);
        bipedLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
        bipedLeftArm.setRotationPoint(5F, 2F, 0F);
        bipedLeftArm.setTextureSize(128, 64);
        bipedLeftArm.mirror = true;
        setRotation(bipedLeftArm, 0F, 0F, 0F);

        bipedRightLeg = new ModelRenderer(this, 0, 16);
        bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
        bipedRightLeg.setTextureSize(128, 64);
        bipedRightLeg.mirror = true;
        setRotation(bipedRightLeg, 0F, 0F, 0F);

        bipedLeftLeg = new ModelRenderer(this, 0, 16);
        bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
        bipedLeftLeg.setTextureSize(128, 64);
        bipedLeftLeg.mirror = true;
        setRotation(bipedLeftLeg, 0F, 0F, 0F);

        bipedBody = new ModelRenderer(this, 16, 16);
        bipedBody.addBox(-4F, 0F, -2F, 8, 12, 4);
        bipedBody.setRotationPoint(0F, 0F, 0F);
        bipedBody.setTextureSize(128, 64);
        bipedBody.mirror = true;
        setRotation(bipedBody, 0F, 0F, 0F);

        bipedHead = new ModelRenderer(this, 0, 0);
        bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8);
        bipedHead.setRotationPoint(0F, 0F, 0F);
        bipedHead.setTextureSize(128, 64);
        bipedHead.mirror = true;
        setRotation(bipedHead, 0F, 0F, 0F);

        top = new ModelRenderer(this, 0, 53);
        top.addBox(-2.5F, -11F, -4.6F, 5, 1, 7);
        top.setRotationPoint(0F, 0F, 0F);
        top.setTextureSize(128, 64);
        top.mirror = true;
        setRotation(top, -0.1858931F, 0F, 0F);

        base = new ModelRenderer(this, 0, 33);
        base.addBox(-4.5F, -9F, -5.8F, 9, 2, 9);
        base.setRotationPoint(0F, 0F, 0F);
        base.setTextureSize(128, 64);
        base.mirror = true;
        setRotation(base, -0.1858931F, 0F, 0F);

        middle = new ModelRenderer(this, 0, 44);
        middle.addBox(-3.5F, -10F, -5F, 7, 1, 8);
        middle.setRotationPoint(0F, 0F, 0F);
        middle.setTextureSize(128, 64);
        middle.mirror = true;
        setRotation(middle, -0.1858931F, 0F, 0F);

        bipedBody.addChild(base);
        bipedBody.addChild(middle);

        bipedHead.addChild(top);

        bipedHeadwear.isHidden = true;
    }

    public void render(final Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        /*bipedRightArm.render(f5);
        bipedLeftArm.render(f5);
        bipedRightLeg.render(f5);
        bipedLeftLeg.render(f5);
        bipedBody.render(f5);
        bipedHead.render(f5);
        top.render(f5);
        base.render(f5);
        middle.render(f5);*/
    }

    private void setRotation(final ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(
            final float limbSwing,
            final float limbSwingAmount,
            final float ageInTicks,
            final float netHeadYaw,
            final float headPitch,
            final float scaleFactor,
            final Entity entityIn)
    {
        final float bodyX = bipedBody.rotateAngleX;
        final float headX = bipedHead.rotateAngleX;
        bipedBody.rotateAngleX = bodyX;
        bipedHead.rotateAngleX = headX;
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }

}
