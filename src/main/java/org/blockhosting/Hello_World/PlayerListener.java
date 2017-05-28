package org.blockhosting.Hello_World;


import me.koenn.core.listeners.PlayerJoinListener;
import me.koenn.core.misc.Timer;
import me.koenn.core.misc.Title;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/*
 * Created by cindayra on 5/6/2017.
 */
public class PlayerListener implements Listener {

    public PlayerListener(HelloWorld plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onThrow(PlayerEggThrowEvent event) {

        Player player = event.getPlayer();

        player.sendMessage(ChatColor.AQUA + "Ethan is a scrub");
        new Timer(200, HelloWorld.getInstance()).start(() -> {
            player.kickPlayer("Sorry, Ethan told me to");
        });


    }


    @EventHandler
    public void welcome(PlayerJoinEvent Welcome){

        Player player = Welcome.getPlayer();

        new Title("Welcome " + player.getName(), " to &aBlock&bGaming &fenjoy your stay!").send(player);

    }


    @EventHandler
    public void byeEthan (PlayerJoinEvent bye) {

        Player player = bye.getPlayer();

        String Ethan = player.getName();
        String controll = "Cindayra";

        if (Ethan == controll) {

            new Timer(40, HelloWorld.getInstance()).start(() -> {

            player.kickPlayer("See you later, Ethan!");
            });

        }


    }

}