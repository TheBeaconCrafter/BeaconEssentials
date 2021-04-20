package dev.thebeaconcrafter.beaconessentials;

import dev.thebeaconcrafter.beaconessentials.commands.broadcasts.BroadcastCommand;
import dev.thebeaconcrafter.beaconessentials.commands.kill.ClearLagCommand;
import dev.thebeaconcrafter.beaconessentials.commands.kill.KillItemsCommand;
import dev.thebeaconcrafter.beaconessentials.commands.kill.KillMobsCommand;
import dev.thebeaconcrafter.beaconessentials.commands.kill.KillMonsterCommand;
import dev.thebeaconcrafter.beaconessentials.commands.msg.MessageCommand;
import dev.thebeaconcrafter.beaconessentials.commands.warp.WarpCommand;
import dev.thebeaconcrafter.beaconessentials.listener.*;
import dev.thebeaconcrafter.beaconessentials.commands.*;
import dev.thebeaconcrafter.beaconessentials.commands.time.DayCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.MidnightCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.NightCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.NoonCommand;
import dev.thebeaconcrafter.beaconessentials.commands.weather.RainCommand;
import dev.thebeaconcrafter.beaconessentials.commands.weather.StormCommand;
import dev.thebeaconcrafter.beaconessentials.commands.weather.SunCommand;
import dev.thebeaconcrafter.beaconessentials.utils.Config;
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
    public static String VERSION = "§c§l1.5 BETAb05 ";
    public static String DOWNLOAD = "https://www.spigotmc.org/resources/%E2%9C%AF-beaconessentials-%E2%9C%AF.91293/";
    public static String SOURCECODE = "https://github.com/TheBeaconCrafter/BeaconEssentials";
    public static String NOPERMS = "§cDu darfst diesen Befehl nicht nutzen!";
    public static String INDEV = "§cDieses Feature ist noch in der Entwicklung!";
    public static String WIKI = "https://github.com/TheBeaconCrafter/BeaconEssentials/wiki/Start";
    public static String BCPREFIX = "§8[§4§lSYSTEM§8] §r";
    public static String MSGPREFIX = "§8[§b§lMSG§8] §r";
    public static Beaconessentials INSTANCE;

    public Beaconessentials() {
        INSTANCE = this;
    }

    public static Scoreboard sb;


    @Override
    public void onEnable() {
        // Plugin startup logic

        getConfig();

        saveDefaultConfig();


        saveConfig();

        instance = this;

        this.register();

        Bukkit.getPluginManager().registerEvents(this, this);

        sb = Bukkit.getScoreboardManager().getNewScoreboard();
        sb.registerNewTeam("000Owner");
        sb.registerNewTeam("001Spieler");
        sb.registerNewTeam("002VIP");
        sb.registerNewTeam("003Supporter");
        sb.registerNewTeam("004Moderator");
        sb.registerNewTeam("005Admin");
        sb.registerNewTeam("006VIPPlus");
        sb.registerNewTeam("007Premium");
        sb.registerNewTeam("008Diamond");

        sb.getTeam("000Owner").setPrefix("§4§lOwner §7● §6");
        sb.getTeam("001Spieler").setPrefix("§7Spieler §7● §r");
        sb.getTeam("002VIP").setPrefix("§6VIP §7● §r");
        sb.getTeam("003Supporter").setPrefix("§aSup §7● §r");
        sb.getTeam("004Moderator").setPrefix("§cMod §7● §r");
        sb.getTeam("005Admin").setPrefix("§4Admin §7● §r");
        sb.getTeam("006VIPPlus").setPrefix("§6VIP+ §7● §r");
        sb.getTeam("007Premium").setPrefix("§ePremium §7● §r");
        sb.getTeam("008Diamond").setPrefix("§bDiamond §7● §r");

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
        if(p.hasPermission("beacon.rang.admin")) {
            Team = "005Admin";
        }
        if(p.hasPermission("beacon.rang.vipplus")) {
            Team = "006VIPPlus";
        }
        if(p.hasPermission("beacon.rang.premium")) {
            Team = "007Premium";
        }
        if(p.hasPermission("beacon.rang.diamond")) {
            Team = "008Diamond";
        }


        sb.getTeam(Team).addPlayer(p);
        p.setDisplayName(sb.getTeam(Team).getPrefix() + p.getName());

        for(Player all : Bukkit.getOnlinePlayers()) {
            all.setScoreboard(sb);
        }

        cfg = new Config("warps.yml", getDataFolder());

        saveConfig();

        saveConfig();

        saveDefaultConfig();

        saveDefaultConfig();

        getConfig();

        getConfig().getBoolean("prefix");

    }



    @Override
    public void saveDefaultConfig() {
        super.saveDefaultConfig();
    }

    public static Config getCfg() {
        return cfg;
    }

    private static Config cfg;

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

    private static Beaconessentials instance;




        private void register() {

        //Listener

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinQuitListener(), this);
        PluginManager pluginManager1 = Bukkit.getPluginManager();
        pluginManager1.registerEvents(new UnknownCommandListener(), this);
        PluginManager pluginManager2 = Bukkit.getPluginManager();
        pluginManager2.registerEvents(new ChatListener(), this);
        PluginManager pluginManager3 = Bukkit.getPluginManager();
        pluginManager3.registerEvents(new ColoredChatListener(this), this);
        PluginManager pluginManager4 = Bukkit.getPluginManager();
        pluginManager4.registerEvents(new GlobalMuteListener(), this);
        PluginManager pluginManager5 = Bukkit.getPluginManager();
        pluginManager5.registerEvents(new DeathListener(), this);



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
        Bukkit.getPluginCommand("message").setExecutor(new MessageCommand());
        Bukkit.getPluginCommand("warp").setExecutor(new WarpCommand());
        Bukkit.getPluginCommand("clearlag").setExecutor(new ClearLagCommand());
        Bukkit.getPluginCommand("killitems").setExecutor(new KillItemsCommand());
        Bukkit.getPluginCommand("killmobs").setExecutor(new KillMobsCommand());
        Bukkit.getPluginCommand("killmonster").setExecutor(new KillMonsterCommand());
        Bukkit.getPluginCommand("invsee").setExecutor(new InvseeCommand());
        Bukkit.getPluginCommand("globalmute").setExecutor(new GlobalMuteCommand());
        Bukkit.getPluginCommand("broadcast").setExecutor(new BroadcastCommand());

        //Tablist


    }
}
