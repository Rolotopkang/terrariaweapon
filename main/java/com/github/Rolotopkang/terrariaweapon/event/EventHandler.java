package com.github.Rolotopkang.terrariaweapon.event;

import com.github.Rolotopkang.terrariaweapon.Terrariaweapon;
import com.github.Rolotopkang.terrariaweapon.enchantment.EnchantmentRegistryHandler;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler {

    //进入世界发布模组信息
    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (!entity.world.isRemote && entity instanceof EntityPlayer) {
            entity.sendMessage(new TextComponentTranslation("message.terrariaweapon.welcome", Terrariaweapon.NAME, entity.getName()));
        }
    }

    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {

        Entity source = event.getSource().getImmediateSource();
        if (source instanceof EntityPlayer && !source.world.isRemote) {
            EntityPlayer player = (EntityPlayer) source;
            String debug= "living has been killed";
            TextComponentString text = new TextComponentString(debug);
            player.sendMessage(text);
            ItemStack heldItemMainhand = player.getHeldItemMainhand();
            int level = EnchantmentHelper.getEnchantmentLevel(
                    EnchantmentRegistryHandler.EXPLOSION, heldItemMainhand);
            if (level > 0) {
                Entity target = event.getEntity();
                target.world.createExplosion(null,
                        target.posX, target.posY, target.posZ, 2 * level, false);
            }
        }
    }


}
