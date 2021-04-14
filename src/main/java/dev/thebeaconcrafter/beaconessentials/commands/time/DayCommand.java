package dev.thebeaconcrafter.beaconessentials.commands.time;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.entity.*;

public class DayCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player)sender;
        if (player.hasPermission("beacon.beaconessentials.time")) {
            player.getWorld().setTime(100L);
            player.sendMessage(Beaconessentials.PREFIX + " §aDie Zeit wurde auf §6Tag §agestellt!");
        } else {
            player.sendMessage(Beaconessentials.PREFIX + " §cDu darfst diesen Befehl nicht nutzen!");
        }

        return false;
    }
}
