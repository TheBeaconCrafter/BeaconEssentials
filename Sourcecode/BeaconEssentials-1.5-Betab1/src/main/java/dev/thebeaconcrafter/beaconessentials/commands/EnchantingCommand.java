package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnchantingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(Beaconessentials.PREFIX + "§cDu musst ein Spieler sein!");
        }

        Player p = (Player)sender;

        if(!p.hasPermission("beacon.beaconessentials.enchant")) {
            p.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);

            if(args.length != 0) {
                p.sendMessage(Beaconessentials.PREFIX + "§cBitte nutze /enchant!");
            }

        } else {
            p.openEnchanting(p.getLocation(), true);
        }

        return false;
    }
}
