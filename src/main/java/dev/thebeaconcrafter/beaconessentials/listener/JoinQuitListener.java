package dev.thebeaconcrafter.beaconessentials.listener;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.block.Beacon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.performCommand("spawn");
        player.sendMessage(Beaconessentials.PREFIX + "§6§l Willkommen zurück!");
        event.setJoinMessage("§a[§6§l+§a]§7 " + player.getDisplayName());

        if(player.hasPermission("beacon.beaconessentials.rang.owner")) {
            player.setDisplayName("§4Owner §8| §r" + player.getName() + "§r");
            player.setPlayerListName(player.getDisplayName());
        } else {
            return;
        }
        if(player.hasPermission("beacon.beaconessentials.rang.admin")) {
            player.setDisplayName("§cAdmin §8| §r" + player.getName() + "§r");
            player.setPlayerListName(player.getDisplayName());
        } else {
            return;
        }
        if(player.hasPermission("beacon.beaconessentials.rang.vip")) {
            player.setDisplayName("§eVIP §8| §r" + player.getName() + "§r");
            player.setPlayerListName(player.getDisplayName());
        } else {
            return;
        }
        if(player.hasPermission("beacon.beaconessentials.rang.vipplus")) {
            player.setDisplayName("§eVIP+ §8| §r" + player.getName() + "§r");
            player.setPlayerListName(player.getDisplayName());
        } else {
            return;
        }
        if(player.hasPermission("beacon.beaconessentials.rang.spieler")) {
            player.setDisplayName("§8Spieler §8| §r" + player.getName() + "§r");
            player.setPlayerListName(player.getDisplayName());
        } else {
            return;
        }
        if(player.hasPermission("beacon.beaconessentials.rang.legende")) {
            player.setDisplayName("§5Legende §8| §r" + player.getName() + "§r");
            player.setPlayerListName(player.getDisplayName());
        } else {
            return;
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("§a[§c§l-§a]§7" + player.getDisplayName());
    }

}
