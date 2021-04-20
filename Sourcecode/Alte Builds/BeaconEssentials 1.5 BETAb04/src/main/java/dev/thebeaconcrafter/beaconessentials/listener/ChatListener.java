package dev.thebeaconcrafter.beaconessentials.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        String Message = event.getMessage();
        Message.replace("%", "Prozent");

        if(player.hasPermission("beacon.rang.owner")) {
            event.setFormat("§4§lOwner §7● §6" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.vip")) {
            event.setFormat("§6VIP §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.vipplus")) {
            event.setFormat("§6VIP+ §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.supporter")) {
            event.setFormat("§aSupporter §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.moderator")) {
            event.setFormat("§cModerator §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.admin")) {
            event.setFormat("§4Admin §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.premium")) {
            event.setFormat("§ePremium §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.diamond")) {
            event.setFormat("§bDiamond §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
        if(player.hasPermission("beacon.rang.spieler")) {
            event.setFormat("§7Spieler §7● §7" + player.getName() + " §8§l»§7 " + Message);
        }
    }

}
