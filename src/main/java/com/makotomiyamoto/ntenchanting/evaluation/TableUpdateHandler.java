package com.makotomiyamoto.ntenchanting.evaluation;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TableUpdateHandler {
    private Player player;
    public TableUpdateHandler(Player player) {
        this.player = player;
    }
    public void render(Inventory inventory) {
        inventory.setItem(12, new ItemStack(Material.RED_STAINED_GLASS_PANE));
    }
}
