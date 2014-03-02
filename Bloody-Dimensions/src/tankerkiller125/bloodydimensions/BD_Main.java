package tankerkiller125.bloodydimensions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import tankerkiller125.bloodydimensions.core.BD_Blocks;
import tankerkiller125.bloodydimensions.core.BD_Config;
import tankerkiller125.bloodydimensions.core.BD_Items;
import tankerkiller125.bloodydimensions.core.BD_Registry;
import tankerkiller125.bloodydimensions.core.proxy.BD_ServerProxy;
import tankerkiller125.bloodydimensions.enums.BD_EnumMaterials;
import tankerkiller125.bloodydimensions.manager.OreManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod
(
		modid = BD_Main.BD_Info.modid,
		name = BD_Main.BD_Info.name,
		version = BD_Main.BD_Info.version
)

/**
 * 
 * @author tankerkiller125 (Project Leader, Coder)
 * @author bl4ckscor3 (Coder, Texturer)
 * @author Tankkiller125 (Texturer)
 *
 */
public class BD_Main
{
	@Instance(BD_Info.modid)
	public static BD_Main instance;

	@SidedProxy
	(
			clientSide = "tankerkiller125.bloodydimensions.core.proxy.BD_ClientProxy",
			serverSide = "tankerkiller125.bloodydimensions.core.proxy.BD_ServerProxy"
	)
	public static BD_ServerProxy proxy;
	
	//Generating Ores
	public static OreManager oremanager = new OreManager();
	
	//Configuration
	public static Configuration config;
	
	//Creative Tab
	public static CreativeTabs bd_tab = new CreativeTabs("bd_tab")
	{
		@Override
		public Item getTabIconItem() 
		{
			return BD_Items.bloodyWand;
		}
	};
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{		
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		BD_Config.init(event);
		
		config.save();

		/*Block/Item Init*/
		BD_EnumMaterials.toolMats();
		BD_Blocks.initializeBlocks();
		BD_Items.initializeItems();
		BD_Items.initializeTools();
	
		BD_Registry.preInit();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		BD_Registry.init();
	}
	
	public class BD_Info
	{
		/*Random Strings*/
		public static final String forgeVersion = "1034";
		public static final String mcVersion = "1.7.2";
		
		/*Strings useful for Forge*/
		public static final String modid = "bloodydimensions";
		public static final String name = "Bloody Dimensions";
		public static final String version = "0.1-" + mcVersion + "-" + forgeVersion;
	}
}
