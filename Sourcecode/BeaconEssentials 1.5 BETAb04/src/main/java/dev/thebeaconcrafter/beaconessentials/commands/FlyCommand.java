package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            Beaconessentials.INSTANCE.log("§cDu musst ein Spieler sein!");
            return true;
        }

        Player player = (Player) sender;

        if (player.hasPermission("beacon.beaconessentials.fly")) {
            if (!(player.getAllowFlight())) {
                player.setAllowFlight(true);
                player.setFlying(true);
                player.sendMessage(Beaconessentials.PREFIX + "§aDu kannst nun fliegen.");
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 1.2f);
            } else {
                player.setAllowFlight(false);
                player.setFlying(false);
                player.sendMessage(Beaconessentials.PREFIX + "§aDu kannst nun nicht mehr fliegen.");
                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.2f);
            }
            if (args.length == 1) {
                final Player target = Bukkit.getPlayer(args[0]);
                if (target == null) {
                    player.sendMessage(Beaconessentials.PREFIX + "§cDieser Spieler ist nicht Online!");
                    return true;
                }
                if (!target.getAllowFlight()) {
                    target.setAllowFlight(true);
                    target.sendMessage(Beaconessentials.PREFIX + "§aDu kannst nun Fliegen!");
                    player.sendMessage(Beaconessentials.PREFIX + "§aDer Spieler §6" + target.getName() + " §akann nun Fliegen!");
            }
        else {
        player.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);
        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.4f);
                }

                }
            }
        else {
            final Player target = Bukkit.getPlayer(args[0]);

            target.setAllowFlight(false);
            target.sendMessage(Beaconessentials.PREFIX + " §aDu kannst nun nicht mehr Fliegen!");
            player.sendMessage(Beaconessentials.PREFIX + " §aDer Spieler §6" + target.getName() + " §akann nun nicht mehr Fliegen!");
        }
        return true;
    }
}


