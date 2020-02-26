package com.makotomiyamoto.ntenchanting.listener;

import com.makotomiyamoto.ntenchanting.Data;
import com.makotomiyamoto.ntenchanting.Main;
import com.makotomiyamoto.ntenchanting.evaluation.Eval;
import com.makotomiyamoto.ntenchanting.gui.EnchantingInterface;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public final class EnchantingTableInteractListener implements Listener {
    private Main plugin;
    public EnchantingTableInteractListener(Main plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Inventory windowClicked = event.getClickedInventory();
        InventoryView view = event.getView();
        if (windowClicked == null || !view.getTitle().equals(Data.NAME)) {
            return;
        }
        ItemStack itemInSlot = view.getTopInventory().getItem(Data.ITEM_SLOT);
        Player player = (Player) event.getWhoClicked();
        if (event.getAction().equals(InventoryAction.MOVE_TO_OTHER_INVENTORY)) {
            if (itemInSlot != null) {
                if (event.getRawSlot() != Data.ITEM_SLOT && windowClicked.equals(view.getTopInventory())) {
                    event.setCancelled(true);
                } else if (windowClicked.equals(view.getBottomInventory())) {
                    event.setCancelled(true);
                }
            } else if (windowClicked.equals(view.getTopInventory())) {
                event.setCancelled(true);
            }
        } else if (windowClicked.equals(view.getTopInventory()) && event.getRawSlot() != Data.ITEM_SLOT) {
            event.setCancelled(true);
        }
        if (Eval.isEnchantable(itemInSlot)) {
            if (Eval.isProbablyWeapon(itemInSlot)) {
                view.getTopInventory().setItem(12, new ItemStack(Material.BEDROCK));
                view.getTopInventory().setItem(13, new ItemStack(Material.BEDROCK));
            }
        }

    }

}
