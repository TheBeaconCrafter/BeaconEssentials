package dev.thebeaconcrafter.beaconessentials.listener;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {

        if(event.getEntity().getKiller() instanceof Player) {
            Player killer = event.getEntity().getKiller();
            Player player = event.getEntity().getPlayer();

            killer.sendMessage(Beaconessentials.PREFIX + "§cDu hast §6" + player.getName() + " §cgetötet.");
            player.sendMessage(Beaconessentials.PREFIX + "§cDu wurdest von §6" + killer.getName() + " §cgetötet.");
            event.setDeathMessage(Beaconessentials.PREFIX + "§6" + player.getName() + "§c wurde von§6" + killer.getName() + " §c getötet.");
        }

        Player player = event.getEntity().getPlayer();

        player.performCommand("spawn");

        if(player.hasPermission("beacon.beaconessentials.spawn.deathtp")) {
            player.performCommand("spawn");
        } else {
            return;
        }

    }
}
