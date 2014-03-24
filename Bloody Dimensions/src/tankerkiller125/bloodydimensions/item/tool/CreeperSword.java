package tankerkiller125.bloodydimensions.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import tankerkiller125.bloodydimensions.BD_Main;

public class CreeperSword extends ItemSword 
{
	public CreeperSword(Item.ToolMaterial toolMat)
	{
		super(toolMat);
		setUnlocalizedName("creeperSword");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":creeperSword");
	}
}
