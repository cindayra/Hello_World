package org.blockhosting.Hello_World.commands;

import me.koenn.core.command.Command;
import me.koenn.core.player.CPlayer;

/**
 * Created by cindayra on 5/22/2017.
 */
public class flyBow extends Command{


    public flyBow() {
        super("flyArrow", "/cgive flyarrow");
    }

    @Override
    public boolean execute(CPlayer cPlayer, String[] strings) {



        return false;
    }
}
