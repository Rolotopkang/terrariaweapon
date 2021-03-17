package com.github.Rolotopkang.terrariaweapon.item;

import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import com.github.Rolotopkang.terrariaweapon.creativetab.TabTerrariaweapon;
import net.minecraft.item.Item;

public class ItemSacredIngot extends Item
{
    public ItemSacredIngot()
    {
        this.setUnlocalizedName(Terrariaweapon.MODID+".sacredingot");
        this.setRegistryName("sacred_ingot");
        this.setMaxStackSize(64);
        this.setCreativeTab(TabTerrariaweapon.TAB_TERRARIAWEAPONT);
    }
}
