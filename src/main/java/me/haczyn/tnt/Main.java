package me.haczyn.tnt;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;

    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new Listeners(), (Plugin)this);
    }

    public void onDisable() {
    }

    public static Main getInst() {
        return instance;
    }
}
