package tankerkiller125.bloodydimensions.item.tool;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ZombieSpade extends ItemSpade {

	public ZombieSpade(Item.ToolMaterial toolMat)
	{
		super(toolMat);

		setUnlocalizedName("zombiespade");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":zombiespade");
	}
}
