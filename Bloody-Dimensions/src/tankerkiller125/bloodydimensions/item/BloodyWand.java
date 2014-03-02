package tankerkiller125.bloodydimensions.item;

import net.minecraft.item.Item;
import tankerkiller125.bloodydimensions.BD_Main;

public class BloodyWand extends Item
{
	public BloodyWand()
	{
		super();
		setUnlocalizedName("bloodyWand");
		maxStackSize = 1;
		setMaxDamage(10);
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":bloodyWand");
	}
}