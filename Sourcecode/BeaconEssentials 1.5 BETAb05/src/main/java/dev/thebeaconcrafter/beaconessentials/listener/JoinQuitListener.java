package dev.thebeaconcrafter.beaconessentials.listener;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.block.Beacon;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scoreboard.Scoreboard;

public class JoinQuitListener implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(Beaconessentials.PREFIX + "§6§l Willkommen zurück! Viel Spaß auf dem Server!");
        event.setJoinMessage("§a[§6§l+§a]§7 " + player.getDisplayName());

        if(player.hasPermission("beacon.beaconessentials.spawn.autoteleport")) {
            player.performCommand("spawn");
        }

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("§a[§c§l-§a]§7" + player.getDisplayName());
    }

}
