package org.bukkitcgtester.main;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.generator.ChunkGenerator;

public class BukkitCGTester extends JavaPlugin{

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new CG();
    }
	
}
