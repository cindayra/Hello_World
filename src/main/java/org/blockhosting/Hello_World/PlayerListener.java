package org.blockhosting.Hello_World;

import me.koenn.core.misc.Title;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/*
 * Created by cindayra on 5/6/2017.
 */
public class PlayerListener implements Listener {

    @EventHandler
    public void welcome(PlayerJoinEvent Welcome){

        Player player = Welcome.getPlayer();

        new Title("Welcome " + player.getName(), "to &aBlock&bGaming &fenjoy your stay!").send(player);

    }

}