package com.makotomiyamoto.ntenchanting.listener;

import com.makotomiyamoto.ntenchanting.Data;
import com.makotomiyamoto.ntenchanting.Main;
import com.makotomiyamoto.ntenchanting.evaluation.TableUpdateHandler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public final class EnchantingTableInteractListener implements Listener {

    private Main main;

    public EnchantingTableInteractListener(final Main main) {
        this.main = main;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Inventory windowClicked = event.getClickedInventory();
        InventoryView view = event.getView();
        if (windowClicked == null || !view.getTitle().equals(Data.NAME)) {
            return;
        }
        if (event.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
            ItemStack itemInSlot = view.getTopInventory().getItem(Data.ITEM_SLOT);
            if (itemInSlot != null) {
                if (event.getSlot() != Data.ITEM_SLOT && windowClicked.equals(view.getTopInventory())) {
                    event.setCancelled(true);
                    return;
                }
                if (windowClicked.equals(view.getBottomInventory())) {
                    event.setCancelled(true);
                }
                return;
            }
            if (windowClicked.equals(view.getTopInventory())) {
                event.setCancelled(true);
                return;
            }
        }
        if (windowClicked.equals(view.getTopInventory()) && event.getSlot() != Data.ITEM_SLOT) {
            event.setCancelled(true);
        }
    }

}
