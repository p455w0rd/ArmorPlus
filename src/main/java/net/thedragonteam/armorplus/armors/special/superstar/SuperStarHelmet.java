/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.armors.special.superstar;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.thedragonteam.armorplus.ARPConfig;
import net.thedragonteam.armorplus.armors.base.BaseArmor;
import net.thedragonteam.armorplus.registry.ModItems;

import java.util.List;

/**
 * net.thedragonteam.armorplus.armors.special.superstar
 * ArmorPlus created by sokratis12GR on 7/25/2016 10:08 AM.
 * - TheDragonTeam
 */
public class SuperStarHelmet extends BaseArmor {

    public SuperStarHelmet() {
        super(ModItems.superStarArmor, 0, EntityEquipmentSlot.HEAD, "super_star_helmet", ModItems.witherBone, ModItems.witherBone, TextFormatting.WHITE);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;

        if (GameSettings.isKeyDown(keyBindSneak)) {
            int superstarArmorEffectlevel = ARPConfig.superstarArmorEffectlevel + 1;
            if (ARPConfig.enableSuperStarLRegen) {
                tooltip.add("\2479Ability: " + "\247rRegeneration " + superstarArmorEffectlevel);
                tooltip.add("\2473Use: " + "\247rEquip A Piece");
            } else if (ARPConfig.enableFullSuperStarArmorEffect) {
                tooltip.add("\2479Ability: " + "\247rRegeneration " + superstarArmorEffectlevel);
                tooltip.add("\2473Use: " + "\247rEquip The Full Set");
            }
        } else
            tooltip.add(I18n.format("tooltip.shift.showinfo", ChatFormatting.WHITE, keyBindSneak.getDisplayName(), ChatFormatting.GRAY));
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        if (ARPConfig.enableSuperStarHRegen && !ARPConfig.enableFullSuperStarArmorEffect) {
            entity.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 120, ARPConfig.superstarArmorEffectlevel, true, true));
            entity.removePotionEffect(MobEffects.WITHER);
        }
    }
}