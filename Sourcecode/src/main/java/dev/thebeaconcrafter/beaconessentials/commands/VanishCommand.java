package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class VanishCommand implements CommandExecutor {

    ArrayList<String> vanish = new ArrayList<String>();


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if (p.hasPermission("beacon.beaconessentials.vanish")) {
            if (args.length == 0) {
                if (vanish.contains(p.getName())) {
                    vanish.remove(p.getName());
                    p.sendMessage(Beaconessentials.PREFIX + " §aDu bist nun für alle Spieler §csichtbar§a.");
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        all.showPlayer(p);
                    }
                } else {
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        all.hidePlayer(p);
                    }
                    vanish.add(p.getName());
                    p.sendMessage(Beaconessentials.PREFIX + " §aDu bist nun §cunsichtbar §afür normale Benutzer und ihre Befehle.");
                }
            } else if (args.length == 1) {
            } else {
                p.sendMessage(Beaconessentials.PREFIX + " §cFalscher Syntax!");
            }


        } else {
            p.sendMessage(Beaconessentials.PREFIX + " §cDu darfst diesen Befehl nicht nutzen!");
        }
        return false;}
}
