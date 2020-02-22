package org.bukkitcgtester.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

public class CG extends ChunkGenerator{
	
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
    	ChunkData data = this.createChunkData(world);
    	for(int x = 0; x < 16; x++){
    		for(int z = 0; z < 16; z++){
    			data.setBlock(x, 90, z, Material.DIRT);
    		}
    	}
    	return data;
    }

//    @Override
//    public List<BlockPopulator> getDefaultPopulators(World world) {
//        return new ArrayList<BlockPopulator>(){{
//        	add(new Populator());
//        }};
//    }
}
