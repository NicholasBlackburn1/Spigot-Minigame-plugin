package com.spigotgame;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class scoreboard implements Listener {
    @EventHandler
    public void onplayerstuff(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        //init socreboard Manager
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        //create scoreboard when you change xp levels
        Scoreboard board = manager.getNewScoreboard();
        Team team = board.registerNewTeam("Number"+"Deaths"+"for"+ player);
        //adds players to the team
        team.addPlayer(player);
        //scoreboard objective
        Objective objective = board.registerNewObjective("deathCount ", "stat.");
        // set where scorboard is located
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score score = objective.getScore(player);
        score.setScore(1); //Integer only!


    }
}
