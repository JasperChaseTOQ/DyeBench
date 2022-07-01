package me.jasperchasetoq.dyebench.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.jasperchasetoq.dyebench.DyeBench;
import me.jasperchasetoq.dyebench.DyebenchItems;
import me.jasperchasetoq.dyebench.implemention.machines.TheDyeBench;
import me.jasperchasetoq.dyebench.implemention.items.Pigments;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

    public class DyeBenchItemsSetup {
        private DyeBenchItemsSetup() {
        }

        public static void setup(@Nonnull DyeBench plugin) {


            //machines
            new TheDyeBench(DyebenchItems.DB_MACHINES, DyebenchItems.DB_DYEBENCH, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.WHITE_WOOL, 1), new ItemStack(Material.WHITE_TERRACOTTA, 1), new ItemStack(Material.WHITE_BANNER, 1),
                            new ItemStack(Material.WHITE_BED, 1), new ItemStack(Material.LOOM, 1), new ItemStack(Material.WHITE_CANDLE, 1),
                            new ItemStack(Material.WHITE_SHULKER_BOX, 1), new ItemStack(Material.WHITE_CONCRETE, 1), new ItemStack(Material.WHITE_STAINED_GLASS, 1),
                    }).register(plugin);
            //pigments
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_WHITE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.WHITE_DYE, 64), new ItemStack(Material.WHITE_DYE, 64), new ItemStack(Material.WHITE_DYE, 64),
                            new ItemStack(Material.WHITE_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.WHITE_DYE, 64),
                            new ItemStack(Material.WHITE_DYE, 64), new ItemStack(Material.WHITE_DYE, 64), new ItemStack(Material.WHITE_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_ORANGE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.ORANGE_DYE, 64), new ItemStack(Material.ORANGE_DYE, 64), new ItemStack(Material.ORANGE_DYE, 64),
                            new ItemStack(Material.ORANGE_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.ORANGE_DYE, 64),
                            new ItemStack(Material.ORANGE_DYE, 64), new ItemStack(Material.ORANGE_DYE, 64), new ItemStack(Material.ORANGE_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_MAGENTA_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.MAGENTA_DYE, 64), new ItemStack(Material.MAGENTA_DYE, 64), new ItemStack(Material.MAGENTA_DYE, 64),
                            new ItemStack(Material.MAGENTA_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.MAGENTA_DYE, 64),
                            new ItemStack(Material.MAGENTA_DYE, 64), new ItemStack(Material.MAGENTA_DYE, 64), new ItemStack(Material.MAGENTA_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_LIGHT_BLUE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.LIGHT_BLUE_DYE, 64), new ItemStack(Material.LIGHT_BLUE_DYE, 64), new ItemStack(Material.LIGHT_BLUE_DYE, 64),
                            new ItemStack(Material.LIGHT_BLUE_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.LIGHT_BLUE_DYE, 64),
                            new ItemStack(Material.LIGHT_BLUE_DYE, 64), new ItemStack(Material.LIGHT_BLUE_DYE, 64), new ItemStack(Material.LIGHT_BLUE_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_YELLOW_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.YELLOW_DYE, 64), new ItemStack(Material.YELLOW_DYE, 64), new ItemStack(Material.YELLOW_DYE, 64),
                            new ItemStack(Material.YELLOW_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.YELLOW_DYE, 64),
                            new ItemStack(Material.YELLOW_DYE, 64), new ItemStack(Material.YELLOW_DYE, 64), new ItemStack(Material.YELLOW_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_LIME_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.LIME_DYE, 64), new ItemStack(Material.LIME_DYE, 64), new ItemStack(Material.LIME_DYE, 64),
                            new ItemStack(Material.LIME_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.LIME_DYE, 64),
                            new ItemStack(Material.LIME_DYE, 64), new ItemStack(Material.LIME_DYE, 64), new ItemStack(Material.LIME_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_PINK_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.PINK_DYE, 64), new ItemStack(Material.PINK_DYE, 64), new ItemStack(Material.PINK_DYE, 64),
                            new ItemStack(Material.PINK_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.PINK_DYE, 64),
                            new ItemStack(Material.PINK_DYE, 64), new ItemStack(Material.PINK_DYE, 64), new ItemStack(Material.PINK_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_GRAY_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.GRAY_DYE, 64), new ItemStack(Material.GRAY_DYE, 64), new ItemStack(Material.GRAY_DYE, 64),
                            new ItemStack(Material.GRAY_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.GRAY_DYE, 64),
                            new ItemStack(Material.GRAY_DYE, 64), new ItemStack(Material.GRAY_DYE, 64), new ItemStack(Material.GRAY_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_LIGHT_GRAY_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.LIGHT_GRAY_DYE, 64), new ItemStack(Material.LIGHT_GRAY_DYE, 64), new ItemStack(Material.LIGHT_GRAY_DYE, 64),
                            new ItemStack(Material.LIGHT_GRAY_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.LIGHT_GRAY_DYE, 64),
                            new ItemStack(Material.LIGHT_GRAY_DYE, 64), new ItemStack(Material.LIGHT_GRAY_DYE, 64), new ItemStack(Material.LIGHT_GRAY_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_CYAN_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.CYAN_DYE, 64), new ItemStack(Material.CYAN_DYE, 64), new ItemStack(Material.CYAN_DYE, 64),
                            new ItemStack(Material.CYAN_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.CYAN_DYE, 64),
                            new ItemStack(Material.CYAN_DYE, 64), new ItemStack(Material.CYAN_DYE, 64), new ItemStack(Material.CYAN_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_PURPLE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.PURPLE_DYE, 64), new ItemStack(Material.PURPLE_DYE, 64), new ItemStack(Material.PURPLE_DYE, 64),
                            new ItemStack(Material.PURPLE_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.PURPLE_DYE, 64),
                            new ItemStack(Material.PURPLE_DYE, 64), new ItemStack(Material.PURPLE_DYE, 64), new ItemStack(Material.PURPLE_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_BLUE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.BLUE_DYE, 64), new ItemStack(Material.BLUE_DYE, 64), new ItemStack(Material.BLUE_DYE, 64),
                            new ItemStack(Material.BLUE_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.BLUE_DYE, 64),
                            new ItemStack(Material.BLUE_DYE, 64), new ItemStack(Material.BLUE_DYE, 64), new ItemStack(Material.BLUE_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_BROWN_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.BROWN_DYE, 64), new ItemStack(Material.BROWN_DYE, 64), new ItemStack(Material.BROWN_DYE, 64),
                            new ItemStack(Material.BROWN_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.BROWN_DYE, 64),
                            new ItemStack(Material.BROWN_DYE, 64), new ItemStack(Material.BROWN_DYE, 64), new ItemStack(Material.BROWN_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_GREEN_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.GREEN_DYE, 64), new ItemStack(Material.GREEN_DYE, 64), new ItemStack(Material.GREEN_DYE, 64),
                            new ItemStack(Material.GREEN_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.GREEN_DYE, 64),
                            new ItemStack(Material.GREEN_DYE, 64), new ItemStack(Material.GREEN_DYE, 64), new ItemStack(Material.GREEN_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_RED_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.RED_DYE, 64), new ItemStack(Material.RED_DYE, 64), new ItemStack(Material.RED_DYE, 64),
                            new ItemStack(Material.RED_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.RED_DYE, 64),
                            new ItemStack(Material.RED_DYE, 64), new ItemStack(Material.RED_DYE, 64), new ItemStack(Material.RED_DYE, 64),
                    }).register(plugin);
            new Pigments(DyebenchItems.DB_PIGMENTS, DyebenchItems.DB_BLACK_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.BLACK_DYE, 64), new ItemStack(Material.BLACK_DYE, 64), new ItemStack(Material.BLACK_DYE, 64),
                            new ItemStack(Material.BLACK_DYE, 64), new ItemStack(Material.LOOM, 1), new ItemStack(Material.BLACK_DYE, 64),
                            new ItemStack(Material.BLACK_DYE, 64), new ItemStack(Material.BLACK_DYE, 64), new ItemStack(Material.BLACK_DYE, 64),
                    }).register(plugin);
            //Dyeable Blocks
            new SlimefunItem(DyebenchItems.DB_DYEABLE_BLOCKS, DyebenchItems.DB_DYEABLE_WOOL, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyebenchItems.DB_DYEABLE_WOOL, null, null, null, null,}).register(plugin);
            //info
            new SlimefunItem(DyebenchItems.DB_INFO, DyebenchItems.DB_MC_VERSION, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, null, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyebenchItems.DB_INFO, DyebenchItems.DB_SF_BUILD, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, null, null, null, null, null,}).register(plugin);
        }
    }

