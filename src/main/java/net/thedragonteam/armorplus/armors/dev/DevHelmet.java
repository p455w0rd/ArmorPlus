/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.armors.dev;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.thedragonteam.armorplus.armors.base.BaseArmor;
import net.thedragonteam.armorplus.registry.ModItems;
import net.thedragonteam.armorplus.util.Utils;

/**
 * net.thedragonteam.armorplus.armors.dev
 * ArmorPlus created by sokratis12GR on 7/25/2016 10:08 AM.
 * - TheDragonTeam
 */
public class DevHelmet extends BaseArmor {

    public DevHelmet() {
        super(ModItems.devArmor, 0, EntityEquipmentSlot.HEAD, "dev_helmet", ModItems.devHelmet, ModItems.devHelmet, TextFormatting.BOLD);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        Utils.setUnbreakable(stack);
    }

    @Override
    public Item setCreativeTab(CreativeTabs tab) {
        return null;
    }
}