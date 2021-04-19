package dev.thebeaconcrafter.beaconessentials.commands.warp;

import dev.thebeaconcrafter.beaconessentials.Beaconessentials;
import org.bukkit.Location;

public class WarpManager {

    public static Location getWarp(String name) {
        return Beaconessentials.getCfg().getConfiguration().getLocation(name);
    }

    public static void createWarp(String name , Location location) {
        Beaconessentials.getCfg().set(name , location);
        Beaconessentials.getCfg().save();
    }
    public static void deleteWarp(String name) {
        Beaconessentials.getCfg().set(name , null);
        Beaconessentials.getCfg().save();
    }

}
