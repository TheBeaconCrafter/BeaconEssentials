package dev.thebeaconcrafter.beaconessentials.commands;


import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.inventory.*;

public class InvseeCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String cmdLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player p = (Player)sender;
        if (p.hasPermission("beacon.beaconessentials.invsee")) {
            if (args.length == 1) {
                final Player open_inv = Bukkit.getPlayerExact(args[0]);
                if (open_inv != null) {
                    p.openInventory((Inventory)open_inv.getInventory());
                }
                else {
                    p.sendMessage(Beaconessentials.PREFIX + "§cDieser Spieler ist nicht Online!");
                }
            }
            else {
                p.sendMessage(Beaconessentials.PREFIX + "§c/invsee <Spieler>");
            }
        }
        else {
            p.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
        }
        return true;
    }
}

