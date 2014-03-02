package tankerkiller125.bloodydimensions.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import tankerkiller125.bloodydimensions.BD_Main;

public class BloodyAxe extends ItemAxe
{
	public BloodyAxe(Item.ToolMaterial toolMat)
	{
		super(toolMat);

		setUnlocalizedName("bloodyAxe");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":bloodyAxe");
	}
}