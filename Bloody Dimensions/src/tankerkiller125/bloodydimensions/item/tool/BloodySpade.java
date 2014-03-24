package tankerkiller125.bloodydimensions.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import tankerkiller125.bloodydimensions.BD_Main;

public class BloodySpade extends ItemSpade
{
	public BloodySpade(Item.ToolMaterial toolMat)
	{
		super(toolMat);
		
		setUnlocalizedName("bloodySpade");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":bloodySpade");
	}
}