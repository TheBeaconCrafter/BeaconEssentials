package dev.thebeaconcrafter.beaconessentials.commands.weather;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SunCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player player =(Player)sender;
        if (player.hasPermission("beacon.beaconessentials.weather")) {
            player.getWorld().setStorm(false);
            player.getWorld().setThundering(false);
            player.sendMessage(Beaconessentials.PREFIX + "§aDas Wetter wurde auf §cSonne §agestellt.");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 1.2f);
        } else {
            player.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);
        }
        return false;
    }
}
