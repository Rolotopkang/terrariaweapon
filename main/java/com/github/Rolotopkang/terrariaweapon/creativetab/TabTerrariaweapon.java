package com.github.Rolotopkang.terrariaweapon.creativetab;

import com.github.Rolotopkang.terrariaweapon.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class TabTerrariaweapon extends CreativeTabs {
    //实例化创造模式物品栏
    public static final TabTerrariaweapon TAB_TERRARIAWEAPONT=new TabTerrariaweapon();
    //向父类传入名字
    public TabTerrariaweapon()
    {
        super("terrariaweapon");
    }
    //重载父类获取物品函数(传入的是创造模式模组图标)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistryHandler.ITEM_SILT);
    }
    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
    @Override
    public int getSearchbarWidth()
    {
        return 40;
    }
    @Override
    //背景地址（详情见Creativetabs）
    public String getBackgroundImageName()
    {
        return "terrariaweapon.png";
    }
}
