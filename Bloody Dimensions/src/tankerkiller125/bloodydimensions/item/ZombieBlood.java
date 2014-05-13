package tankerkiller125.bloodydimensions.item;

import tankerkiller125.bloodydimensions.BD_Main;
import net.minecraft.item.Item;

public class ZombieBlood extends Item {

	public ZombieBlood()
	{
		super();
		setUnlocalizedName("zombieblood");
		maxStackSize = 1;
		setMaxDamage(10);
		setCreativeTab(BD_Main.bd_tab);
		setTextureName(BD_Main.BD_Info.modid + ":zombieblood");
	}
}
