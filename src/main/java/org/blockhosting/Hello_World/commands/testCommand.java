package org.blockhosting.Hello_World.commands;

import me.koenn.core.command.Command;
import me.koenn.core.command.CommandAPI;
import me.koenn.core.player.CPlayer;

/**
 * Created by cindayra on 5/5/2017.
 */
public class testCommand extends Command{


    public testCommand() {
        super("Test", "/test");
    }

    public boolean execute(CPlayer cPlayer, String[] strings) {
        cPlayer.sendMessage("Hello World!");
        return true;
    }


}
