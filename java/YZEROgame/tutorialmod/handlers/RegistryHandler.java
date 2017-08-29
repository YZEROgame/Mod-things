package YZEROgame.tutorialmod.handlers;

import YZEROgame.tutorialmod.gen.FlamiumOreGen;
import YZEROgame.tutorialmod.init.BlockInit;
import YZEROgame.tutorialmod.init.ItemInit;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler 
{
	public static void Client()
	{
		ItemInit.register();
		BlockInit.registerRenders();
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
	}
	
	public static void Common()
	{
		ItemInit.init();
		BlockInit.init();
		BlockInit.register();
		GameRegistry.registerWorldGenerator(new FlamiumOreGen(), 0);
	}
}
