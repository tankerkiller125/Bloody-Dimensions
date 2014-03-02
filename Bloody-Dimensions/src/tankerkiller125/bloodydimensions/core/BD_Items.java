package tankerkiller125.bloodydimensions.core;

import tankerkiller125.bloodydimensions.enums.BD_EnumMaterials;
import tankerkiller125.bloodydimensions.item.BloodyDust;
import tankerkiller125.bloodydimensions.item.BloodyWand;
import tankerkiller125.bloodydimensions.item.tool.BloodyAxe;
import tankerkiller125.bloodydimensions.item.tool.BloodyHoe;
import tankerkiller125.bloodydimensions.item.tool.BloodyPick;
import tankerkiller125.bloodydimensions.item.tool.BloodySpade;
import tankerkiller125.bloodydimensions.item.tool.BloodySword;
import net.minecraft.item.Item;

public class BD_Items extends BD_Blocks
{
	/*Items get created below here*/
	public static Item bloodyDust;
	public static int bloodyDustID = 23456;
	
	public static Item bloodyWand;
	public static int bloodyWandID = 23457;
	
	/*Tools get created below here*/
	public static Item bloodySword;
	public static int bloodySwordID = 23556;
	
	public static Item bloodyPick;
	public static int bloodyPickID = 23557;
	
	public static Item bloodySpade;
	public static int bloodySpadeID = 23558;
	
	public static Item bloodyAxe;
	public static int bloodyAxeID = 23559;
	
	public static Item bloodyHoe;
	public static int bloodyHoeID = 23560;
	
	public static void initializeItems()
	{
		bloodyDust = new BloodyDust();
		bloodyWand = new BloodyWand();
	}
	
	public static void initializeTools()
	{
		bloodyPick = new BloodyPick(BD_EnumMaterials.bloody);
		bloodySpade = new BloodySpade(BD_EnumMaterials.bloody);
		bloodyAxe = new BloodyAxe(BD_EnumMaterials.bloody);
		bloodySword = new BloodySword(BD_EnumMaterials.bloody);
		bloodyHoe = new BloodyHoe(BD_EnumMaterials.bloody);
	}
}