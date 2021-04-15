package dev.thebeaconcrafter.beaconessentials;

import org.bukkit.command.defaults.ReloadCommand;
import org.bukkit.configuration.file.YamlConfiguration;
import dev.thebeaconcrafter.beaconessentials.commands.*;
import dev.thebeaconcrafter.beaconessentials.commands.time.DayCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.MidnightCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.NightCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.NoonCommand;
import dev.thebeaconcrafter.beaconessentials.commands.weather.RainCommand;
import dev.thebeaconcrafter.beaconessentials.commands.weather.StormCommand;
import dev.thebeaconcrafter.beaconessentials.commands.weather.SunCommand;
import dev.thebeaconcrafter.beaconessentials.listener.JoinQuitListener;
import dev.thebeaconcrafter.beaconessentials.listener.UnknownCommandListener;
import dev.thebeaconcrafter.beaconessentials.utils.SpawnCommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

public final class Beaconessentials extends JavaPlugin implements Listener {

    //DEFINITIONEN

    public static String PREFIX = "§c[§4§lBeacon§6§lEssentials§c]§7§o ";
    public static String VERSION = "§c§l1.1 ";
    public static String DOWNLOAD = "https://www.spigotmc.org/resources/%E2%9C%AF-beaconessentials-%E2%9C%AF.91293/";
    public static String SOURCECODE = "https://github.com/TheBeaconCrafter/BeaconEssentials";
    public static String NOPERMS = "§cDu darfst diesen Befehl nicht nutzen!";
    public static Beaconessentials INSTANCE;

    public Beaconessentials() {
        INSTANCE = this;
    }

    public static Scoreboard sb;

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.register();

        Bukkit.getPluginManager().registerEvents(this, this);

        sb = Bukkit.getScoreboardManager().getNewScoreboard();
        sb.registerNewTeam("000Owner");
        sb.registerNewTeam("001Spieler");
        sb.registerNewTeam("002VIP");
        sb.registerNewTeam("003Supporter");
        sb.registerNewTeam("004Moderator");

        sb.getTeam("000Owner").setPrefix("§4Owner §7● §6");
        sb.getTeam("001Spieler").setPrefix("§7Spieler §7● §r");
        sb.getTeam("002VIP").setPrefix("§6VIP §7● §r");
        sb.getTeam("003Supporter").setPrefix("§aSup §7● §r");
        sb.getTeam("004Moderator").setPrefix("§cMod §7● §r");

        log("§cby TheBeaconCrafter V" + Beaconessentials.VERSION + "§cgeladen.");
    }
    @SuppressWarnings("deprecation")
    public void setPrefix(Player p) {
        String Team = "";

        if(p.hasPermission("beacon.rang.owner")) {
            Team = "000Owner";
        } else {
            Team = "001Spieler";
        }
        if(p.hasPermission("beacon.rang.vip")) {
            Team = "002VIP";
        }
        if(p.hasPermission("beacon.rang.supporter")) {
            Team = "003Supporter";
        }
        if(p.hasPermission("beacon.rang.moderator")) {
            Team = "004Moderator";
        }


        sb.getTeam(Team).addPlayer(p);
        p.setDisplayName(sb.getTeam(Team).getPrefix() + p.getName());

        for(Player all : Bukkit.getOnlinePlayers()) {
            all.setScoreboard(sb);
        }


    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        setPrefix(event.getPlayer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log( "§cby TheBeaconCrafter V" + Beaconessentials.VERSION + "§centladen.");
    }

    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + text);
    }

    private void register() {

        //Listener

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinQuitListener(), this);
        PluginManager pluginManager1 = Bukkit.getPluginManager();
        pluginManager1.registerEvents(new UnknownCommandListener(), this);

        //Commands

        Bukkit.getPluginCommand("heal").setExecutor(new HealCommand());
        Bukkit.getPluginCommand("fly").setExecutor(new FlyCommand());
        Bukkit.getPluginCommand("spawn").setExecutor(new SpawnCommand());
        Bukkit.getPluginCommand("vanish").setExecutor(new VanishCommand());
        Bukkit.getPluginCommand("help").setExecutor(new HelpCommand());
        Bukkit.getPluginCommand("night").setExecutor(new NightCommand());
        Bukkit.getPluginCommand("day").setExecutor(new DayCommand());
        Bukkit.getPluginCommand("midnight").setExecutor(new MidnightCommand());
        Bukkit.getPluginCommand("noon").setExecutor(new NoonCommand());
        Bukkit.getPluginCommand("gamemode").setExecutor(new GamemodeCommand());
        Bukkit.getPluginCommand("rain").setExecutor(new RainCommand());
        Bukkit.getPluginCommand("storm").setExecutor(new StormCommand());
        Bukkit.getPluginCommand("sun").setExecutor(new SunCommand());
        Bukkit.getPluginCommand("beaconessentials").setExecutor(new BeaconEssCommand());
        Bukkit.getPluginCommand("enderchest").setExecutor(new EcCommand());
        Bukkit.getPluginCommand("update").setExecutor(new UpdateCommand());
        Bukkit.getPluginCommand("workbench").setExecutor(new WorkbenchCommand());
        Bukkit.getPluginCommand("enchant").setExecutor(new EnchantingCommand());

        //Tablist


    }
}
