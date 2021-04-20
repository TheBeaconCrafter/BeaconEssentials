package dev.thebeaconcrafter.beaconessentials.commands.kill;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import java.util.*;

public class ClearLagCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (cmd.getName().equalsIgnoreCase("ClearLag")) {
            if (sender.hasPermission("beacon.beaconessentials.clearlag")) {
                for (final Entity entity : Bukkit.getWorld("world").getEntities()) {
                    if (entity instanceof Item || entity instanceof Animals || entity instanceof Monster) {
                        entity.remove();
                    }
                }
                sender.sendMessage(Beaconessentials.PREFIX + "§aAlle Entitys wurden entfernt!");
            }
            else {
                sender.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
            }
        }
        return false;
    }
}

