package com.makotomiyamoto.ntenchanting.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

public final class ItemMountedListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Inventory windowClicked = event.getClickedInventory();
        InventoryView view = event.getView();
    }
}
