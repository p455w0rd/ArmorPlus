/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.armors.origin.lapis;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
 * net.thedragonteam.armorplus.armors.origin.lapis
 * ArmorPlus created by sokratis12GR on 7/25/2016 10:08 AM.
 * - TheDragonTeam
 */
public class LapisLeggings extends BaseArmor {

    public LapisLeggings() {
        super(ModItems.lapisArmor, 0, EntityEquipmentSlot.LEGS, "lapis_leggings", new ItemStack(Items.DYE, 1, 4), Blocks.LAPIS_BLOCK, TextFormatting.DARK_BLUE);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;

        if (GameSettings.isKeyDown(keyBindSneak)) if (ARPConfig.enableLapisLBreathing) {
            tooltip.add("\2479Ability: " + "\247rWater Breathing ");
            tooltip.add("\2473Use: " + "\247rEquip A Piece");
        } else if (ARPConfig.enableFullLapisArmorEffect) {
            tooltip.add("\2479Ability: " + "\247rWater Breathing ");
            tooltip.add("\2473Use: " + "\247rEquip The Full Set");
        } else
            tooltip.add(I18n.format("tooltip.shift.showinfo", ChatFormatting.DARK_BLUE, keyBindSneak.getDisplayName(), ChatFormatting.GRAY));
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        if (ARPConfig.enableLapisLBreathing && !ARPConfig.enableFullLapisArmorEffect)
            entity.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 120, 0, true, true));
    }
}