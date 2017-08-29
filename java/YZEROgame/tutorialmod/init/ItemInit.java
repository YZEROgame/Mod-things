package YZEROgame.tutorialmod.init;

import YZEROgame.tutorialmod.Reference;
import YZEROgame.tutorialmod.init.items.CustomCauldronItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit 
{
	public static Item goldencauldronitem;
	public static Item flamium_gem;
	public static Item elder_prismarine_shard;
	public static Item elder_prismarine_crystal;
	public static Item onyx;
	
	
	public static void init()
	{
	goldencauldronitem = new CustomCauldronItem("goldencauldronitem");
	flamium_gem = new CustomCauldronItem("flamium_gem");
	elder_prismarine_shard = new CustomCauldronItem("elder_prismarine_shard");
	elder_prismarine_crystal = new CustomCauldronItem("elder_prismarine_crystal");
	onyx = new CustomCauldronItem("onyx");
	}
	
	public static void register()
	{
		registerItem(goldencauldronitem);
		registerItem(flamium_gem);
		registerItem(elder_prismarine_shard);
		registerItem(elder_prismarine_crystal);
		registerItem(onyx);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
				new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
