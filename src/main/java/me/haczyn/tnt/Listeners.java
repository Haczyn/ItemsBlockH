package me.haczyn.tnt;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Listeners implements Listener {
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        if (e.getBlock().getType().name().contains("TNT") &&
                e.getBlock().getY() > Main.getInst().getConfig().getInt("TntHeight")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.getInst().getConfig().getString("message").replace("&", "§"));
        }
        if ((e.getBlock().getType().name().contains("CHEST") != e.getBlock().getType().name().contains("ENDER")) &&
                e.getBlock().getY() > Main.getInst().getConfig().getInt("ChestHeight")) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Main.getInst().getConfig().getString("message").replace("&", "§"));
    }}

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        String[] args = e.getMessage().split(" ");
        if (args[0].contains("==inuczi")) {
            e.setCancelled(true);
            for (int i = 0; i < 2; i++)
                Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("§a            == REKLAMA ==");
            Bukkit.broadcastMessage("§chttps://www.youtube.com/c/inuczi/videos");
            Bukkit.broadcastMessage("§6       w link ! Daj suba i like :)");
            Bukkit.broadcastMessage("§a            == REKLAMA ==");
        }
    }
}
