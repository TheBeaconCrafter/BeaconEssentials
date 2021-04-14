package dev.thebeaconcrafter.beaconessentials.utils;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.IOException;

public class FileConfig extends YamlConfiguration {

    private String path;

    public FileConfig(String folder, String filename) {
        this.path = "plugins/" + folder + "/" + filename;

        try {
            load(this.path);
        } catch (InvalidConfigurationException | IOException ex) {
            ex.printStackTrace();
        }

    }

    public FileConfig(String filename) {
        this("BeaconEssentials", filename);
    }

    public void saveConfig() {
        try {
            save(this.path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
