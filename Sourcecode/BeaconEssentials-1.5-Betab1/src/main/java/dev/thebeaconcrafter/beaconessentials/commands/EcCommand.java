package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class EcCommand implements CommandExecutor {

    ArrayList<UUID> ec = new ArrayList<UUID>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Beaconessentials.PREFIX + "§cDu musst ein Spieler sein!");
        }

        Player p = (Player) sender;

        if (!p.hasPermission("beacon.beaconessentials.ec")) {
            p.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);

            if (args.length != 0) {
                p.sendMessage(Beaconessentials.PREFIX + "§cBitte nutze /ec <Spieler>");
            }

        } else {

            if(args.length == 0) {

                p.openInventory(p.getEnderChest());

            } else if(args.length == 1) {
                Player t = Bukkit.getPlayer(args[0]);
                if(t == null) {
                    p.sendMessage(Beaconessentials.PREFIX + "§cDieser Spieler ist nicht online!");
                } else {
                    p.openInventory(t.getEnderChest());
                    ec.contains(p.getUniqueId());
                }
            }


        }
        return false;
    }
}