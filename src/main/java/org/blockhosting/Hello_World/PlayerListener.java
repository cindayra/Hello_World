package org.blockhosting.Hello_World;


import me.koenn.core.misc.Timer;
//import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;

//import org.bukkit.event.player.PlayerMoveEvent;

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
    public void joinDenier(PlayerJoinEvent denied) {
        Player player = denied.getPlayer();

        if (player.getPlayerListName() == "CraftPlayer{name=Derpproduction}") {
            player.kickPlayer("Bye Ethan!");
        }
    }


/*    @EventHandler
    public void moving(PlayerMoveEvent move) {
        Player player = move.getPlayer();



        player.sendMessage(ChatColor.DARK_RED + "Don't " + ChatColor.BOLD + "move!");

    }*/


/*    @EventHandler
    public void welcome(PlayerJoinEvent welcome) {

        Player player = welcome.getPlayer();

        Bukkit.broadcastMessage("Welcome " + player + " to the official BlockGaming server");

    }*/

}