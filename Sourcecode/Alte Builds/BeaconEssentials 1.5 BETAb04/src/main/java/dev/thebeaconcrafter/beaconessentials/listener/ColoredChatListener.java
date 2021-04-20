package dev.thebeaconcrafter.beaconessentials.listener;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ColoredChatListener implements Listener {
    private Beaconessentials plugin;

    public ColoredChatListener(Beaconessentials coloredChat) {
        this.plugin = coloredChat;
        this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
    }

    @EventHandler(
            priority = EventPriority.HIGH
    )
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        String c = this.plugin.getConfig().getString("global.char");
        if(e.getMessage().toLowerCase().contains(this.plugin.getConfig().getString("global.char"))) {
            if(this.plugin.getConfig().getBoolean("global.use permissions")) {
                if(e.getMessage().contains(c + "0")) {
                    if(p.hasPermission("beacon.color.black")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "1")) {
                    if(p.hasPermission("beacon.color.darkblue")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "2")) {
                    if(p.hasPermission("beacon.color.darkgreen")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "3")) {
                    if(p.hasPermission("beacon.color.darkturquoise")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "4")) {
                    if(p.hasPermission("beacon.color.darkred")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "5")) {
                    if(p.hasPermission("beacon.color.purple")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "6")) {
                    if(p.hasPermission("beacon.color.gold")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "7")) {
                    if(p.hasPermission("beacon.color.gray")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "8")) {
                    if(p.hasPermission("beacon.color.darkgray")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "9")) {
                    if(p.hasPermission("beacon.color.blue")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "a")) {
                    if(p.hasPermission("beacon.color.green")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "b")) {
                    if(p.hasPermission("beacon.color.turquoise")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "c")) {
                    if(p.hasPermission("beacon.color.red")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "d")) {
                    if(p.hasPermission("beacon.color.pink")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "e")) {
                    if(p.hasPermission("beacon.color.yellow")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }

                if(e.getMessage().contains(c + "f")) {
                    if(p.hasPermission("beacon.color.white")) {
                        e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
                    } else {
                        this.permissionMessage(p);
                        e.setCancelled(true);
                    }
                }
            } else {
                e.setMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), e.getMessage()));
            }
        }

    }

    private void permissionMessage(Player p) {
        String m = this.plugin.getConfig().getString("messages.permission message");
        p.sendMessage(ChatColor.translateAlternateColorCodes(this.plugin.getConfig().getString("global.char").charAt(0), m));
    }
}

