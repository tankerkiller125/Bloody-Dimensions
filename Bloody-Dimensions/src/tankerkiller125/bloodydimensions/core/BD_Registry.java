package tankerkiller125.bloodydimensions.core;

import net.minecraftforge.common.MinecraftForge;
import tankerkiller125.bloodydimensions.BD_Main;
import tankerkiller125.bloodydimensions.block.itemblock.ItemBloodyOre;
import tankerkiller125.bloodydimensions.block.itemblock.ItemBloodyStone;
import tankerkiller125.bloodydimensions.util.BD_UpdateChecker;
import cpw.mods.fml.common.registry.GameRegistry;

public class BD_Registry extends BD_Items
{
	public static void preInit()
	{
		blocks();
		items();
	}
	
	public static void init()
	{
		miscReg();
	}
	
	public static void miscReg()
	{
		GameRegistry.registerWorldGenerator(BD_Main.oremanager, 0);
		MinecraftForge.EVENT_BUS.register(new BD_UpdateChecker.UpdateEvent());
	}
	
	public static void blocks()
	{
		GameRegistry.registerBlock(bloodyStone, ItemBloodyStone.class, "bloodyStone");
		GameRegistry.registerBlock(bloodyDirt, "bloodDirt");
		GameRegistry.registerBlock(bloodyOre, ItemBloodyOre.class, "bloodyOre");
	}
	
	public static void items()
	{
		GameRegistry.registerItem(bloodyDust, "bloodyDust");
		GameRegistry.registerItem(bloodyWand, "bloodyWand");
		GameRegistry.registerItem(bloodyPick, "bloodyPick");
		GameRegistry.registerItem(bloodySpade, "bloodySpade");
		GameRegistry.registerItem(bloodyAxe, "bloodyAxe");
		GameRegistry.registerItem(bloodySword, "bloodySword");
		GameRegistry.registerItem(bloodyHoe, "bloodyHoe");
	}
}