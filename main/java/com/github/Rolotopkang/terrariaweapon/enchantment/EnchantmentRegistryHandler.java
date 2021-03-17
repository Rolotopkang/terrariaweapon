package com.github.Rolotopkang.terrariaweapon.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class EnchantmentRegistryHandler {
    //注册附魔静态字段
    public static final EnchantmentExplosion EXPLOSION =new EnchantmentExplosion();


    //注册附魔
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Enchantment> event)
    {
        IForgeRegistry<Enchantment> registry =event.getRegistry();
        registry.register(EXPLOSION);
    }
}