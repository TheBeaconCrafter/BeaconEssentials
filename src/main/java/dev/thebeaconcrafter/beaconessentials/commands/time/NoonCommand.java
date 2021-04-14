package dev.thebeaconcrafter.beaconessentials.commands.time;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.entity.*;

public class NoonCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player)sender;
        if (player.hasPermission("beacon.beaconessentials.time")) {
            player.getWorld().setTime(6000L);
            player.sendMessage(Beaconessentials.PREFIX + " §aDie Zeit wurde auf §6Mittag §agestellt!");
        } else {
            player.sendMessage(Beaconessentials.PREFIX + " §cDu darfst diesen Befehl nicht nutzen!");
        }

        return false;
    }
}
