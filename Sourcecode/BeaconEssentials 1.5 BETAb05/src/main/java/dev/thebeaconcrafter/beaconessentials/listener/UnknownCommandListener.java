package dev.thebeaconcrafter.beaconessentials.listener;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class UnknownCommandListener implements Listener {

    @EventHandler
    public static void onCommand(PlayerCommandPreprocessEvent e) {
        String msg = e.getMessage();
        String[] args = msg.split(" ");
        Player p = e.getPlayer();

        if(Bukkit.getServer().getHelpMap().getHelpTopic(args[0]) == null) {
            e.setCancelled(true );

            p.sendMessage(Beaconessentials.PREFIX + "§cDer Befehl §8[§a" + msg + "§8]§c existiert nicht!");
            p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.2f);
        }
    }

}
