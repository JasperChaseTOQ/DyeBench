package me.jasperchasetoq.dyebench.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.jasperchasetoq.dyebench.DyeBench;
import me.jasperchasetoq.dyebench.DyeBenchItems;
import me.jasperchasetoq.dyebench.implemention.machines.TheDyeBench;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

    public class DyeBenchItemsSetup {
        private DyeBenchItemsSetup() {
        }

        public static void setup(@Nonnull DyeBench plugin) {


            //machines
            new TheDyeBench(DyeBenchItems.DB_MACHINES, DyeBenchItems.DB_DYEBENCH, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            SlimefunItems.RAINBOW_WOOL, SlimefunItems.RAINBOW_WOOL, SlimefunItems.RAINBOW_WOOL,
                            SlimefunItems.RAINBOW_WOOL, new ItemStack(Material.LOOM),SlimefunItems.RAINBOW_WOOL,
                            SlimefunItems.RAINBOW_WOOL, SlimefunItems.RAINBOW_WOOL, SlimefunItems.RAINBOW_WOOL,
                    }).register(plugin);
            //pigments
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_WHITE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.WHITE_DYE), new ItemStack(Material.WHITE_DYE), new ItemStack(Material.WHITE_DYE),
                            new ItemStack(Material.WHITE_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.WHITE_DYE),
                            new ItemStack(Material.WHITE_DYE), new ItemStack(Material.WHITE_DYE), new ItemStack(Material.WHITE_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_ORANGE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.ORANGE_DYE), new ItemStack(Material.ORANGE_DYE), new ItemStack(Material.ORANGE_DYE),
                            new ItemStack(Material.ORANGE_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.ORANGE_DYE),
                            new ItemStack(Material.ORANGE_DYE), new ItemStack(Material.ORANGE_DYE), new ItemStack(Material.ORANGE_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_MAGENTA_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.MAGENTA_DYE), new ItemStack(Material.MAGENTA_DYE), new ItemStack(Material.MAGENTA_DYE),
                            new ItemStack(Material.MAGENTA_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.MAGENTA_DYE),
                            new ItemStack(Material.MAGENTA_DYE), new ItemStack(Material.MAGENTA_DYE), new ItemStack(Material.MAGENTA_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_LIGHT_BLUE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.LIGHT_BLUE_DYE), new ItemStack(Material.LIGHT_BLUE_DYE), new ItemStack(Material.LIGHT_BLUE_DYE),
                            new ItemStack(Material.LIGHT_BLUE_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.LIGHT_BLUE_DYE),
                            new ItemStack(Material.LIGHT_BLUE_DYE), new ItemStack(Material.LIGHT_BLUE_DYE), new ItemStack(Material.LIGHT_BLUE_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_YELLOW_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.YELLOW_DYE), new ItemStack(Material.YELLOW_DYE), new ItemStack(Material.YELLOW_DYE),
                            new ItemStack(Material.YELLOW_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.YELLOW_DYE),
                            new ItemStack(Material.YELLOW_DYE), new ItemStack(Material.YELLOW_DYE), new ItemStack(Material.YELLOW_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_LIME_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.LIME_DYE), new ItemStack(Material.LIME_DYE), new ItemStack(Material.LIME_DYE),
                            new ItemStack(Material.LIME_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.LIME_DYE),
                            new ItemStack(Material.LIME_DYE), new ItemStack(Material.LIME_DYE), new ItemStack(Material.LIME_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_PINK_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.PINK_DYE), new ItemStack(Material.PINK_DYE), new ItemStack(Material.PINK_DYE),
                            new ItemStack(Material.PINK_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.PINK_DYE),
                            new ItemStack(Material.PINK_DYE), new ItemStack(Material.PINK_DYE), new ItemStack(Material.PINK_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_GRAY_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.GRAY_DYE), new ItemStack(Material.GRAY_DYE), new ItemStack(Material.GRAY_DYE),
                            new ItemStack(Material.GRAY_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.GRAY_DYE),
                            new ItemStack(Material.GRAY_DYE), new ItemStack(Material.GRAY_DYE), new ItemStack(Material.GRAY_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_LIGHT_GRAY_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.LIGHT_GRAY_DYE), new ItemStack(Material.LIGHT_GRAY_DYE), new ItemStack(Material.LIGHT_GRAY_DYE),
                            new ItemStack(Material.LIGHT_GRAY_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.LIGHT_GRAY_DYE),
                            new ItemStack(Material.LIGHT_GRAY_DYE), new ItemStack(Material.LIGHT_GRAY_DYE), new ItemStack(Material.LIGHT_GRAY_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_CYAN_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.CYAN_DYE), new ItemStack(Material.CYAN_DYE), new ItemStack(Material.CYAN_DYE),
                            new ItemStack(Material.CYAN_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.CYAN_DYE),
                            new ItemStack(Material.CYAN_DYE), new ItemStack(Material.CYAN_DYE), new ItemStack(Material.CYAN_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_PURPLE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.PURPLE_DYE), new ItemStack(Material.PURPLE_DYE), new ItemStack(Material.PURPLE_DYE),
                            new ItemStack(Material.PURPLE_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.PURPLE_DYE),
                            new ItemStack(Material.PURPLE_DYE), new ItemStack(Material.PURPLE_DYE), new ItemStack(Material.PURPLE_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_BLUE_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.BLUE_DYE), new ItemStack(Material.BLUE_DYE), new ItemStack(Material.BLUE_DYE),
                            new ItemStack(Material.BLUE_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.BLUE_DYE),
                            new ItemStack(Material.BLUE_DYE), new ItemStack(Material.BLUE_DYE), new ItemStack(Material.BLUE_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_BROWN_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.BROWN_DYE), new ItemStack(Material.BROWN_DYE), new ItemStack(Material.BROWN_DYE),
                            new ItemStack(Material.BROWN_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.BROWN_DYE),
                            new ItemStack(Material.BROWN_DYE), new ItemStack(Material.BROWN_DYE), new ItemStack(Material.BROWN_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_GREEN_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.GREEN_DYE), new ItemStack(Material.GREEN_DYE), new ItemStack(Material.GREEN_DYE),
                            new ItemStack(Material.GREEN_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.GREEN_DYE),
                            new ItemStack(Material.GREEN_DYE), new ItemStack(Material.GREEN_DYE), new ItemStack(Material.GREEN_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_RED_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.RED_DYE), new ItemStack(Material.RED_DYE), new ItemStack(Material.RED_DYE),
                            new ItemStack(Material.RED_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.RED_DYE),
                            new ItemStack(Material.RED_DYE), new ItemStack(Material.RED_DYE), new ItemStack(Material.RED_DYE),
                    }).register(plugin);
            new UnplaceableBlock(DyeBenchItems.DB_PIGMENTS, DyeBenchItems.DB_BLACK_PIGMENT, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.BLACK_DYE), new ItemStack(Material.BLACK_DYE), new ItemStack(Material.BLACK_DYE),
                            new ItemStack(Material.BLACK_DYE), new ItemStack(Material.LOOM), new ItemStack(Material.BLACK_DYE),
                            new ItemStack(Material.BLACK_DYE), new ItemStack(Material.BLACK_DYE), new ItemStack(Material.BLACK_DYE),
                    }).register(plugin);
            //Dyeable Blocks
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_WOOL, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_GLASS, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_GLASS_PANES, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_CARPET, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_CANDLES, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_TERRACOTTA, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_GLAZED_TERRACOTTA, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_SHULKER_BOXES, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_CONCRETE_POWDER, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_CONCRETE, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_DYEABLE_BLOCKS, DyeBenchItems.DB_DYEABLE_BEDS, RecipeType.NULL,
                    new ItemStack[]{null, null, null, null, DyeBenchItems.DB_DYEBENCH, null, null, null, null,}).register(plugin);

            //addon info
            new SlimefunItem(DyeBenchItems.DB_INFO, DyeBenchItems.DB_MC_VERSION, RecipeType.NULL,
                    new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_INFO, DyeBenchItems.DB_JAVA_VERSION, RecipeType.NULL,
                    new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_INFO, DyeBenchItems.DB_SF_BUILD, RecipeType.NULL,
                    new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
            new SlimefunItem(DyeBenchItems.DB_INFO, DyeBenchItems.DB_VERSION, RecipeType.NULL,
                    new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);

        }
    }

