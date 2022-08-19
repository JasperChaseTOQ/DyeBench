package me.jasperchasetoq.dyebench.implemention.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import me.jasperchasetoq.dyebench.DyeBenchItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class TheDyeBench extends AContainer implements RecipeDisplayItem {


    public TheDyeBench(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        addItemHandler(onBreak());
    }

    @Override
    protected void registerDefaultRecipes() {

        //white
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_WHITE_PIGMENT, 1)});

        //orange

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.ORANGE_BED), new SlimefunItemStack(DyeBenchItems.JC_ORANGE_PIGMENT, 1)});

        //MAGENTA

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_WOOL), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_CARPET), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.MAGENTA_BED), new SlimefunItemStack(DyeBenchItems.JC_MAGENTA_PIGMENT, 1)});

        //LIGHT_BLUE

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_BED), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_BLUE_PIGMENT, 1)});

        //YELLOW

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_WOOL), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_CARPET), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.YELLOW_BED), new SlimefunItemStack(DyeBenchItems.JC_YELLOW_PIGMENT, 1)});

        //LIME

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_WOOL), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_CARPET), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIME_BED), new SlimefunItemStack(DyeBenchItems.JC_LIME_PIGMENT, 1)});

        //PINK

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_WOOL), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_CARPET), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PINK_BED), new SlimefunItemStack(DyeBenchItems.JC_PINK_PIGMENT, 1)});

        //GRAY

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_WOOL), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_CARPET), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GRAY_BED), new SlimefunItemStack(DyeBenchItems.JC_GRAY_PIGMENT, 1)});

        //LIGHT_GRAY

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_WOOL), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_CARPET), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_BED), new SlimefunItemStack(DyeBenchItems.JC_LIGHT_GRAY_PIGMENT, 1)});

        //CYAN

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_WOOL), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_CARPET), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.CYAN_BED), new SlimefunItemStack(DyeBenchItems.JC_CYAN_PIGMENT, 1)});

        //PURPLE

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.PURPLE_BED), new SlimefunItemStack(DyeBenchItems.JC_PURPLE_PIGMENT, 1)});

        //BLUE

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLUE_BED), new SlimefunItemStack(DyeBenchItems.JC_BLUE_PIGMENT, 1)});

        //BROWN

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_WOOL), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_CARPET), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BROWN_BED), new SlimefunItemStack(DyeBenchItems.JC_BROWN_PIGMENT, 1)});

        //GREEN

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_WOOL), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_CARPET), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.GREEN_BED), new SlimefunItemStack(DyeBenchItems.JC_GREEN_PIGMENT, 1)});

        //RED

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_WOOL), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_CARPET), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.RED_BED), new SlimefunItemStack(DyeBenchItems.JC_RED_PIGMENT, 1)});

        //BLACK

        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_WOOL), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_WOOL), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CARPET), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_CARPET), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_CANDLE), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_GLAZED_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_CONCRETE_POWDER), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_CONCRETE), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.WHITE_BED), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.BLACK_BED), new SlimefunItemStack(DyeBenchItems.JC_BLACK_PIGMENT, 1)});
    }


    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.LOOM);
    }

    @Override
    public String getInventoryTitle() {
        return "&fDye Bench";
    }

    @Override
    public String getMachineIdentifier() {
        return "DYEBENCH";
    }

    @Override
    public int getCapacity() {
        return 250;
    }

    @Override
    public int getEnergyConsumption() {
        return 25;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };

    }
    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
            displayRecipes.add(recipe.getInput()[recipe.getInput().length - 1]);
            displayRecipes.add(recipe.getInput()[recipe.getInput().length - 2]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 2]);
        }

        return displayRecipes;
    }

}