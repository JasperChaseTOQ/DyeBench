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

public class DyeBenchItems {
    private DyeBenchItems() {}

    //groups
    public static final NestedItemGroup JC_DB_GENERAL = new NestedItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_GENERAL"), new CustomItemStack(Material.LOOM, "&bDyeBench"));
    public static final SubItemGroup JC_DB_MACHINES = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_MACHINES"), JC_DB_GENERAL, new CustomItemStack(Material.LOOM, "&bMachines"));
    public static final SubItemGroup JC_DB_PIGMENTS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_PIGMENTS"), JC_DB_GENERAL, new CustomItemStack(Material.WHITE_DYE, "&bPigments"));
    public static final SubItemGroup JC_DB_CRAFTING_MATERIALS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_CRAFTING_MATERIALS"), JC_DB_GENERAL, new CustomItemStack(Material.WHITE_DYE, "&bPigments"));
    public static final SubItemGroup JC_DB_DYEABLE_BLOCKS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "JC_DB_DYEABLE_BLOCKS"), JC_DB_GENERAL, new CustomItemStack(Material.WHITE_WOOL, "&bDyeable Blocks"));

    public static final ItemGroup DyeBenchGeneral = new ItemGroup(new NamespacedKey(DyeBench.getInstance(), "DyeBench"),
            new CustomItemStack(Material.LOOM, "&bDyeBench"));
    
    //machines
    public static final SlimefunItemStack JC_DYEBENCH = new SlimefunItemStack("JC_DYEBENCH", Material.LOOM, "&eDye Bench", "&fDyes items using pigments", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    //Pigments
    public static final SlimefunItemStack JC_WHITE_PIGMENT = new SlimefunItemStack("JC_WHITE_PIGMENT", Material.WHITE_DYE, "&fWhite Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_ORANGE_PIGMENT = new SlimefunItemStack("JC_ORANGE_PIGMENT", Material.ORANGE_DYE, "&dOrange Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_MAGENTA_PIGMENT = new SlimefunItemStack("JC_MAGENTA_PIGMENT", Material.MAGENTA_DYE, "&dMagenta Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_LIGHT_BLUE_PIGMENT = new SlimefunItemStack("JC_LIGHT_BLUE_PIGMENT", Material.LIGHT_BLUE_DYE, "&dLight Blue Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_YELLOW_PIGMENT = new SlimefunItemStack("JC_YELLOW_PIGMENT", Material.YELLOW_DYE, "&dYellow Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_LIME_PIGMENT = new SlimefunItemStack("JC_LIME_PIGMENT", Material.LIME_DYE, "&dLime Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_PINK_PIGMENT = new SlimefunItemStack("JC_PINK_PIGMENT", Material.PINK_DYE, "&dPink Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_GRAY_PIGMENT = new SlimefunItemStack("JC_GRAY_PIGMENT", Material.GRAY_DYE, "&dGray Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_LIGHT_GRAY_PIGMENT = new SlimefunItemStack("JC_LIGHT_GRAY_PIGMENT", Material.LIGHT_GRAY_DYE, "&dLight Gray Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_CYAN_PIGMENT = new SlimefunItemStack("JC_CYAN_PIGMENT", Material.CYAN_DYE, "&dCyan Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_PURPLE_PIGMENT = new SlimefunItemStack("JC_PURPLE_PIGMENT", Material.PURPLE_DYE, "&dPurple Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_BLUE_PIGMENT = new SlimefunItemStack("JC_BLUE_PIGMENT", Material.BLUE_DYE, "&fBlue Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_BROWN_PIGMENT = new SlimefunItemStack("JC_BROWN_PIGMENT", Material.BROWN_DYE, "&fBrown Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_GREEN_PIGMENT = new SlimefunItemStack("JC_GREEN_PIGMENT", Material.GREEN_DYE, "&dGreen Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_RED_PIGMENT = new SlimefunItemStack("JC_RED_PIGMENT", Material.RED_DYE, "&dRed Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack JC_BLACK_PIGMENT = new SlimefunItemStack("JC_BLACK_PIGMENT", Material.BLACK_DYE, "&fBlack Pigment", "", "&fA reusable Pigment", "");
    //Dyeable Blocks
    public static final SlimefunItemStack JC_DYEABLE_WOOL = new SlimefunItemStack("JC_DYEABLE_WOOL", Material.WHITE_WOOL, "&fWool",
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
    public static final SlimefunItemStack JC_DYEABLE_CARPET = new SlimefunItemStack("JC_DYEABLE_CARPET", Material.WHITE_CARPET, "&fCARPET",
            "&f you can dye carpet in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_CANDLES = new SlimefunItemStack("JC_DYEABLE_CANDLES", Material.CANDLE, "&fCandles",
            "&f you can dye candles in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_GLASS = new SlimefunItemStack("JC_DYEABLE_GLASS", Material.GLASS, "&fGlass",
            "&f you can dye Glass in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_GLASS_PANES = new SlimefunItemStack("JC_DYEABLE_GLASS_PANES", Material.GLASS_PANE, "&fGlass pane",
            "&f you can dye Glass panes in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_TERRACOTTA = new SlimefunItemStack("JC_DYEABLE_TERRACOTTA", Material.TERRACOTTA, "&fTerracotta",
            "&f you can dye Terracotta in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_GLAZED_TERRACOTTA = new SlimefunItemStack("JC_DYEABLE_GLAZED_TERRACOTTA", Material.WHITE_GLAZED_TERRACOTTA, "&fGlazed Terracotta",
            "&f you can dye Glazed terracotta in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_SHULKER_BOXES = new SlimefunItemStack("JC_DYEABLE_SHULKER_BOXES", Material.SHULKER_BOX, "&fShulker Box",
            "&f you can dye Shulker boxes in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_CONCRETE_POWDER = new SlimefunItemStack("JC_DYEABLE_CONCRETE_POWDER", Material.WHITE_CONCRETE_POWDER, "&fConcrete Powder",
            "&f you can dye Concrete powder in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_CONCRETE = new SlimefunItemStack("JC_DYEABLE_CONCRETE", Material.WHITE_CONCRETE, "&fConcrete",
            "&f you can dye Concrete in the following colors",
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
    public static final SlimefunItemStack JC_DYEABLE_BEDS = new SlimefunItemStack("JC_DYEABLE_BEDS", Material.WHITE_BED, "&fBeds",
            "&f you can dye Beds in the following colors",
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
}

