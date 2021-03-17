package com.github.Rolotopkang.terrariaweapon.item;

import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import com.github.Rolotopkang.terrariaweapon.creativetab.TabTerrariaweapontools;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemSacredPickaxe extends ItemPickaxe {
    public ItemSacredPickaxe()
    {
        super(ItemRegistryHandler.SACRED_TOOL_MATERIAL);
        this.setUnlocalizedName(Terrariaweapon.MODID+".sacredpickaxe");
        this.setCreativeTab(TabTerrariaweapontools.TAB_TERRARIAWEAPONTOOLS);
        this.setRegistryName("sacred_pickaxe");
    }
    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();
        float Speed = super.getDestroySpeed(stack,state);
        return (block == Blocks.DIRT||block == Blocks.GRASS||block == Blocks.GRASS_PATH||block == Blocks.GRAVEL)? Speed*5:Speed;
    }
}
