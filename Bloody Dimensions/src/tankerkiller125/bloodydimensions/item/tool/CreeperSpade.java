package tankerkiller125.bloodydimensions.item.tool;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class CreeperSpade extends ItemSpade {

	public CreeperSpade(Item.ToolMaterial toolMat)
	{
		super(toolMat);
		
		setUnlocalizedName("creeperSpade");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":creeperSpade");
	}
}
