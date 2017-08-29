package YZEROgame.tutorialmod.init.blocks;

import java.util.Random;

import YZEROgame.tutorialmod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class OnyxBlock extends Block
{
	public OnyxBlock(String name, float hardness, float resistance) 
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ItemInit.onyx;
	}
	@Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return 1 + random.nextInt(2);
    }
	 @Override
	    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	    {
	        Random rand = world instanceof World ? ((World)world).rand : new Random();
	        return MathHelper.getInt(rand, 2, 5);
	    }
}
