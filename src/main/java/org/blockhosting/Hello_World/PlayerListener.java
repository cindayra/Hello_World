package org.blockhosting.Hello_World;


import me.koenn.core.misc.ColorHelper;
import me.koenn.core.misc.Title;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
/*
 * Created by cindayra on 5/6/2017.
 */
public class PlayerListener implements Listener {

    public PlayerListener(HelloWorld plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }


    @EventHandler
    public void welcome(PlayerJoinEvent Welcome){

        Player player = Welcome.getPlayer();

        new Title("Welcome " + player.getDisplayName(), "to &aBlock&bGaming&f, enjoy your stay!").send(player);

        Welcome.setJoinMessage(ColorHelper.readColor("Say welcome to &3" +  player.getDisplayName() + "&f everyone!"));

    }

    @EventHandler
    public void bye(PlayerQuitEvent Bye){

        Player player = Bye.getPlayer();

        Bye.setQuitMessage(ColorHelper.readColor("&c" + player.getDisplayName() + "&f just left us, let's hope he had a good time :)"));

    }

    @EventHandler
    public void died(PlayerDeathEvent Died){

        Player player = Died.getEntity();
        Died.getEntity().getKiller().getDisplayName();

        new Title("You were killed by " + Died, "Get revenge!").send(player);

    }

}