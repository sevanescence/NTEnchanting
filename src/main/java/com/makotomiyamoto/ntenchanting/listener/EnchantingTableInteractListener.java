package com.makotomiyamoto.ntenchanting.listener;

import com.makotomiyamoto.ntenchanting.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public final class EnchantingTableInteractListener implements Listener {

    private Main main;

    public EnchantingTableInteractListener(final Main main) {
        this.main = main;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        
    }

}
