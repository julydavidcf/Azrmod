package com.items.food;

import com.Nagato.Azurlanemod.Util.IHasMod;
import com.init.ModBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemOilseed extends FoodBase implements IHasMod, IPlantable {

    public ItemOilseed(String name,int amount,float saturation,boolean isAnimalFood){

        super(name,amount,saturation,isAnimalFood);
//        setUnlocalizedName(name);
//        setRegistryName(name);
//
//        setCreativeTab(CreativeTabs.FOOD);
//
//        ModItems.ITEMS.add(this);
    }


//    @Override
//    public void registerModels() {
//        Azurlanemod.proxy.registerItemRender(this,0,"inventory");
//    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Crop;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        IBlockState state  = worldIn.getBlockState(pos);
        if(facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing),facing,stack)&&state.getBlock().canSustainPlant(state,worldIn,pos,EnumFacing.UP,this)&&worldIn.isAirBlock(pos.up())){
            worldIn.setBlockState(pos.up(),ModBlock.OIL_PLANT.getDefaultState());
            stack.shrink(1);
            return EnumActionResult.SUCCESS;
        }
        else return EnumActionResult.FAIL;
    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
       return ModBlock.OIL_PLANT.getDefaultState();
    }
}
