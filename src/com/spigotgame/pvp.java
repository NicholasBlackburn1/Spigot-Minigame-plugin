package com.spigotgame;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.logging.Logger;

public class pvp implements Listener{
    @EventHandler
    public void onplayermove (PlayerMoveEvent event) {
        Entity tnt = event.getPlayer().getWorld().spawn(event.getPlayer().getLocation(), TNTPrimed.class);
        ((TNTPrimed)tnt).setFuseTicks(0);
    }
}
