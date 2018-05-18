package com.spigotgame;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class main extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new listener(), this);
        Logger log = Bukkit.getLogger();
        log.info("§4============================\n");
        log.info("§2======= fun - Plugin ========\n");
        log.info("§4============================\n");
        log.info("§2== By Nicholas Blackburn ===\n");
        log.info("§4============================\n");
    }

    @Override
    public void onDisable(){

    }
}




