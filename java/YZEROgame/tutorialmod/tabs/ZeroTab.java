package YZEROgame.tutorialmod.tabs;

import YZEROgame.tutorialmod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ZeroTab extends CreativeTabs
{
	public ZeroTab(String label) {	super("zeroinctab");
	this.setBackgroundImageName("zeroinc.png"); }
	public ItemStack getTabIconItem() {return new ItemStack(ItemInit.goldencauldronitem);}
	}