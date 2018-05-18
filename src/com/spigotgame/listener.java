package com.spigotgame;

import com.connorlinfoot.titleapi.TitleAPI;
import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class listener implements Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        //set player = the event
        Player player = event.getPlayer();
        // set joinmessage
        event.setJoinMessage("§6Mini-Games ACTIVE");
        //set title for 50 millaseconds
        TitleAPI.sendTitle(player,20,20,10,"§4Welcome to ");

    }
}
