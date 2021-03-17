package com.github.Rolotopkang.terrariaweapon.enchantment;

import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;

import javax.swing.text.html.parser.Entity;

public class EnchantmentExplosion extends Enchantment {
    public EnchantmentExplosion()
    {
        super(Rarity.VERY_RARE, EnumEnchantmentType.WEAPON,new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND,EntityEquipmentSlot.OFFHAND});
        this.setName(Terrariaweapon.MODID+".explosion");
        this.setRegistryName("explosion");
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 1+enchantmentLevel*5;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return 21+enchantmentLevel*5;
    }

    @Override
    protected boolean canApplyTogether(Enchantment ench) {
        return super.canApplyTogether(ench) && Enchantments.SWEEPING!=ench;
    }
}
