package me.jasperchasetoq.dyebench.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.jasperchasetoq.dyebench.DyeBench;
import me.jasperchasetoq.dyebench.DyebenchItems;
import me.jasperchasetoq.dyebench.implemention.machines.TheDyeBench;
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

