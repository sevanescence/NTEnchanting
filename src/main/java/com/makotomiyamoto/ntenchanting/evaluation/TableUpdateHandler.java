package com.makotomiyamoto.ntenchanting.evaluation;

import com.makotomiyamoto.ntenchanting.Data;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TableUpdateHandler {
    private Player player;
    public TableUpdateHandler(Player player) {
        this.player = player;
    }
    public void render(Inventory inventory, ItemStack newItem) {
        inventory.setItem(Data.ITEM_SLOT, newItem);
        inventory.setItem(12, new ItemStack(Material.RED_STAINED_GLASS_PANE));
        player.updateInventory();
    }
}
