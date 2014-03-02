package tankerkiller125.bloodydimensions.enums;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class BD_EnumMaterials
{
	public static Item.ToolMaterial bloody;
	
	public static void toolMats()
	{
		bloody = EnumHelper.addToolMaterial("bloody", 2, 200, 5.0F, 1.5F, 10); //Exactly between stone and iron tools
	}
}
