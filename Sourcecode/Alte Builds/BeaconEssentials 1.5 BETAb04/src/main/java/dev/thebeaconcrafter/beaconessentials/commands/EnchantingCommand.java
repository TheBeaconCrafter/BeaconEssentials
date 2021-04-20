package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Sound;
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
            p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.4f);

            if(args.length != 0) {
                p.sendMessage(Beaconessentials.PREFIX + "§cBitte nutze /enchant!");
                p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.4f);
            }

        } else {
            p.openEnchanting(p.getLocation(), true);
        }

        return false;
    }
}
