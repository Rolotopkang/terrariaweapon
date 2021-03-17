package com.github.Rolotopkang.terrariaweapon.crafting;

import com.github.Rolotopkang.terrariaweapon.item.ItemRegistryHandler;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class FurnaceRecipeRegistryHandler {
    public static void register() {
        //熔炉燃烧规则注册
        GameRegistry.addSmelting(ItemRegistryHandler.ITEM_SOUL_OF_FRIGHT, new ItemStack(ItemRegistryHandler.ITEM_SACRED_INGOT, 5), 1F);
        GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 2), 0.5F);
    }

    @SubscribeEvent
    public static void onFurnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event) {
        ResourceLocation registryName = event.getItemStack().getItem().getRegistryName();
        String registryNameResourceDomain = registryName.getResourceDomain();
        String registryNameResourcePath = registryName.getResourcePath();
        if ("minecraft".equals(registryNameResourceDomain) && "dirt".equals(registryNameResourcePath)) {
            event.setBurnTime(400);
        }
    }
}
