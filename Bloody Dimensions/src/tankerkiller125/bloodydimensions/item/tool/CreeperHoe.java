package tankerkiller125.bloodydimensions.item.tool;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class CreeperHoe extends ItemHoe {

	public CreeperHoe(Item.ToolMaterial toolMat)
	{
		super(toolMat);
		
		setUnlocalizedName("creeperHoe");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":creeperHoe");
	}
}
