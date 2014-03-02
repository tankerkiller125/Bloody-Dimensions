package tankerkiller125.bloodydimensions.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import tankerkiller125.bloodydimensions.BD_Main;

public class BloodyPick extends ItemPickaxe
{
	public BloodyPick(Item.ToolMaterial toolMat)
	{
		super(toolMat);
		
		setUnlocalizedName("bloodyPick");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":bloodyPick");
	}
}