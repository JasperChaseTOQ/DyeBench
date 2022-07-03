package me.jasperchasetoq.dyebench.implemention.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import me.jasperchasetoq.dyebench.DyeBenchItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class TheDyeBench extends AContainer {


    public TheDyeBench(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
        addItemHandler(onBreak());
    }

    @Override
    protected void registerDefaultRecipes() {


        registerRecipe(8, new ItemStack[] {new ItemStack(Material.CANDLE), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_CANDLE), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.TERRACOTTA), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_TERRACOTTA), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.GLASS), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_STAINED_GLASS), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.GLASS_PANE), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_STAINED_GLASS_PANE), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)},
                new ItemStack[] {new ItemStack(Material.WHITE_SHULKER_BOX), new SlimefunItemStack(DyeBenchItems.DB_WHITE_PIGMENT, 1)});
    }



    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.LOOM);
    }

    @Override
    public String getInventoryTitle() {
        return "&fDyeBench";
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

}