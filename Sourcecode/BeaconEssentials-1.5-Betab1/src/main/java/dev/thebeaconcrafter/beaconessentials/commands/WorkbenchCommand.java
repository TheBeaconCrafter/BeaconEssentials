package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WorkbenchCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       if(!(sender instanceof Player)) {
          sender.sendMessage(Beaconessentials.PREFIX + "§cDu musst ein Spieler sein!");
       }

       Player p = (Player)sender;

       if(!p.hasPermission("beacon.beaconessentials.wb")) {
           p.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);

       if(args.length != 0) {
           p.sendMessage(Beaconessentials.PREFIX + "§cBitte nutze /workbench!");
       }

       } else {
           p.openWorkbench(p.getLocation(), true);
       }

       return false;
    }
}
