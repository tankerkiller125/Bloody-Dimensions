package tankerkiller125.bloodydimensions.core;

import tankerkiller125.bloodydimensions.enums.BD_EnumMaterials;
import tankerkiller125.bloodydimensions.item.BloodyDust;
import tankerkiller125.bloodydimensions.item.BloodyWand;
import tankerkiller125.bloodydimensions.item.CreeperBlood;
import tankerkiller125.bloodydimensions.item.ZombieBlood;
import tankerkiller125.bloodydimensions.item.tool.BloodyAxe;
import tankerkiller125.bloodydimensions.item.tool.BloodyHoe;
import tankerkiller125.bloodydimensions.item.tool.BloodyPick;
import tankerkiller125.bloodydimensions.item.tool.BloodySpade;
import tankerkiller125.bloodydimensions.item.tool.BloodySword;
import tankerkiller125.bloodydimensions.item.tool.CreeperAxe;
import tankerkiller125.bloodydimensions.item.tool.CreeperHoe;
import tankerkiller125.bloodydimensions.item.tool.CreeperPick;
import tankerkiller125.bloodydimensions.item.tool.CreeperSpade;
import tankerkiller125.bloodydimensions.item.tool.CreeperSword;
import tankerkiller125.bloodydimensions.item.tool.ZombieAxe;
import tankerkiller125.bloodydimensions.item.tool.ZombieHoe;
import tankerkiller125.bloodydimensions.item.tool.ZombiePick;
import tankerkiller125.bloodydimensions.item.tool.ZombieSpade;
import tankerkiller125.bloodydimensions.item.tool.ZombieSword;
import net.minecraft.item.Item;

public class BD_Items extends BD_Blocks
{
	/*Items get created below here*/
	public static Item bloodyDust;
	public static Item bloodyWand;
	public static Item creeperBlood;
	public static Item zombieBlood;
	public static Item giantBlood;
	/*Tools get created below here*/
	public static Item bloodySword;
	public static Item bloodyPick;
	public static Item bloodySpade;	
	public static Item bloodyAxe;
	public static Item bloodyHoe;
	public static Item creeperSword;
	public static Item creeperPick;
	public static Item creeperSpade;
	public static Item creeperAxe;
	public static Item creeperHoe;
	public static Item zombieSword;
	public static Item zombiePick;
	public static Item zombieSpade;
	public static Item zombieAxe;
	public static Item zombieHoe;
	public static Item giantSword;
	public static Item giantPick;
	public static Item giantSpade;
	public static Item giantAxe;
	public static Item giantHoe;

	//mkay
	public static void initializeItems()
	{
		bloodyDust = new BloodyDust();
		bloodyWand = new BloodyWand();
		creeperBlood = new CreeperBlood();
		zombieBlood = new ZombieBlood();
	}
	
	public static void initializeTools()
	{
		bloodyPick = new BloodyPick(BD_EnumMaterials.bloody);
		bloodySpade = new BloodySpade(BD_EnumMaterials.bloody);
		bloodyAxe = new BloodyAxe(BD_EnumMaterials.bloody);
		bloodySword = new BloodySword(BD_EnumMaterials.bloody);
		bloodyHoe = new BloodyHoe(BD_EnumMaterials.bloody);
		creeperSword = new CreeperSword(BD_EnumMaterials.creeper);
		creeperPick = new CreeperPick(BD_EnumMaterials.creeper);
		creeperSpade = new CreeperSpade(BD_EnumMaterials.creeper);
		creeperHoe = new CreeperHoe(BD_EnumMaterials.creeper);
		creeperAxe = new CreeperAxe(BD_EnumMaterials.creeper);
		zombieSword = new ZombieSword(BD_EnumMaterials.zombie);
		zombiePick = new ZombiePick(BD_EnumMaterials.zombie);
		zombieSpade = new ZombieSpade(BD_EnumMaterials.zombie);
		zombieAxe = new ZombieAxe(BD_EnumMaterials.zombie);
		zombieHoe = new ZombieHoe(BD_EnumMaterials.zombie);
	}
}