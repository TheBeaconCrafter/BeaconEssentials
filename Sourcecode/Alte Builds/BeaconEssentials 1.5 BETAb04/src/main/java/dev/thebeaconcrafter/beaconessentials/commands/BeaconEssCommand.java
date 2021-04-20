package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
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
            player.sendMessage(Beaconessentials.PREFIX + "§cNeuste Version bei: /beacon update!");
            player.sendMessage(Beaconessentials.PREFIX + "§cSourcecode bei: /beacon sourcecode");
            player.sendMessage(Beaconessentials.PREFIX + "§cHilfe bei: /beacon help");
            player.sendMessage(Beaconessentials.PREFIX + "§cDanke, dass du BeaconEssentials unterstützt!");
        } else {
            player.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
        }
        if (player.hasPermission("beacon.beaconessentials.info")) {
            if(args[0].equalsIgnoreCase("update")) {
                player.sendMessage(Beaconessentials.PREFIX + " §8§l\u226b §f\u25cf §lBeaconEssentials 1 §r§f\u25cf");
                player.sendMessage(Beaconessentials.PREFIX + Beaconessentials.INDEV);
                player.sendMessage(Beaconessentials.PREFIX + "§cNeueste Plugin-Version immer bei:");
                player.sendMessage(Beaconessentials.PREFIX + "§c" + Beaconessentials.DOWNLOAD);
            }
        } else {
            player.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
        }
        if (player.hasPermission("beacon.beaconessentials.info")) {
            if(args[0].equalsIgnoreCase("sourcecode")) {
                player.sendMessage(Beaconessentials.PREFIX + " §8§l\u226b §f\u25cf §lBeaconEssentials 1 §r§f\u25cf");
                player.sendMessage(Beaconessentials.PREFIX + Beaconessentials.INDEV);
                player.sendMessage(Beaconessentials.PREFIX + "§cNeuester Sourcecode immer bei:");
                player.sendMessage(Beaconessentials.PREFIX + "§c" + Beaconessentials.SOURCECODE);
            }
        } else {
            player.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
        }
        if (player.hasPermission("beacon.beaconessentials.info")) {
            if(args[0].equalsIgnoreCase("help")) {
                player.sendMessage(Beaconessentials.PREFIX + " §8§l\u226b §f\u25cf §lBeaconEssentials 1 §r§f\u25cf");
                player.sendMessage(Beaconessentials.PREFIX + "§cHilfe gibt es auf GitHub unter dem Link:");
                player.sendMessage(Beaconessentials.PREFIX + "§c" + Beaconessentials.WIKI);
            }
        } else {
            player.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
        }




    return true;}
}
