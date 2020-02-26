package com.makotomiyamoto.ntenchanting.gui;

import com.makotomiyamoto.ntenchanting.Data;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class EnchantingInterface implements InventoryHolder {

    private Inventory gui;

    public EnchantingInterface(Player player) {
        gui = Bukkit.createInventory(this, 27, Data.NAME);
        ItemStack b = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = b.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§a");
        b.setItemMeta(meta);
        ItemStack c = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        c.setItemMeta(meta);
        assert b.getItemMeta() != null;
        for (int value : Data.BORDER) {
            gui.setItem(value, b);
        }
    }

    @Override
    public Inventory getInventory() {
        return gui;
    }

}
