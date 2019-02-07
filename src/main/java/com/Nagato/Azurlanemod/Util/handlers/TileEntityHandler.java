package com.Nagato.Azurlanemod.Util.handlers;


import com.Nagato.Azurlanemod.Util.Reference;
import com.Nagato.Azurlanemod.blocks.machine.TileEntitySinteringFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
	GameRegistry.registerTileEntity(TileEntitySinteringFurnace.class, new ResourceLocation(Reference.MOD_ID + ":sintering_furnace"));
	}
}
