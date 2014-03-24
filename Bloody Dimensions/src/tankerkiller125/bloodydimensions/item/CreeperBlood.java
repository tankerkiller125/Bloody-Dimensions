package tankerkiller125.bloodydimensions.item;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;

public class CreeperBlood extends Item {
	
	public CreeperBlood()
	{
		super();
		setUnlocalizedName("creeperblood");
		maxStackSize = 1;
		setMaxDamage(10);
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":creeperblood");
	}
}
