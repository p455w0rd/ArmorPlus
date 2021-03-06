/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.api.crafting.ultitechbench.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thedragonteam.armorplus.api.crafting.ultitechbench.ShapedOreRecipe;
import net.thedragonteam.armorplus.api.crafting.ultitechbench.UltiTechBenchCraftingManager;
import net.thedragonteam.armorplus.registry.ModItems;

import static net.thedragonteam.armorplus.ARPConfig.*;

public class ModWeaponTierThreeRecipes {
    public void addRecipes(UltiTechBenchCraftingManager manager) {
        if (enableSwordsRecipes && recipes == 0) {
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianSword, 1),
                    "  G  ",
                    " GSG ",
                    "G S G",
                    "  S  ",
                    "  S  ",
                    'G', "scaleGuardian",
                    'S', Items.STICK));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonSword, 1),
                    "  E  ",
                    " ESE ",
                    "E S E",
                    "  S  ",
                    "  S  ",
                    'E', "scaleEnderDragon",
                    'S', Items.STICK));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarSword, 1),
                    "  W  ",
                    " WSW ",
                    "W S W",
                    "  S  ",
                    "  S  ",
                    'W', "witherBone",
                    'S', Items.STICK));
        }
        if (enableBattleAxesRecipes && recipes == 0) {
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianBattleAxe, 1),
                    " G G ",
                    "G S G",
                    " GSG ",
                    "  S  ",
                    "  S  ",
                    'G', "scaleGuardian",
                    'S', Items.STICK));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBattleAxe, 1),
                    " E E ",
                    "E S E",
                    " ESE ",
                    "  S  ",
                    "  S  ",
                    'E', "scaleEnderDragon",
                    'S', Items.STICK));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarBattleAxe, 1),
                    " W W ",
                    "W S W",
                    " WSW ",
                    "  S  ",
                    "  S  ",
                    'W', "witherBone",
                    'S', Items.STICK));
        }
        if (enableBowsRecipes && recipes == 0) {
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianBow, 1),
                    "  GGS",
                    " GG S",
                    "G   S",
                    " GG S",
                    "  GGS",
                    'G', "scaleGuardian",
                    'S', "gemPrismarine"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianBow, 1),
                    "SGG  ",
                    "S GG ",
                    "S   G",
                    "S GG ",
                    "SGG  ",
                    'G', "scaleGuardian",
                    'S', "gemPrismarine"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBow, 1),
                    "  EES",
                    " EE S",
                    "E   S",
                    " EE S",
                    "  EES",
                    'E', "scaleEnderDragon",
                    'S', "string"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBow, 1),
                    "SEE  ",
                    "S EE ",
                    "S   E",
                    "S EE ",
                    "SEE  ",
                    'E', "scaleEnderDragon",
                    'S', "string"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarBow, 1),
                    "  WWS",
                    " WW S",
                    "N   S",
                    " WW S",
                    "  WWS",
                    'W', "witherBone",
                    'S', "string"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarBow, 1),
                    "SWW  ",
                    "S WW ",
                    "S   W",
                    "S WW ",
                    "SWW  ",
                    'W', "witherBone",
                    'S', "string"));
        }
        if (enableSwordsRecipes && recipes == 1) {
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianSword, 1),
                    "  G  ",
                    " GSG ",
                    "G S G",
                    "  S  ",
                    "  S  ",
                    'G', "scaleGuardian",
                    'S', "gemPrismarine"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonSword, 1),
                    "  E  ",
                    " ESE ",
                    "E S E",
                    "  S  ",
                    "  S  ",
                    'E', "scaleEnderDragon",
                    'S', Items.DRAGON_BREATH));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarSword, 1),
                    "  H  ",
                    " WSW ",
                    "W S W",
                    "  S  ",
                    "  S  ",
                    'W', "witherBone",
                    'S', Items.NETHER_STAR,
                    'H', new ItemStack(Items.SKULL, 1, 1)));
        }
        if (enableBattleAxesRecipes && recipes == 1) {
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianBattleAxe, 1),
                    " G G ",
                    "G S G",
                    " GSG ",
                    "  S  ",
                    "  S  ",
                    'G', "scaleGuardian",
                    'S', "gemPrismarine"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBattleAxe, 1),
                    " E E ",
                    "E S E",
                    " ESE ",
                    "  S  ",
                    "  S  ",
                    'E', "scaleEnderDragon",
                    'S', Items.DRAGON_BREATH));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarBattleAxe, 1),
                    " W W ",
                    "W H W",
                    " WSW ",
                    "  S  ",
                    "  S  ",
                    'W', "witherBone",
                    'S', Items.NETHER_STAR,
                    'H', new ItemStack(Items.SKULL, 1, 1)));
        }
        if (enableBowsRecipes && recipes == 1) {
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianBow, 1),
                    "  GGS",
                    " GG S",
                    "G   S",
                    " GG S",
                    "  GGS",
                    'G', "scaleGuardian",
                    'S', "gemPrismarine"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.guardianBow, 1),
                    "SGG  ",
                    "S GG ",
                    "S   G",
                    "S GG ",
                    "SGG  ",
                    'G', "scaleGuardian",
                    'S', "gemPrismarine"));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBow, 1),
                    "  EES",
                    " DE S",
                    "D   S",
                    " DE S",
                    "  EES",
                    'E', "scaleEnderDragon",
                    'S', "string",
                    'D', Items.DRAGON_BREATH));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.enderDragonBow, 1),
                    "SEE  ",
                    "S ED ",
                    "S   D",
                    "S ED ",
                    "SEE  ",
                    'E', "scaleEnderDragon",
                    'S', "string",
                    'D', Items.DRAGON_BREATH));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarBow, 1),
                    "  WWS",
                    " NW S",
                    "N   S",
                    " NW S",
                    "  WWS",
                    'W', "witherBone",
                    'S', "string",
                    'N', new ItemStack(Items.SKULL, 1, 1)));
            manager.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.superStarBow, 1),
                    "SWW  ",
                    "S WN ",
                    "S   N",
                    "S WN ",
                    "SWW  ",
                    'W', "witherBone",
                    'S', "string",
                    'N', new ItemStack(Items.SKULL, 1, 1)));
        }
    }
}
