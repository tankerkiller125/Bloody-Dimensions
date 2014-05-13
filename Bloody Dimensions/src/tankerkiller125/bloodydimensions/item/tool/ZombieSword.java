package tankerkiller125.bloodydimensions.item.tool;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ZombieSword extends ItemSword {

	public ZombieSword(Item.ToolMaterial toolMat)
	{
		super(toolMat);

		setUnlocalizedName("zombiesword");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":zombiesword");
	}
}
