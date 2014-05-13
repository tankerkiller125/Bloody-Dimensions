package tankerkiller125.bloodydimensions.item.tool;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ZombiePick extends ItemPickaxe {

	public ZombiePick(Item.ToolMaterial toolMat)
	{
		super(toolMat);

		setUnlocalizedName("zombiepickaxe");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":zombiepickaxe");
	}
}
