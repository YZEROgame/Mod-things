package YZEROgame.tutorialmod.init;

import YZEROgame.tutorialmod.Reference;
import YZEROgame.tutorialmod.init.blocks.CustomGlass;
import YZEROgame.tutorialmod.init.blocks.ElderLantern;
import YZEROgame.tutorialmod.init.blocks.ElderPris;
import YZEROgame.tutorialmod.init.blocks.FlamiumOre;
import YZEROgame.tutorialmod.init.blocks.GoldCauldron;
import YZEROgame.tutorialmod.init.blocks.OnyxBlock;
import YZEROgame.tutorialmod.init.blocks.SugarBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static Block golden_cauldron;
	public static Block flamium_ore;
	public static Block elder_prismarine_rough;
	public static Block elder_prismarine_bricks;
	public static Block elder_sea_lantern;
	public static Block elder_dark_prismarine;
	public static Block sugarcube;
	public static Block caramel;
	public static Block onyx_ore;
	
	public static void init() 
	{
		golden_cauldron = new GoldCauldron("golden_cauldron", 2.0F, 4.0F, 2);
		flamium_ore = new FlamiumOre("flamium_ore", 2.0F, 4.0F, 2);
		elder_prismarine_rough = new ElderPris("elder_prismarine_rough", 1.5F, 4.0F, 0);
		elder_prismarine_bricks = new ElderPris("elder_prismarine_bricks", 1.5F, 4.0F, 0);
		elder_sea_lantern = new ElderLantern("elder_sea_lantern", 1.0F, 4.0F, 0);
		elder_dark_prismarine = new ElderPris("elder_dark_prismarine", 1.5F, 4.0F, 0);
		sugarcube = new SugarBlock("sugarcube", 0.5F, 1.0F, 0);
		caramel = new CustomGlass("caramel", 2.0F, 5.0F);
		onyx_ore = new OnyxBlock("onyx_ore", 3.0F, 2);
		
	}
	public static void register()
	{
		registerBlock(golden_cauldron);
		registerBlock(flamium_ore);
		registerBlock(elder_prismarine_rough);
		registerBlock(elder_prismarine_bricks);
		registerBlock(elder_sea_lantern);
		registerBlock(elder_dark_prismarine);
		registerBlock(sugarcube);
		registerBlock(caramel);
		registerBlock(onyx_ore);
		
	}
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(CreativeTabs.BREWING);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(golden_cauldron);
		registerRender(flamium_ore);
		registerRender(elder_prismarine_rough);
		registerRender(elder_prismarine_bricks);
		registerRender(elder_sea_lantern);
		registerRender(elder_dark_prismarine);
		registerRender(sugarcube);
		registerRender(caramel);
		registerRender(onyx_ore);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation
	    (Reference.MODID + ":" 
		+ block.getUnlocalizedName().substring(5)));
	}
}
