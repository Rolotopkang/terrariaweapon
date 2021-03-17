package com.github.Rolotopkang.terrariaweapon.item;

import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import com.github.Rolotopkang.terrariaweapon.creativetab.TabTerrariaweapon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemSmoothCoal extends Item {
    public ItemSmoothCoal()
    {
        this.setCreativeTab(TabTerrariaweapon.TAB_TERRARIAWEAPONT);
        this.setRegistryName("smooth_coal");
        this.setUnlocalizedName(Terrariaweapon.MODID+".smoothcoal");
        this.setMaxStackSize(64);
        this.setMaxDamage(0);
    }

    public int getItemBurnTime(ItemStack itemStack) {
        return 1200;
    }
}
