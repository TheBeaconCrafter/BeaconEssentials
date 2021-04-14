package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {
            Beaconessentials.INSTANCE.log(" Du musst ein Spieler sein!");
            return true;
        }

        Player player = (Player) sender;

        if(player.hasPermission("beacon.beaconessentials.heal")) {
            player.setHealth(20d);
            player.setFoodLevel(20);
            player.sendMessage(Beaconessentials.PREFIX + " §aDu wurdest geheilt.");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 1.2f);
        } else {
           player.sendMessage(Beaconessentials.PREFIX + " §cDu darfst diesen Befehl nicht nutzen!");
           player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.2f, 1.4f);
        }



        return true;
    }
}
