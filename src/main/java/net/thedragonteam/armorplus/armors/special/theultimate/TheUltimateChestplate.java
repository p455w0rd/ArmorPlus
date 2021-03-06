/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.armors.special.theultimate;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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
import net.thedragonteam.armorplus.util.Utils;

import java.util.List;

import static net.thedragonteam.armorplus.ARPConfig.enableTheUltimateArmorDeBuffs;

/**
 * net.thedragonteam.armorplus.armors.special.theultimate
 * ArmorPlus created by sokratis12GR on 7/25/2016 10:08 AM.
 * - TheDragonTeam
 */
public class TheUltimateChestplate extends BaseArmor {

    public TheUltimateChestplate() {
        super(ModItems.theUltimateArmor, 0, EntityEquipmentSlot.CHEST, "the_ultimate_chestplate_full", ModItems.theUltimateMaterial, ModItems.theUltimateMaterial, TextFormatting.GREEN);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return false;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;

        if (GameSettings.isKeyDown(keyBindSneak)) {
            tooltip.add("\2479Ability: " + "\247rThe Most OverPowered Armor");
            tooltip.add("\2473Use: " + "\247rEquip The Full Set");
        } else
            tooltip.add(I18n.format("tooltip.shift.showinfo", ChatFormatting.GREEN, keyBindSneak.getDisplayName(), ChatFormatting.GRAY));
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        Utils.setUnbreakable(stack);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        if (ARPConfig.enableFlightAbility)
            if (head != null && head.getItem() == ModItems.theUltimateHelmet && chest != null && chest.getItem() == ModItems.theUltimateChestplate && legs != null && legs.getItem() == ModItems.theUltimateLeggings && feet != null && feet.getItem() == ModItems.theUltimateBoots || entity.capabilities.isCreativeMode || entity.isSpectator())
                entity.capabilities.allowFlying = true;
            else {
                entity.capabilities.isFlying = false;
                entity.capabilities.allowFlying = false;
            }
        if (ARPConfig.enableTheUltimateArmorInvincibility)
            if (head != null && head.getItem() == ModItems.theUltimateHelmet && chest != null && chest.getItem() == ModItems.theUltimateChestplate && legs != null && legs.getItem() == ModItems.theUltimateLeggings && feet != null && feet.getItem() == ModItems.theUltimateBoots || entity.capabilities.isCreativeMode || entity.isSpectator())
                entity.capabilities.disableDamage = true;
            else entity.capabilities.disableDamage = false;
        if (head != null && head.getItem() == ModItems.theUltimateHelmet && chest != null && chest.getItem() == ModItems.theUltimateChestplate && legs != null && legs.getItem() == ModItems.theUltimateLeggings && feet != null && feet.getItem() == ModItems.theUltimateBoots || entity.capabilities.isCreativeMode || entity.isSpectator()) {
        } else if (enableTheUltimateArmorDeBuffs) {
            entity.addPotionEffect(new PotionEffect(MobEffects.POISON, 60, 2, true, true));
            entity.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 60, 2, true, true));
            entity.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 60, 0, true, true));

            entity.motionX = 0;
            if (((EntityLivingBase) entity).onGround)
                entity.motionY = 0;
            entity.motionZ = 0;
            ((EntityPlayer) entity).velocityChanged = true; // assumes that entity instanceof EntityPlayer
        }
    }
}