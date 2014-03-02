package tankerkiller125.bloodydimensions.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import tankerkiller125.bloodydimensions.BD_Main;

public class BloodyHoe extends ItemHoe
{
	public BloodyHoe(Item.ToolMaterial toolMat)
	{
		super(toolMat);
		
		setUnlocalizedName("bloodyHoe");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":bloodyHoe");
	}
}