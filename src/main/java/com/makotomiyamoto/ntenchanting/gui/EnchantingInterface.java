package com.makotomiyamoto.ntenchanting.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public final class EnchantingInterface implements InventoryHolder {

    private final int[] border = {
            0,1,2,3,4,5,6,7,8,
            9,11,17,
            18,19,20,21,22,23,24,25,26,
            //27,35,
            //36,44,
            //45,46,47,48,49,50,51,52,53
    };
    private final int[] ENCH_SLOTS = { 12, 13, 14, 15, 16 };
    private final int ITEM_SLOT = 10;
    private final String NAME = "§0§1§2§3§4§5§6§5§7§8Enchanting";
    private Inventory gui;

    public EnchantingInterface(Player player) {
        gui = Bukkit.createInventory(this, 27, NAME);
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
