package dev.thebeaconcrafter.beaconessentials.listener;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import dev.thebeaconcrafter.beaconessentials.commands.GlobalMuteCommand;
import org.bukkit.event.player.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class GlobalMuteListener implements Listener
{
    @EventHandler
    public void GlobalMuteChat(final AsyncPlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (GlobalMuteCommand.globalmute) {
            if (!p.hasPermission("beacon.beaconessentials.globalmute.ignore")) {
                p.sendMessage(Beaconessentials.PREFIX + "§aDer Chat ist derzeit §cdeaktivert§a!");
                e.setCancelled(true);
            }
        }
        else if (!GlobalMuteCommand.globalmute) {
            e.setCancelled(false);
        }
    }
}
