package tankerkiller125.bloodydimensions.item.tool;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ZombieAxe extends ItemAxe {

	public ZombieAxe(Item.ToolMaterial toolMat)
	{
		super(toolMat);

		setUnlocalizedName("zombieAxe");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":zombieAxe");
	}
}
