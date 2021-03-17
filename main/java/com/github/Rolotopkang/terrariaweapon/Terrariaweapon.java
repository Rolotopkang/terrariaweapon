package com.github.Rolotopkang.terrariaweapon;

import com.github.Rolotopkang.terrariaweapon.crafting.FurnaceRecipeRegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Terrariaweapon.MODID, name = Terrariaweapon.NAME, version = Terrariaweapon.VERSION)
public class Terrariaweapon
{
    public static final String MODID = "terrariaweapon";
    public static final String NAME = "Terrariaweapon";
    public static final String VERSION = "1.0";


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @EventHandler
    public void init(FMLInitializationEvent event){
        FurnaceRecipeRegistryHandler.register();
    }

}
