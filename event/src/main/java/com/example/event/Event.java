package com.example.event;

import com.example.event.event.EventListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Event extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new EventListener(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
