package com.makotomiyamoto.ntenchanting;

import com.makotomiyamoto.ntenchanting.listener.EnchantingTableOpenListener;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new EnchantingTableOpenListener(), this);
    }

}
