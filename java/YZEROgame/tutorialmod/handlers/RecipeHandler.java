package YZEROgame.tutorialmod.handlers;

import YZEROgame.tutorialmod.init.BlockInit;
import YZEROgame.tutorialmod.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerCrafting() 
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("zeroinc:golden_cauldron"), new ResourceLocation("tutorial_blocks"), new ItemStack(BlockInit.golden_cauldron), new Object[]{"G G","G G","GGG",'G',Items.GOLD_INGOT});
		GameRegistry.addShapedRecipe(new ResourceLocation("zeroinc:elder_prismarine_rough"), new ResourceLocation("tutorial_blocks"), new ItemStack(BlockInit.elder_prismarine_bricks), new Object[]{"SSS","SSS","SSS",'S',ItemInit.elder_prismarine_shard});
		GameRegistry.addShapedRecipe(new ResourceLocation("zeroinc:elder_dark_prismarine"), new ResourceLocation("tutorial_blocks"), new ItemStack(BlockInit.elder_dark_prismarine), new Object[]{"SSS","SIS","SSS",'S',ItemInit.elder_prismarine_shard, 'I', new ItemStack(Items.DYE, 1, 0)});
		GameRegistry.addShapedRecipe(new ResourceLocation("zeroinc:elder_prismarine_rough"), new ResourceLocation("tutorial_blocks"), new ItemStack(BlockInit.elder_sea_lantern), new Object[]{"SCS","CCC","SCS",'S',ItemInit.elder_prismarine_shard,'C', ItemInit.elder_prismarine_crystal});
		GameRegistry.addShapedRecipe(new ResourceLocation("zeroinc:elder_prismarine_rough"), new ResourceLocation("tutorial_blocks"), new ItemStack(BlockInit.elder_prismarine_rough), new Object[]{"SS ","SS ","   ",'S',ItemInit.elder_prismarine_shard});
	}
	
	public static void registerSmelting()
 {
		GameRegistry.addSmelting(BlockInit.golden_cauldron, new ItemStack(Items.GOLD_NUGGET), 5);
		GameRegistry.addSmelting(BlockInit.flamium_ore, new ItemStack(ItemInit.flamium_gem), 20);
 }
	}
