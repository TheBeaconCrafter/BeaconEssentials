package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;

public class GlobalMuteCommand implements CommandExecutor
{
    public static boolean globalmute;

    public boolean onCommand(final CommandSender s, final Command cmd, final String l, final String[] args) {
        if (s instanceof Player) {
            final Player p = (Player)s;
            if (p.hasPermission("beacon.beaconessentials.globalmute")) {
                if (GlobalMuteCommand.globalmute) {
                    Bukkit.broadcastMessage(Beaconessentials.PREFIX + "§aDer Chat wurde §caktivert§a!");
                    GlobalMuteCommand.globalmute = false;
                }
                else {
                    Bukkit.broadcastMessage(Beaconessentials.PREFIX + "§aDer Chat wurde §cdeaktivert§a!");
                    GlobalMuteCommand.globalmute = true;
                }
            }
            else {
                p.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
            }
        }
        return false;
    }

    static {
        GlobalMuteCommand.globalmute = false;
    }
}
