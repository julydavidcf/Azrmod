package com.init;

import com.Nagato.Azurlanemod.Util.Reference;
import com.enchant.EnchantWaterwalk;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class WaterwalkEnchant {

    public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();

    public static final Enchantment WATERWALK = new EnchantWaterwalk();
@SubscribeEvent
    public static void waterwalkFunction(LivingEvent.LivingUpdateEvent event){
    EntityLivingBase living = event.getEntityLiving();
    int level = EnchantmentHelper.getMaxEnchantmentLevel(WATERWALK, living);
    BlockPos pos = living.getPosition();

    if(level > 0)
    {
        World world = event.getEntity().world;
            float f = 1;
            BlockPos.MutableBlockPos blockpos = new BlockPos.MutableBlockPos(0, 0, 0);

            for (BlockPos.MutableBlockPos blockpos1 : BlockPos.getAllInBoxMutable(pos.add((double)(-f), -1.0D, (double)(-f)), pos.add((double)f, -1.0D, (double)f)))
            {
                if (blockpos1.distanceSqToCenter(living.posX, living.posY, living.posZ) <= (double)(f * f))
                {
                    blockpos.setPos(blockpos1.getX(), blockpos1.getY() + 1, blockpos1.getZ());
                    IBlockState iblockstate = world.getBlockState(blockpos);

                    if (iblockstate.getMaterial() == Material.AIR)
                    {
                        IBlockState iblockstate1 = world.getBlockState(blockpos1);


                        if (iblockstate1.getMaterial() == Material.WATER && (iblockstate1.getBlock() == Blocks.WATER || iblockstate1.getBlock() == Blocks.FLOWING_WATER) && ((Integer)iblockstate1.getValue(BlockLiquid.LEVEL)).intValue() == 0 && living.motionY<0.0D)
                        {
     //                       world.setBlockState(blockpos1, Blocks.AIR.getDefaultState());
 //                           world.scheduleUpdate(blockpos1.toImmutable(), Blocks.AIR, MathHelper.getInt(living.getRNG(), 60, 120));



                            living.posY += -living.motionY;
                             living.motionY =0.0D;
                            living.fallDistance = 0.0F;
                            living.addPotionEffect(new PotionEffect(Potion.getPotionById(1)));
                        }
                    }
                }
            }
        }
  }

}
