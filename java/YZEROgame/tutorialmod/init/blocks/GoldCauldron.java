package YZEROgame.tutorialmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class GoldCauldron extends CustomBlock 
{

	public GoldCauldron(String name, float hardness, float resistance, int harvestLevel) 
	{
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	@Override
	public boolean getUseNeighborBrightness(IBlockState state) {
		return false;
	}
}
