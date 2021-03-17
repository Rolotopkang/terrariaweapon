package com.github.Rolotopkang.terrariaweapon.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockRegistryHandler {

    //方块注册新对象
    public static final BlockSilt BLOCK_SILT = new BlockSilt();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();

        // 方块注册
        registry.register(BLOCK_SILT);
    }

}
