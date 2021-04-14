package dev.thebeaconcrafter.beaconessentials;

import dev.thebeaconcrafter.beaconessentials.commands.*;
import dev.thebeaconcrafter.beaconessentials.commands.time.DayCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.MidnightCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.NightCommand;
import dev.thebeaconcrafter.beaconessentials.commands.time.NoonCommand;
import dev.thebeaconcrafter.beaconessentials.listener.JoinQuitListener;
import dev.thebeaconcrafter.beaconessentials.listener.UnknownCommandListener;
import dev.thebeaconcrafter.beaconessentials.utils.SpawnCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Beaconessentials extends JavaPlugin {

    public static String PREFIX = "§c[§4§lBeacon§6§lEssentials§c]§7§o";
    public static Beaconessentials INSTANCE;

    public Beaconessentials() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.register();

        log(" by TheBeaconCrafter V1.0-SNAPSHOT geladen.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log( " by TheBeaconCrafter V1.0-SNAPSHOT entladen.");
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
    }
}
