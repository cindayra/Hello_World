package org.blockhosting.Hello_World;

import me.koenn.core.command.CommandAPI;
import org.blockhosting.Hello_World.commands.testCommand;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * Created by cindayra on 5/4/2017.
 */
public class HelloWorld extends JavaPlugin{

    private static HelloWorld instance;

    public static HelloWorld getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        this.getLogger().info("Hello World :)");

        new PlayerListener(this);

        CommandAPI.registerCommand(new testCommand(), this);
    }

    @Override
    public void onDisable() {



    }
}
