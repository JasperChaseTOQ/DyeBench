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
    public static final SlimefunItemStack DB_COBBLESTONE_1 = new SlimefunItemStack("DB_COBBLESTONE_1", Material.COBBLESTONE, "&dCompressed Cobblestone", "", "&f8 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_2 = new SlimefunItemStack("DB_COBBLESTONE_2", Material.COBBLESTONE, "&dDouble Compressed Cobblestone", "", "&f64 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_3 = new SlimefunItemStack("DB_COBBLESTONE_3", Material.COBBLESTONE, "&dTriple Compressed Cobblestone", "", "&f512 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_4 = new SlimefunItemStack("DB_COBBLESTONE_4", Material.COBBLESTONE, "&dQuadruple Compressed Cobblestone", "", "&f4096 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_5 = new SlimefunItemStack("DB_COBBLESTONE_5", Material.COBBLESTONE, "&dQuintuple Compressed Cobblestone", "", "&f32768 Cobblestone", "");
    public static final SlimefunItemStack DB_COBBLESTONE_6 = new SlimefunItemStack("DB_COBBLESTONE_6", Material.COBBLESTONE, "&dSextuple Compressed Cobblestone", "", "&f262144 Cobblestone", "");
    public static final SlimefunItemStack DB_STONE_1 = new SlimefunItemStack("DB_STONE_1", Material.STONE, "&dCompressed Stone", "", "&f8 Stone", "");
    public static final SlimefunItemStack DB_ANDESITE_1 = new SlimefunItemStack("DB_ANDESITE_1", Material.ANDESITE, "&dCompressed Andesite", "", "&f8 Andesite", "");
    public static final SlimefunItemStack DB_DIORITE_1 = new SlimefunItemStack("DB_DIORITE_1", Material.DIORITE, "&dCompressed Diorite", "", "&f8 Diorite", "");
    public static final SlimefunItemStack DB_GRANITE_1 = new SlimefunItemStack("DB_GRANITE_1", Material.GRANITE, "&dCompressed Granite", "", "&f8 Granite", "");
    public static final SlimefunItemStack DB_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("DB_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&dCompressed Cobbled Deepslate", "", "&f8 Cobbled Deepslate", "");
    public static final SlimefunItemStack DB_DEEPSLATE_1 = new SlimefunItemStack("DB_DEEPSLATE_1", Material.DEEPSLATE, "&dCompressed Deepslate", "", "&f8 Deepslate", "");
    public static final SlimefunItemStack DB_FLINT_1 = new SlimefunItemStack("DB_FLINT_1", Material.FLINT, "&dCompressed Flint", "", "&f8 Flint", "");
    public static final SlimefunItemStack DB_GRAVEL_1 = new SlimefunItemStack("DB_GRAVEL_1", Material.GRAVEL, "&dCompressed Gravel", "", "&f8 Gravel", "");
    public static final SlimefunItemStack DB_DIRT_1 = new SlimefunItemStack("DB_DIRT_1", Material.DIRT, "&dCompressed Dirt", "", "&f8 Dirt", "");
    public static final SlimefunItemStack DB_CLAY_1 = new SlimefunItemStack("DB_CLAY_1", Material.CLAY, "&dCompressed Clay", "", "&f8 Clay", "");
    
    //addon info
    public static final SlimefunItemStack DB_MC_VERSION = new SlimefunItemStack("DB_MC_VERSION", Material.BOOK, "&fMinecraft Version", "", "&fWorks on versions 1.17x-1.19x");
    public static final SlimefunItemStack DB_SF_BUILD = new SlimefunItemStack("DB_SF_BUILD", Material.BOOK, "&fSlimefun Build", "", "&fDyeBench was built on slimefun version: RC-31");
}

