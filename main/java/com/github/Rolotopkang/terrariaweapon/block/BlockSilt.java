package com.github.Rolotopkang.terrariaweapon.block;

import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import com.github.Rolotopkang.terrariaweapon.creativetab.TabTerrariaweapon;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSilt extends Block {
    public BlockSilt()
    {
        super(Material.CLAY);
        this.setUnlocalizedName(Terrariaweapon.MODID+".silt");
        this.setRegistryName("silt");
        this.setHarvestLevel("shovel",0);
        this.setHardness(0.5F);
        this.setCreativeTab(TabTerrariaweapon.TAB_TERRARIAWEAPONT);
    }
}
