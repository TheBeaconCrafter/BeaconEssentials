package dev.thebeaconcrafter.beaconessentials.commands;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import net.md_5.bungee.api.chat.*;

public class HelpCommand implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player player = (Player)sender;
        final ComponentBuilder discordBuilder = new ComponentBuilder();
        discordBuilder.append(Beaconessentials.PREFIX + "§r §8§l\u226b §7E-Mail: ");
        discordBuilder.append("§7mail@vwdev.tk").event(new ClickEvent(ClickEvent.Action.OPEN_URL, "mailto://mail@vwdev.tk"));
        final ComponentBuilder dcServerBuilder = new ComponentBuilder();
        dcServerBuilder.append(Beaconessentials.PREFIX + "§r §8§l\u226b §7TS-Server: ");
        dcServerBuilder.append("§7[§bKlick§7]").event(new ClickEvent(ClickEvent.Action.OPEN_URL, "ts3server://217.160.42.154?9987"));
        player.sendMessage("");
        player.sendMessage(Beaconessentials.PREFIX + " §8§l\u226b §f\u25cf §lInformationen §r§f\u25cf");
        player.sendMessage(Beaconessentials.PREFIX + "§r §8§l\u226b §7Twitch: §dtwitch.tv/thebeaconcrafter");
        player.spigot().sendMessage(discordBuilder.create());
        player.spigot().sendMessage(dcServerBuilder.create());
        player.sendMessage("");
        return false;
    }
}
