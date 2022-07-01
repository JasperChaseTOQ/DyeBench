package me.jasperchasetoq.dyebench;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class DyebenchItems {
    private DyebenchItems() {}

    //groups
    public static final NestedItemGroup DB_GENERAL = new NestedItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_GENERAL"), new CustomItemStack(Material.LOOM, "&bDyeBench"));
    public static final SubItemGroup DB_MACHINES = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_MACHINES"), DB_GENERAL, new CustomItemStack(Material.LOOM, "&bMachines"));
    public static final SubItemGroup DB_PIGMENTS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_PIGMENTS"), DB_GENERAL, new CustomItemStack(Material.WHITE_DYE, "&bPigments"));
    public static final SubItemGroup DB_DYEABLE_BLOCKS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_DYEABLE_BLOCKS"), DB_GENERAL, new CustomItemStack(Material.WHITE_WOOL, "&bDyeable Blocks"));
    public static final SubItemGroup DB_INFO = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_INFO"), DB_GENERAL, new CustomItemStack(Material.BOOK, "&bAddon Info"));

    public static final ItemGroup DyeBenchGeneral = new ItemGroup(new NamespacedKey(DyeBench.getInstance(), "DyeBench"),
            new CustomItemStack(Material.LOOM, "&bDyeBench"));
    
    //machines
    public static final SlimefunItemStack DB_DYEBENCH = new SlimefunItemStack("DB_DYEBENCH", Material.LOOM, "&eDye Bench", "&fDyes items using pigments", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    //Pigments
    public static final SlimefunItemStack DB_WHITE_PIGMENT = new SlimefunItemStack("DB_WHITE_PIGMENT", Material.WHITE_DYE, "&fWhite Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_ORANGE_PIGMENT = new SlimefunItemStack("DB_ORANGE_PIGMENT", Material.ORANGE_DYE, "&dOrange Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_MAGENTA_PIGMENT = new SlimefunItemStack("DB_MAGENTA_PIGMENT", Material.MAGENTA_DYE, "&dMagenta Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_LIGHT_BLUE_PIGMENT = new SlimefunItemStack("DB_LIGHT_BLUE_PIGMENT", Material.LIGHT_BLUE_DYE, "&dLight Blue Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_YELLOW_PIGMENT = new SlimefunItemStack("DB_YELLOW_PIGMENT", Material.YELLOW_DYE, "&dYellow Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_LIME_PIGMENT = new SlimefunItemStack("DB_LIME_PIGMENT", Material.LIME_DYE, "&dLime Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_PINK_PIGMENT = new SlimefunItemStack("DB_PINK_PIGMENT", Material.PINK_DYE, "&dPink Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_GRAY_PIGMENT = new SlimefunItemStack("DB_GRAY_PIGMENT", Material.GRAY_DYE, "&dGray Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_LIGHT_GRAY_PIGMENT = new SlimefunItemStack("DB_LIGHT_GRAY_PIGMENT", Material.LIGHT_GRAY_DYE, "&dLight Gray Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_CYAN_PIGMENT = new SlimefunItemStack("DB_CYAN_PIGMENT", Material.CYAN_DYE, "&dCyan Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_PURPLE_PIGMENT = new SlimefunItemStack("DB_PURPLE_PIGMENT", Material.PURPLE_DYE, "&dPurple Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_BLUE_PIGMENT = new SlimefunItemStack("DB_BLUE_PIGMENT", Material.BLUE_DYE, "&dBlue Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_BROWN_PIGMENT = new SlimefunItemStack("DB_BROWN_PIGMENT", Material.BROWN_DYE, "&dBrown Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_GREEN_PIGMENT = new SlimefunItemStack("DB_GREEN_PIGMENT", Material.GREEN_DYE, "&dGreen Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_RED_PIGMENT = new SlimefunItemStack("DB_RED_PIGMENT", Material.RED_DYE, "&dRed Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_BLACK_PIGMENT = new SlimefunItemStack("DB_BLACK_PIGMENT", Material.BLACK_DYE, "&dBlack Pigment", "", "&fA reusable Pigment", "");
    //Dyeable Blocks
    public static final SlimefunItemStack DB_DYEABLE_WOOL = new SlimefunItemStack("DB_DYEABLE_WOOL", Material.WHITE_WOOL, "&fWool",
            "&f you can dye wool in the following colors",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    public static final SlimefunItemStack DB_DYEABLE_CANDLES = new SlimefunItemStack("DB_DYEABLE_CANDLES", Material.WHITE_WOOL, "&fCandles",
            "&f you can dye wool in the following colors",
            "&fWhite",
            "&6Orange",
            "&dMagenta",
            "&bLight Blue",
            "&eYellow",
            "&aLime",
            "&dPink",
            "&8Gray",
            "&7Light Gray",
            "&3Cyan",
            "&5Purple",
            "&9Blue",
            "&6Brown",
            "&2Green",
            "&4Red",
            "&0Black");
    //addon info
    public static final SlimefunItemStack DB_MC_VERSION = new SlimefunItemStack("DB_MC_VERSION", Material.BOOK, "&fMinecraft Version", "", "&fWorks on versions 1.17x-1.19x");
    public static final SlimefunItemStack DB_SF_BUILD = new SlimefunItemStack("DB_SF_BUILD", Material.BOOK, "&fSlimefun Build", "", "&fDyeBench was built on slimefun version: RC-31");
}

