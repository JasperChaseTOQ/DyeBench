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
    public static final NestedItemGroup DB_GENERAL = new NestedItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_GENERAL"), new CustomItemStack(Material.PISTON, "&bDyeBench"));
    public static final SubItemGroup DB_MACHINES = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_COMPRESSED_ITEMS"), DB_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressed Items"));
    public static final SubItemGroup DB_PIGMENTS = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_ITEM_COMPRESSION"), DB_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressors & Decompressors"));
    public static final SubItemGroup DB_INFO = new SubItemGroup(new NamespacedKey(DyeBench.getInstance(), "DB_INFO"), DB_GENERAL, new CustomItemStack(Material.BOOK, "&bAddon Info"));

    public static final ItemGroup DyeBenchGeneral = new ItemGroup(new NamespacedKey(DyeBench.getInstance(), "DyeBench"),
            new CustomItemStack(Material.PISTON, "&bDyeBench"));
    
    //machines
    public static final SlimefunItemStack DB_DYEBENCH = new SlimefunItemStack("DB_DYEBENCH", Material.LOOM, "&eBasic DB Compressor", "&fCompresses blocks", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    //Pigments
    public static final SlimefunItemStack DB_WHITE_PIGMENT = new SlimefunItemStack("DB_WHITE_PIGMENT", Material.WHITE_DYE, "&dBlack Pigment", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_ORANGE_PIGMENT = new SlimefunItemStack("DB_ORANGE_PIGMENT", Material.ORANGE_DYE, "&dDouble Compressed Cobblestone", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_MAGENTA_PIGMENT = new SlimefunItemStack("DB_MAGENTA_PIGMENT", Material.MAGENTA_DYE, "&dTriple Compressed Cobblestone", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_LIGHT_BLUE_PIGMENT = new SlimefunItemStack("DB_LIGHT_BLUE_PIGMENT", Material.LIGHT_BLUE_DYE, "&dQuadruple Compressed Cobblestone", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_YELLOW_PIGMENT = new SlimefunItemStack("DB_YELLOW_PIGMENT", Material.YELLOW_DYE, "&dQuintuple Compressed Cobblestone", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_LIME_PIGMENT = new SlimefunItemStack("DB_LIME_PIGMENT", Material.LIME_DYE, "&dSextuple Compressed Cobblestone", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_PINK_PIGMENT = new SlimefunItemStack("DB_PINK_PIGMENT", Material.PINK_DYE, "&dCompressed Stone", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_GRAY_PIGMENT = new SlimefunItemStack("DB_GRAY_PIGMENT", Material.GRAY_DYE, "&dCompressed Andesite", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_LIGHT_GRAY_PIGMENT = new SlimefunItemStack("DB_LIGHT_GRAY_PIGMENT", Material.LIGHT_GRAY_DYE, "&dCompressed Diorite", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_CYAN_PIGMENT = new SlimefunItemStack("DB_CYAN_PIGMENT", Material.CYAN_DYE, "&dCompressed Granite", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_PURPLE_PIGMENT = new SlimefunItemStack("DB_PURPLE_PIGMENT", Material.PURPLE_DYE, "&dCompressed Cobbled Deepslate", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_BLUE_PIGMENT = new SlimefunItemStack("DB_BLUE_PIGMENT", Material.BLUE_DYE, "&dCompressed Deepslate", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_BROWN_PIGMENT = new SlimefunItemStack("DB_BROWN_PIGMENT", Material.BROWN_DYE, "&dCompressed Flint", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_GREEN_PIGMENT = new SlimefunItemStack("DB_GREEN_PIGMENT", Material.GREEN_DYE, "&dCompressed Gravel", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_RED_PIGMENT = new SlimefunItemStack("DB_RED_PIGMENT", Material.RED_DYE, "&dCompressed Dirt", "", "&fA reusable Pigment", "");
    public static final SlimefunItemStack DB_BLACK_PIGMENT = new SlimefunItemStack("DB_BLACK_PIGMENT", Material.BLACK_DYE, "&dCompressed Clay", "", "&fA reusable Pigment", "");
    
    //addon info
    public static final SlimefunItemStack DB_MC_VERSION = new SlimefunItemStack("DB_MC_VERSION", Material.BOOK, "&fMinecraft Version", "", "&fWorks on versions 1.17x-1.19x");
    public static final SlimefunItemStack DB_SF_BUILD = new SlimefunItemStack("DB_SF_BUILD", Material.BOOK, "&fSlimefun Build", "", "&fDyeBench was built on slimefun version: RC-31");
}

