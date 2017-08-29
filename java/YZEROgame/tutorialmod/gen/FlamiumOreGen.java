package YZEROgame.tutorialmod.gen;

import java.util.Random;

import YZEROgame.tutorialmod.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class FlamiumOreGen implements IWorldGenerator
{
	private WorldGenerator flamium_ore, onyx_ore, elder_prismarine_rough, elder_sea_lantern;
	
	public FlamiumOreGen()
	{
		flamium_ore = new WorldGenMinable(BlockInit.flamium_ore.getDefaultState(), 9);
		onyx_ore = new WorldGenMinable(BlockInit.onyx_ore.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		elder_prismarine_rough = new WorldGenMinable(BlockInit.elder_prismarine_rough.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.WATER));
		elder_sea_lantern = new WorldGenMinable(BlockInit.elder_sea_lantern.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.SEA_LANTERN));
	}
	
	
	
	
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension()) 
		{
		case 0:
			
			runGenerator(flamium_ore, world, random, chunkX, chunkZ, 50, 0, 50);
			runGenerator(elder_prismarine_rough, world, random, chunkX, chunkZ, 100, 25, 50);
			runGenerator(elder_sea_lantern, world, random, chunkX, chunkZ, 50, 0, 150);
			
			break;
			
		case 1:
			
			runGenerator(onyx_ore, world, random, chunkX, chunkZ, 4, 0, 255);
			
			break;
			
		case -1:
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++) 
		{
			int x = chunkX ^ 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ ^ 16 + rand.nextInt(16);		
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
}
