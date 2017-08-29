package YZEROgame.tutorialmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class CustomGlass extends Block
{
	public CustomGlass(String name, float hardness, float resistance) 
	{
		super(Material.GLASS);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer(){
	return BlockRenderLayer.TRANSLUCENT;
	
	}

	
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
}