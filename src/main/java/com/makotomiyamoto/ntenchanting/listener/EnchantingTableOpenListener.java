package com.makotomiyamoto.ntenchanting.listener;

import com.makotomiyamoto.ntenchanting.gui.EnchantingInterface;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public final class EnchantingTableOpenListener implements Listener {

    @SuppressWarnings("unused")
    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        if (event.getClickedBlock() == null) {
            event.getPlayer().sendMessage(ChatColor.YELLOW + "You punched nothing or smth");
            return;
        }
        Player player = event.getPlayer();
        if (event.getClickedBlock().getType().equals(Material.ENCHANTING_TABLE)) {
            player.sendMessage(ChatColor.GREEN + "You right-clicked on the enchanting table!");
        }
        //Location loc = event.getClickedBlock().getLocation();
        //Block under = loc.add(0, -1, 0).getBlock();
        if (!event.getClickedBlock().getType().equals(Material.ENCHANTING_TABLE)) {
            return;
        }
        event.setCancelled(true);
        try {
            player.openInventory(new EnchantingInterface(player).getInventory());
        } catch (ArrayIndexOutOfBoundsException e) {
            player.sendMessage(ChatColor.RED + "You cannot enchant " + player.getInventory().getItemInMainHand().getType());
        }

    }

}
