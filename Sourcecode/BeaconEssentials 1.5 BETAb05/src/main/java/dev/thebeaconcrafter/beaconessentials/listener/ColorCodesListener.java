package dev.thebeaconcrafter.beaconessentials.listener;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorCodesListener extends JavaPlugin implements Listener {
    ArrayList black = new ArrayList();
    ArrayList dark_blue = new ArrayList();
    ArrayList dark_green = new ArrayList();
    ArrayList dark_aqua = new ArrayList();
    ArrayList dark_red = new ArrayList();
    ArrayList dark_purple = new ArrayList();
    ArrayList gold = new ArrayList();
    ArrayList gray = new ArrayList();
    ArrayList dark_gray = new ArrayList();
    ArrayList blue = new ArrayList();
    ArrayList green = new ArrayList();
    ArrayList aqua = new ArrayList();
    ArrayList red = new ArrayList();
    ArrayList light_purple = new ArrayList();
    ArrayList yellow = new ArrayList();
    ArrayList white = new ArrayList();


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("colors")) {
            sender.sendMessage(ChatColor.GREEN + "=============================================");
            sender.sendMessage(ChatColor.YELLOW + "  V V V V V " + ChatColor.LIGHT_PURPLE + "Minecraft Colors List" + ChatColor.YELLOW + "  V V V V V  ");
            sender.sendMessage(ChatColor.BLACK + "black");
            sender.sendMessage(ChatColor.DARK_BLUE + "dark_blue");
            sender.sendMessage(ChatColor.DARK_GREEN + "dark_green");
            sender.sendMessage(ChatColor.DARK_AQUA + "dark_aqua");
            sender.sendMessage(ChatColor.DARK_RED + "dark_red");
            sender.sendMessage(ChatColor.DARK_PURPLE + "dark_purple");
            sender.sendMessage(ChatColor.GOLD + "gold");
            sender.sendMessage(ChatColor.GRAY + "gray");
            sender.sendMessage(ChatColor.DARK_GRAY + "dark_gray");
            sender.sendMessage(ChatColor.BLUE + "blue");
            sender.sendMessage(ChatColor.GREEN + "green");
            sender.sendMessage(ChatColor.AQUA + "aqua");
            sender.sendMessage(ChatColor.RED + "red");
            sender.sendMessage(ChatColor.LIGHT_PURPLE + "light_purple");
            sender.sendMessage(ChatColor.YELLOW + "yellow");
            sender.sendMessage(ChatColor.WHITE + "white");
            sender.sendMessage(ChatColor.GREEN + "=============================================");
            return true;
        } else if(cmd.getName().equalsIgnoreCase("black")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.black.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("dark_blue")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.dark_blue.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("dark_green")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.dark_green.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("dark_aqua")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.dark_aqua.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("dark_red")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.dark_red.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("dark_purple")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.dark_purple.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("gold")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.gold.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("gray")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.gray.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("dark_gray")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.dark_gray.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("blue")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.blue.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("green")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.green.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("aqua")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.aqua.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("red")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.red.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("light_purple")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.light_purple.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("yellow")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.yellow.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else if(cmd.getName().equalsIgnoreCase("white")) {
            this.black.remove(sender.getName());
            this.dark_blue.remove(sender.getName());
            this.dark_green.remove(sender.getName());
            this.dark_red.remove(sender.getName());
            this.dark_aqua.remove(sender.getName());
            this.dark_purple.remove(sender.getName());
            this.gold.remove(sender.getName());
            this.gray.remove(sender.getName());
            this.dark_gray.remove(sender.getName());
            this.blue.remove(sender.getName());
            this.green.remove(sender.getName());
            this.red.remove(sender.getName());
            this.aqua.remove(sender.getName());
            this.light_purple.remove(sender.getName());
            this.yellow.remove(sender.getName());
            this.white.remove(sender.getName());
            this.white.add(sender.getName());
            sender.sendMessage(ChatColor.GREEN + this.getConfig().getString("color-preference"));
            return true;
        } else {
            return true;
        }
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        if(this.black.contains(e.getPlayer().getName().toString())) {
            e.setMessage(ChatColor.BLACK + e.getMessage());
        }

        if(this.dark_blue.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.DARK_BLUE + e.getMessage());
        }

        if(this.dark_green.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.DARK_GREEN + e.getMessage());
        }

        if(this.dark_aqua.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.DARK_AQUA + e.getMessage());
        }

        if(this.dark_red.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.DARK_RED + e.getMessage());
        }

        if(this.dark_purple.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.DARK_PURPLE + e.getMessage());
        }

        if(this.gold.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.GOLD + e.getMessage());
        }

        if(this.gray.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.GRAY + e.getMessage());
        }

        if(this.dark_gray.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.DARK_GRAY + e.getMessage());
        }

        if(this.blue.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.BLUE + e.getMessage());
        }

        if(this.green.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.GREEN + e.getMessage());
        }

        if(this.aqua.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.AQUA + e.getMessage());
        }

        if(this.red.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.RED + e.getMessage());
        }

        if(this.yellow.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.YELLOW + e.getMessage());
        }

        if(this.white.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.WHITE + e.getMessage());
        }

        if(this.light_purple.contains(e.getPlayer().getName())) {
            e.setMessage(ChatColor.LIGHT_PURPLE + e.getMessage());
        }

    }
}