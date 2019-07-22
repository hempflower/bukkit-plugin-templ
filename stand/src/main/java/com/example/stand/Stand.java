package com.example.stand;

import com.example.stand.command.Command1;
import com.example.stand.event.PlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Stand extends JavaPlugin {
    //注意！
    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginCommand("cmd1").setExecutor(new Command1());
        Bukkit.getPluginManager().registerEvents(new PlayerEvent(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
