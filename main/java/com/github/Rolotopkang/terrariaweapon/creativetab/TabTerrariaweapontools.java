package com.github.Rolotopkang.terrariaweapon.creativetab;

import com.github.Rolotopkang.terrariaweapon.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabTerrariaweapontools extends CreativeTabs {
    public static final TabTerrariaweapontools TAB_TERRARIAWEAPONTOOLS=new TabTerrariaweapontools();
    public TabTerrariaweapontools()
    {
        super("terrariaweapontools");
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistryHandler.SACRED_PICKAXE);
    }
}