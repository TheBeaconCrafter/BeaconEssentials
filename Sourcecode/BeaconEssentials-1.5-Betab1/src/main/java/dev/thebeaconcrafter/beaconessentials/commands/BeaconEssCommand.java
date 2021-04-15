package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.block.Beacon;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.graalvm.compiler.java.GraphBuilderPhase;

public class BeaconEssCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            return true;
        }
        final Player player =(Player)sender;

        if (player.hasPermission("beacon.beaconesssentials.info")) {
            player.sendMessage(Beaconessentials.PREFIX + " §8§l\u226b §f\u25cf §lBeaconEssentials 1 §r§f\u25cf");
            player.sendMessage(Beaconessentials.PREFIX + "§cby TheBeaconCrafter Version " + Beaconessentials.VERSION);
            player.sendMessage(Beaconessentials.PREFIX + "§cNeuste Version bei: /update!");
            player.sendMessage(Beaconessentials.PREFIX + "§cSourcecode bei:s");
            player.sendMessage(Beaconessentials.PREFIX + "§c" + Beaconessentials.SOURCECODE);
            player.sendMessage(Beaconessentials.PREFIX + "§cDanke, dass du BeaconEssentials unterstützt!");
        } else {
            player.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);
        }



    return true;}
}
