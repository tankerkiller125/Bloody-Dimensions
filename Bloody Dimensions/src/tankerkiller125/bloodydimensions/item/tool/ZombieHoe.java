package tankerkiller125.bloodydimensions.item.tool;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ZombieHoe extends ItemHoe {

	public ZombieHoe(Item.ToolMaterial toolMat)
	{
		super(toolMat);

		setUnlocalizedName("zombiehoe");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":zombiehoe");
	}
}
