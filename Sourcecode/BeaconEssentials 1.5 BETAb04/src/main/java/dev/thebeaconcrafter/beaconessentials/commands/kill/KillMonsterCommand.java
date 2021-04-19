package dev.thebeaconcrafter.beaconessentials.commands.kill;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import java.util.*;

public class KillMonsterCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (cmd.getName().equalsIgnoreCase("ClearLag")) {
            if (sender.hasPermission("beacon.beaconessentials.killmonster")) {
                for (final Entity entity : Bukkit.getWorld("world").getEntities()) {
                    if (entity instanceof Monster) {
                        entity.remove();
                    }
                }
                sender.sendMessage(Beaconessentials.PREFIX + "§aAlle Monster wurden entfernt!");
            }
            else {
                sender.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
            }
        }
        return false;
    }
}
