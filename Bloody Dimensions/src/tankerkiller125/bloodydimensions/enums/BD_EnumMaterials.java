package tankerkiller125.bloodydimensions.enums;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class BD_EnumMaterials
{
	public static Item.ToolMaterial bloody;
	public static Item.ToolMaterial creeper;
	public static Item.ToolMaterial zombie;
	public static Item.ToolMaterial skeleton;
	
	public static void toolMats()
	{
		bloody = EnumHelper.addToolMaterial("bloody", 2, 200, 5.0F, 1.5F, 10); //Exactly between stone and iron tools
		creeper = EnumHelper.addToolMaterial("creeper", 2, 250, 5.5F, 2.0F, 15);
		zombie = EnumHelper.addToolMaterial("zombie", 2, 300, 6.0F, 2.5F, 20);
		skeleton = EnumHelper.addToolMaterial("skeleton", 2, 350, 6.5F, 3.0F, 25);
	}
}
