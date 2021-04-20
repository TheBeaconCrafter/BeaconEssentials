package dev.thebeaconcrafter.beaconessentials.commands.broadcasts;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        final Player player = ((Player) sender);

        if(player.hasPermission("beacon.beaconessentials.broadcast")) {
            if (args.length == 0) {
                player.sendMessage(Beaconessentials.PREFIX + "§cFalscher Syntax! Nutze /broadcast <Nachricht>");
                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.4f);
                return true;
            }
        } else {
            player.sendMessage(Beaconessentials.PREFIX + Beaconessentials.NOPERMS);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0;i<args.length;i++){
            stringBuilder.append(args[i]).append(" ");
        }

        Bukkit.broadcastMessage(Beaconessentials.BCPREFIX + "§c" + stringBuilder.toString());
        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.2f, 1.4f);

        return false;
    }
}
