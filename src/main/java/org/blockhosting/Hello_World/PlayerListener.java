package org.blockhosting.Hello_World;

import me.koenn.core.misc.Timer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by cindayra on 5/6/2017.
 */
public class PlayerListener implements Listener {

    public PlayerListener(HelloWorld plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onThrow(PlayerEggThrowEvent event) {

        Player player = event.getPlayer();

        player.sendMessage(ChatColor.RED + "Ethan is a scrub");
        new Timer(200, HelloWorld.getInstance()).start(() -> {
            player.kickPlayer("Sorry, Ethan told me to");
        });



    }

    @EventHandler
    public void joinDenier(PlayerJoinEvent denied) {
        Player player = denied.getPlayer();

        if (player.getDisplayName() == "Derpproduction") {
            player.kickPlayer("Bye Ethan!");
        }
    }


}