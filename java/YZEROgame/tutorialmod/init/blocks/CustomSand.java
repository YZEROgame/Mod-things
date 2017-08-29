package YZEROgame.tutorialmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomSand extends Block
{
	public CustomSand(String name, float hardness, float resistance) 
	{
		super(Material.SAND);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}
}
