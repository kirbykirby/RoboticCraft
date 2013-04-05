package rc.common.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import rc.common.block.InitBlock;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator{

	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
            switch(world.provider.dimensionId)
            {
            case 1 : generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 2 : generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 3 : generateEnd(world, random, chunkX * 16, chunkZ * 16);
            }
    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {
            for(int i = 0; i < 100; i++)
            {
                    int xCoord = chunkX + random.nextInt(16);
                    int yCoord = random.nextInt(70);
                    int zCoord = chunkZ + random.nextInt(16);
             //       world.setBlock(xCoord, yCoord, zCoord, InitBlock.BlockOreTi.blockID);
                    (new WorldGenMinable(InitBlock.BlockOreTi.blockID, 14)).generate(world, random, xCoord, yCoord, zCoord);
            }
       
    }
    

    private void generateNether(World world, Random random, int chunkX, int chunkZ)
    {
            for(int i = 0; i < 80; i++)
            {
                    int xCoord = chunkX + random.nextInt(16);
                    int yCoord = random.nextInt(128);
                    int zCoord = chunkZ + random.nextInt(16);

            }
    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ)
    {
            for(int i = 0; i < 80; i++)
            {
                    int xCoord = chunkX + random.nextInt(16);
                    int yCoord = random.nextInt(128);
                    int zCoord = chunkZ + random.nextInt(16);

            }
    }
}


