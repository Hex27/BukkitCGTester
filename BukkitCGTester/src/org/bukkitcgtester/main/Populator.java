package org.bukkitcgtester.main;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.data.type.Farmland;
import org.bukkit.generator.BlockPopulator;

public class Populator extends BlockPopulator {

	@Override
	public void populate(World world, Random random, Chunk chunk) {
		for(int x = 0; x < 16; x++){
			for(int z = 0; z < 16; z++){
				int y = 4;
				if(random.nextInt(100) != 0) continue;
				
				Farmland data = (Farmland) Bukkit.createBlockData(Material.FARMLAND);
				data.setMoisture(data.getMaximumMoisture());
				chunk.getBlock(x, y, z).setBlockData(data);
			}
		}
	}

}
