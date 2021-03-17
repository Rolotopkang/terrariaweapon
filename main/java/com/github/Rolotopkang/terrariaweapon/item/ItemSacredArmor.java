package com.github.Rolotopkang.terrariaweapon.item;

import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import com.github.Rolotopkang.terrariaweapon.creativetab.TabTerrariaweaponEquipments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ItemSacredArmor extends ItemArmor {
    public ItemSacredArmor(EntityEquipmentSlot equipmentSlot)
    {
        super(ItemRegistryHandler.SACRED_ARMOR_MATERIAL,0,equipmentSlot);
        this.setCreativeTab(TabTerrariaweaponEquipments.TAB_TERRARIAWEAPON_EQUIPMENTS);
        this.setUnlocalizedName(Terrariaweapon.MODID+".sacredArmor."+equipmentSlot.getName());
        this.setRegistryName("sacred_armor_"+equipmentSlot.getName());
    }
}
