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
    public static final SlimefunItemStack DB_DYEBENCH = new SlimefunItemStack("DB_DYEBENCH", Material.PISTON, "&eBasic DB Compressor", "&fCompresses blocks", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    //Pigments
    public static final SlimefunItemStack DB_COBBLESTONE_1 = new SlimefunItemStack("DB_WHITE_PIGMENT", Material.WHITE_DYE, "&dCompressed Cobblestone", "", "&f8 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_2 = new SlimefunItemStack("DB_ORANGE_PIGMENT", Material.ORANGE_DYE, "&dDouble Compressed Cobblestone", "", "&f64 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_3 = new SlimefunItemStack("DB_MAGENTA_PIGMENT", Material.MAGENTA_DYE, "&dTriple Compressed Cobblestone", "", "&f512 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_4 = new SlimefunItemStack("DB_LIGHT_BLUE_PIGMENT", Material.LIGHT_BLUE_DYE, "&dQuadruple Compressed Cobblestone", "", "&f4096 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_5 = new SlimefunItemStack("DB_YELLOW_PIGMENT", Material.YELLOW_DYE, "&dQuintuple Compressed Cobblestone", "", "&f32768 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_6 = new SlimefunItemStack("DB_LIME_PIGMENT", Material.LIME_DYE, "&dSextuple Compressed Cobblestone", "", "&f262144 Cobblestone", "");
    public static final SlimefunItemStack DB_STONE_1 = new SlimefunItemStack("DB_PINK_PIGMENT", Material.PINK_DYE, "&dCompressed Stone", "", "&f8 Stone", "");
    public static final SlimefunItemStack DB_ANDESITE_1 = new SlimefunItemStack("DB_GRAY_PIGMENT", Material.GRAY_DYE, "&dCompressed Andesite", "", "&f8 Andesite", "");
    public static final SlimefunItemStack DB_DIORITE_1 = new SlimefunItemStack("DB_LIGHT_GRAY_PIGMENT", Material.LIGHT_GRAY_DYE, "&dCompressed Diorite", "", "&f8 Diorite", "");
    public static final SlimefunItemStack DB_GRANITE_1 = new SlimefunItemStack("DB_CYAN_PIGMENT", Material.CYAN_DYE, "&dCompressed Granite", "", "&f8 Granite", "");
    public static final SlimefunItemStack DB_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("DB_PURPLE_PIGMENT", Material.PURPLE_DYE, "&dCompressed Cobbled Deepslate", "", "&f8 Cobbled Deepslate", "");
    public static final SlimefunItemStack DB_DEEPSLATE_1 = new SlimefunItemStack("DB_BLUE_PIGMENT", Material.BLUE_DYE, "&dCompressed Deepslate", "", "&f8 Deepslate", "");
    public static final SlimefunItemStack DB_FLINT_1 = new SlimefunItemStack("DB_BROWN_PIGMENT", Material.BROWN_DYE, "&dCompressed Flint", "", "&f8 Flint", "");
    public static final SlimefunItemStack DB_GRAVEL_1 = new SlimefunItemStack("DB_GREEN_PIGMENT", Material.GREEN_DYE, "&dCompressed Gravel", "", "&f8 Gravel", "");
    public static final SlimefunItemStack DB_DIRT_1 = new SlimefunItemStack("DB_RED_PIGMENT", Material.RED_DYE, "&dCompressed Dirt", "", "&f8 Dirt", "");
    public static final SlimefunItemStack DB_CLAY_1 = new SlimefunItemStack("DB_BLACK_PIGMENT", Material.BLACK_DYE, "&dCompressed Clay", "", "&f8 Clay", "");
    
    //addon info
    public static final SlimefunItemStack DB_MC_VERSION = new SlimefunItemStack("DB_MC_VERSION", Material.BOOK, "&fMinecraft Version", "", "&fWorks on versions 1.17x-1.19x");
    public static final SlimefunItemStack DB_SF_BUILD = new SlimefunItemStack("DB_SF_BUILD", Material.BOOK, "&fSlimefun Build", "", "&fDyeBench was built on slimefun version: RC-31");
}

