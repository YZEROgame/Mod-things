package YZEROgame.tutorialmod.init.blocks;

import net.minecraft.block.Block;

public class ElderPris extends CustomOre 
{

	public ElderPris(String name, float hardness, float resistance, int harvestLevel) 
	{
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
	
}
