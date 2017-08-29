package YZEROgame.tutorialmod.init.blocks;

import java.util.Random;

import YZEROgame.tutorialmod.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class CustomLight extends Block
{
	public CustomLight(String name, float hardness, float resistance) 
	{
		super(Material.GLASS);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setLightLevel(1.0F);
		blockSoundType.getBreakSound();
		setSoundType(blockSoundType.GLASS);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ItemInit.elder_prismarine_crystal;
	}
	@Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return 1 + random.nextInt(2);
    }
}
