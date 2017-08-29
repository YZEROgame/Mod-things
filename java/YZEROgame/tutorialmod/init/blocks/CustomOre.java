package YZEROgame.tutorialmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomOre extends Block
{
	public CustomOre(String name, float hardness, float resistance) 
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}
}
