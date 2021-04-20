package dev.thebeaconcrafter.beaconessentials.commands.warp;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.block.Beacon;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player)sender;

        if(args.length == 0) {
            if (p.hasPermission("beacon.beaconessentials.warp.manage")) {
                p.sendMessage(Beaconessentials.PREFIX + "§cNutze /warp <Name>, /warp add <Name>,");
                p.sendMessage(Beaconessentials.PREFIX + "§c/warp delete <Name> oder /warp list.");
            } else {
                p.sendMessage(Beaconessentials.PREFIX + "§cNutze /warp <Name> oder /warp list.");
            }

        }

        if(args.length == 1) {
            if(WarpManager.getWarp(args[0]) != null) {
                p.teleport(WarpManager.getWarp(args[0]));
                p.sendMessage(Beaconessentials.PREFIX + "§cDu wurdest zum Warp " + args[0] + "§cteleportiert.");
            }
        } else if(args.length == 2) {
            if (!(p.hasPermission("beacon.beaconessentials.warp.manage"))) {
                p.sendMessage(Beaconessentials.PREFIX + "" + Beaconessentials.NOPERMS);
                return false;
            }

            if(args[0].equalsIgnoreCase("add")) {
                if(WarpManager.getWarp(args[1]) == null) {
                    WarpManager.createWarp(args[1] , p.getLocation());
                    p.sendMessage(Beaconessentials.PREFIX + "§cDu hast den Warp " + args[1] + " §cerstellt.");
            } else {
                    p.sendMessage(Beaconessentials.PREFIX + "§cDieser Warp existiert bereits.");
                }
        } else if (args[0].equalsIgnoreCase("delete")) {
                if(WarpManager.getWarp(args[1]) != null) {
                    WarpManager.deleteWarp(args[1]);
                    p.sendMessage(Beaconessentials.PREFIX + "§cDu hast den Warp " + args[1] + " §gelöscht.");
                } else {
                    p.sendMessage(Beaconessentials.PREFIX + "§cDiesen Warp gibt es nicht.");
                }
            }
            if(args[0].equalsIgnoreCase("list")) {
                p.sendMessage(Beaconessentials.PREFIX + "§cDieses Feature ist noch in der Entwicklung!");
            }
            if(args[0].equalsIgnoreCase("help")) {
                if (p.hasPermission("beacon.beaconessentials.warp.manage")) {
                    p.sendMessage(Beaconessentials.PREFIX + "§cNutze /warp <Name>, /warp add <Name>,");
                    p.sendMessage(Beaconessentials.PREFIX + "§c/warp delete <Name> oder /warp list.");
                } else {
                    p.sendMessage(Beaconessentials.PREFIX + "§cNutze /warp <Name> oder /warp list.");
                }
            }

        return false;
    }
  return true;  }
}
