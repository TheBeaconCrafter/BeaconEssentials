package dev.thebeaconcrafter.beaconessentials.commands.time;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Sound;
import org.bukkit.command.*;
import org.bukkit.entity.*;

public class DayCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        final Player player = (Player)sender;
        if (player.hasPermission("beacon.beaconessentials.time")) {
            player.getWorld().setTime(100L);
            player.sendMessage(Beaconessentials.PREFIX + "§aDie Zeit wurde auf §6Tag §agestellt!");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 1.2f);
        } else {
            player.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);
        }

        return false;
    }
}
