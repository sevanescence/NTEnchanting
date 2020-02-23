package com.makotomiyamoto.ntenchanting.evaluation;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class TableUpdateHandler {
    public static void render(Inventory inventory) {
        inventory.setItem(12, new ItemStack(Material.RED_STAINED_GLASS_PANE));
    }
}
