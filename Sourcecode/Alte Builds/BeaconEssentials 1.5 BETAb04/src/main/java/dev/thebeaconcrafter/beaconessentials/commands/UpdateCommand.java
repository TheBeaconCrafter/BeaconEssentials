package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Sound;
import org.bukkit.block.Beacon;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.graalvm.compiler.java.GraphBuilderPhase;

public class UpdateCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return true;
        }
        final Player player = (Player)sender;

        if (player.hasPermission("beacon.beaconessentials.update")) {

            player.sendMessage(Beaconessentials.PREFIX + " §8§l\u226b §f\u25cf §lBeaconEssentials Update §r§f\u25cf");
            player.sendMessage(Beaconessentials.PREFIX + "§cDeine Version: " + Beaconessentials.VERSION);
            player.sendMessage(Beaconessentials.PREFIX + "§cNeuste Version bei:");
            player.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.DOWNLOAD);
            player.sendMessage(Beaconessentials.PREFIX + "§cSourcecode bei:");
            player.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.SOURCECODE);
            player.sendMessage(Beaconessentials.PREFIX + "§cDanke, dass du BeaconEssentials unterstützt!");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 1.2f);
        } else {
            player.sendMessage(Beaconessentials.PREFIX + "§cDu darfst diesen Befehl nicht nutzen!");
        }



        return true;}
}
