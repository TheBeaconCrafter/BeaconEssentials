package dev.thebeaconcrafter.beaconessentials.utils;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player))
            return true;

        Player player = (Player) sender;
        FileConfig spawns = new FileConfig("locations.yml");
        if (label.equals("setspawn")) {
          if(player.hasPermission("beacon.beaconessentials.spawn.set")) {
              spawns.set("spawn", LocationUtils.loc2Str(player.getLocation()));
              spawns.saveConfig();
              player.sendMessage(Beaconessentials.PREFIX + " §aSpawn gesetzt!");
              player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.2f);
          } else {
              player.sendMessage(Beaconessentials.PREFIX + " §cDu darfst diesen Befehl nicht nutzen!");
          }
            return true;
        }

        if(spawns.contains("spawn")) {
            LocationUtils.teleport(player, LocationUtils.str2loc(spawns.getString("spawn")));
        } else {
            player.sendMessage(Beaconessentials.PREFIX + " §cEs wurde noch kein Spawnpunkt gesetzt.");
            player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.2f);
        }
        return true;
    }
}
