package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import java.util.*;

public class GamemodeCommand implements CommandExecutor
{
    private static final List<String> AllowedGamemodes;

    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player player = (Player)sender;
        if (player.hasPermission("beacon.beaconessentials.gamemode")) {
            if (args.length != 1 || !GamemodeCommand.AllowedGamemodes.contains(args[0])) {
                player.sendMessage(Beaconessentials.PREFIX + "§c/gamemode (0 | 1 | 2 | 3) (<Spieler>)");
                return true;
            }
            String modeText = "unbekannt";
            final String s = args[0];
            switch (s) {
                case "0":
                case "survival": {
                    player.setGameMode(GameMode.SURVIVAL);
                    modeText = "Survivalmode";
                    break;
                }
                case "1":
                case "creative": {
                    player.setGameMode(GameMode.CREATIVE);
                    modeText = "Creativemode";
                    break;
                }
                case "2":
                case "adventure": {
                    player.setGameMode(GameMode.ADVENTURE);
                    modeText = "Adventuremode";
                    break;
                }
                case "3":
                case "spectator": {
                    player.setGameMode(GameMode.SPECTATOR);
                    modeText = "Spectatormode";
                    break;
                }
            }
            player.sendMessage(Beaconessentials.PREFIX + "§aDu wurdest in den §6" + modeText + " §agesetzt! ");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 1.2f);
        }
        else {
            player.sendMessage(Beaconessentials.PREFIX + " " + Beaconessentials.NOPERMS);
        }
        return false;
    }

    static {
        AllowedGamemodes = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "survival", "creative", "adventure", "spectator"));
    }
}
