/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.armors.tconstruct.pigiron;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.thedragonteam.armorplus.armors.base.BaseArmor;
import net.thedragonteam.armorplus.registry.ModItems;

import java.util.List;

/**
 * net.thedragonteam.armorplus.armors.tconstruct.pigiron
 * ArmorPlus created by sokratis12GR on 7/25/2016 10:08 AM.
 * - TheDragonTeam
 */
public class PigIronBoots extends BaseArmor {

    public PigIronBoots() {
        super(ModItems.pigIronArmor, 0, EntityEquipmentSlot.FEET, "pig_iron_boots", new ItemStack(Item.getByNameOrId("tconstruct:ingots"), 1, 4), new ItemStack(Item.getByNameOrId("tconstruct:metal"), 1, 4), TextFormatting.LIGHT_PURPLE);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        final KeyBinding keyBindSneak = Minecraft.getMinecraft().gameSettings.keyBindSneak;

        if (GameSettings.isKeyDown(keyBindSneak)) {
            tooltip.add("\2479Ability: " + "\247rSaturation");
            tooltip.add("\2473Use: " + "\247rEquip The Full Set");
        } else
            tooltip.add(I18n.format("tooltip.shift.showinfo", ChatFormatting.LIGHT_PURPLE, keyBindSneak.getDisplayName(), ChatFormatting.GRAY));
    }
}