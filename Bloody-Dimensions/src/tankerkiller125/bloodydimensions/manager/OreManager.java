package tankerkiller125.bloodydimensions.manager;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import tankerkiller125.bloodydimensions.core.BD_Blocks;
import tankerkiller125.bloodydimensions.worldgen.WorldGenEndMinable;
import cpw.mods.fml.common.IWorldGenerator;


@SuppressWarnings("unused")
public class OreManager implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
			case 0: 
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
			case 1: 
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int x, int z)
	{
		//Block to spawn | world | random | x | z | spawning in the whole chunk x2 | quantity | rarity | lowest | highest
		addOreSpawn(BD_Blocks.bloodyOre, world, random, x, z, 16, 16, 1 + random.nextInt(2), 10, 0, 15);
	}

	private void generateEnd(World world, Random random, int x, int z)
	{
		int Xcoord = x + random.nextInt(16);
		int Ycoord = random.nextInt(128);
		int Zcoord = z + random.nextInt(16);

		(new WorldGenEndMinable(BD_Blocks.bloodyOre, 10, 100)).generate(world, random, Xcoord, Ycoord, Zcoord);
	}

	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);

		assert maxY > minY : "The maximum Y must be greater than the minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The maxiumum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The maximum Z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;

		for(int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}