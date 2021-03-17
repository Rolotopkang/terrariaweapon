package com.github.Rolotopkang.terrariaweapon.item;


import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import com.github.Rolotopkang.terrariaweapon.block.BlockRegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegistryHandler {
    //注册新的工具护甲材质
    public static final Item.ToolMaterial SACRED_TOOL_MATERIAL = EnumHelper.addToolMaterial(
            "SACRED", 4, 0, 50.0F, 5.0F, 5);
    public static final ItemArmor.ArmorMaterial SACRED_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
            "SACRED", Terrariaweapon.MODID+":sacred",200,new int []{4,7,9,4},9, SoundEvents.ENTITY_ARROW_HIT_PLAYER,3);
    //物品注册新对象
    public static final ItemSacredIngot ITEM_SACRED_INGOT = new ItemSacredIngot();
    public static final ItemSoulOfFright ITEM_SOUL_OF_FRIGHT = new ItemSoulOfFright();
    public static final ItemSmoothCoal ITEM_SMOOTH_COAL=new ItemSmoothCoal();
    public static final ItemSacredPickaxe SACRED_PICKAXE = new ItemSacredPickaxe();
    //新盔甲注册
    public static final ItemSacredArmor SACRED_BOOTS = new ItemSacredArmor(EntityEquipmentSlot.FEET);
    public static final ItemSacredArmor SACRED_LEGGINGS = new ItemSacredArmor(EntityEquipmentSlot.LEGS);
    public static final ItemSacredArmor SACRED_CHESTPLATE = new ItemSacredArmor(EntityEquipmentSlot.CHEST);
    public static final ItemSacredArmor SACRED_HELMET = new ItemSacredArmor(EntityEquipmentSlot.HEAD);
    //方块物品注册新对象
    public static final ItemBlock ITEM_SILT =withRegistryName(new ItemBlock((BlockRegistryHandler.BLOCK_SILT)));
    //方块物品的注册名注册
    private static ItemBlock withRegistryName(ItemBlock item)
    {
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry<Item> registry = event.getRegistry();
        //物品注册
        registry.register(ITEM_SACRED_INGOT);
        registry.register(ITEM_SOUL_OF_FRIGHT);
        registry.register(ITEM_SMOOTH_COAL);
        registry.register(SACRED_PICKAXE);
        //盔甲注册
        registry.register(SACRED_HELMET);
        registry.register(SACRED_CHESTPLATE);
        registry.register(SACRED_LEGGINGS);
        registry.register(SACRED_BOOTS);
        //方块物品注册
        registry.register(ITEM_SILT);
    }
    //注册材质函数
    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item)
    {
        ModelResourceLocation modelResourceLocation= new ModelResourceLocation(item.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(item,0,modelResourceLocation);
    }
    //物品和方块材质连接(一定要记得连接！！！！！！！！！！！！！！)
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event)
    {
        registerModel(ITEM_SACRED_INGOT);
        registerModel(ITEM_SOUL_OF_FRIGHT);
        registerModel(ITEM_SILT);
        registerModel(ITEM_SMOOTH_COAL);
        registerModel(SACRED_PICKAXE);
        registerModel(SACRED_HELMET);
        registerModel(SACRED_CHESTPLATE);
        registerModel(SACRED_LEGGINGS);
        registerModel(SACRED_BOOTS);
    }
}
