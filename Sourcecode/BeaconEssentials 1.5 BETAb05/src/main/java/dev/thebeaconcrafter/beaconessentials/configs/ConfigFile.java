package dev.thebeaconcrafter.beaconessentials.configs;

import org.bukkit.plugin.java.JavaPlugin;

public class ConfigFile extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        if (getConfig().getBoolean("prefix")) {
            getLogger().info(getConfig().getString("prefix.msg"));
        }
    }


}
