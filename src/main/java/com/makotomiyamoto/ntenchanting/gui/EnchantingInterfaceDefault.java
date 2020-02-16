package com.makotomiyamoto.ntenchanting.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class EnchantingInterfaceDefault implements InventoryHolder {

    private final int[] border = {
            0,1,2,3,4,5,6,7,8,
            9,11,17,
            18,19,20,21,22,23,24,25,26,
            27,35,
            36,44,
            45,46,47,48,49,50,51,52,53
    };
    private Inventory gui;

    public EnchantingInterfaceDefault(Player player) {
        gui = Bukkit.createInventory(this, 54);
        ItemStack b = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        assert b.getItemMeta() != null;
        b.getItemMeta().setDisplayName("");
        for (int value : border) {
            gui.setItem(value, b);
        }
    }

    @Override
    public Inventory getInventory() {
        return gui;
    }

}
