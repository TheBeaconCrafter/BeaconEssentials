package dev.thebeaconcrafter.beaconessentials.commands.msg;


import com.google.common.collect.Maps;
import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MessageCommand implements CommandExecutor {

    private static HashMap<UUID, UUID> replay = Maps.newHashMap();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage(Beaconessentials.PREFIX + "§cDu musst ein Spieler sein.");
            return false;
        }

        final Player player = ((Player) sender);

        if (player.hasPermission("beacon.beaconessentials.msg.write")) {
            if(args.length >= 2){

                final Player target = Bukkit.getPlayer(args[0]);

                if(target != null){

                    StringBuilder stringBuilder = new StringBuilder();

                    for(int i = 1;i<args.length;i++){
                        stringBuilder.append(args[i]).append(" ");
                    }

                    player.sendMessage(Beaconessentials.MSGPREFIX + "§8[§7Du §a-> §e" + target.getName() + "§8] §f" + stringBuilder.toString());
                    target.sendMessage(Beaconessentials.MSGPREFIX + "§8[§e" + player.getName() + " §a-> §7Dich§8] §f" + stringBuilder.toString());

                }else{
                    player.sendMessage(Beaconessentials.PREFIX + "§cDieser Spieler ist nicht online.");
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.2f);
                }
            }else{
                player.sendMessage(Beaconessentials.PREFIX + "§cNutze: /msg <Spieler> <Nachricht>");
                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.2f);
            }
        } else {
            player.sendMessage(Beaconessentials.PREFIX + "" + Beaconessentials.NOPERMS);
            player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.2f, 1.2f);
        }



        return false;
    }





}
