package tankerkiller125.bloodydimensions.core;

import net.minecraft.block.Block;
import tankerkiller125.bloodydimensions.BD_Main;
import tankerkiller125.bloodydimensions.block.BloodyDirt;
import tankerkiller125.bloodydimensions.block.BloodyOre;
import tankerkiller125.bloodydimensions.block.BloodyStone;

public class BD_Blocks extends BD_Main
{
	/*Blocks get created below here*/
	public static Block bloodyStone; //Metadata: 0 = stone | 1 = cobble
	public static Block bloodyDirt; //No Metadata
	public static BloodyOre bloodyOre; //Metdata: 0 = overworld | 1 = end
	
	public static void initializeBlocks()
	{
		bloodyStone = new BloodyStone(/*Material.rock*/);
		bloodyDirt = new BloodyDirt(/*Material.ground*/);
		bloodyOre = new BloodyOre(/*Material.rock*/);
	}
}