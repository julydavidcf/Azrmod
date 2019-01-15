package com.Nagato.Azurlanemod.Entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityStuff extends EntityCow {
    public EntityStuff(World worldIn) {
        super(worldIn);
    }
    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntityStuff(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }


    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return super.getHurtSound(damageSourceIn);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

}
