package me.jasperchasetoq.dyebench.setup;

import me.jasperchasetoq.dyebench.DyeBench;
import me.jasperchasetoq.dyebench.DyebenchItems;
import me.jasperchasetoq.dyebench.implemention.machines.TheDyeBench;

import javax.annotation.Nonnull;

public class DyeBenchItemsSetup {
    public class DyeBenchItemsSetup {
        private DyeBenchItemsSetup() {}

        public static void setup(@Nonnull DyeBench plugin) {


            //machines
            //compressors
            new TheDyeBench(me.jasperchasetoq.dyebench.setup.DyeBenchItemsSetup.DB_MACHINES, DyebenchItems.CC_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[] {
                            SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                            SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_PRESS, SlimefunItems.ELECTRIC_MOTOR,
                            SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
                    }).register(plugin);
            new SlimefunItem(CompressionCraftItems.CC_INFO, CompressionCraftItems.CC_MC_VERSION, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
        new SlimefunItem(CompressionCraftItems.CC_INFO, CompressionCraftItems.CC_SF_BUILD, RecipeType.NULL,
                new ItemStack[] {null, null, null, null, null, null, null, null, null,}).register(plugin);
}


