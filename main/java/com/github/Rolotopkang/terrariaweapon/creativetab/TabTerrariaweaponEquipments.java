package com.github.Rolotopkang.terrariaweapon.creativetab;

import com.github.Rolotopkang.terrariaweapon.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabTerrariaweaponEquipments extends CreativeTabs {
    public static final TabTerrariaweaponEquipments TAB_TERRARIAWEAPON_EQUIPMENTS=new TabTerrariaweaponEquipments();
    public TabTerrariaweaponEquipments()
    {
        super("terrariaweaponEquipments");
    }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistryHandler.SACRED_CHESTPLATE);
    }
}