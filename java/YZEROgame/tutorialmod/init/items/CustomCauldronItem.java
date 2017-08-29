package YZEROgame.tutorialmod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomCauldronItem extends Item 
{
	public CustomCauldronItem(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BREWING);
	}
}
