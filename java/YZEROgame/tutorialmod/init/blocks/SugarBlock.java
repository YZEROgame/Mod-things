package YZEROgame.tutorialmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class SugarBlock extends CustomSand
{

	public SugarBlock(String name, float hardness, float resistance, int harvestLevel) 
	{
		super(name, hardness, resistance);
		blockSoundType.getBreakSound();
		setSoundType(blockSoundType.SAND);
		setHarvestLevel("pickaxe", harvestLevel);
	}
	
}
