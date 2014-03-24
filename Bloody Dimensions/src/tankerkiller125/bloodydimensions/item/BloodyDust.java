package tankerkiller125.bloodydimensions.item;

import net.minecraft.item.Item;
import tankerkiller125.bloodydimensions.BD_Main;

public class BloodyDust extends Item 
{
	public BloodyDust() 
	{
		super();
		setUnlocalizedName("bloodyDust");
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":bloodyDust");
	}
}
