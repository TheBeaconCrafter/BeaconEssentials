package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.entity.Player;

public class NoBlockBreak {


    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if(!(event.getPlayer().hasPermission("beacon.block.place"))) {
            event.setBuild(false);
            event.setCancelled(true);
            event.getPlayer().sendMessage(Beaconessentials.PREFIX + "§cDu darfst hier nicht bauen!");
        }
    }  public void onBlockBreak(BlockBreakEvent event) {
        if(!(event.getPlayer().hasPermission("beacon.block.break"))) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(Beaconessentials.PREFIX + "§cDu darfst hier keine Blöcke zerstören!");

        }
    }
}
