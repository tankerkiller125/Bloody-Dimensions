package tankerkiller125.bloodydimensions.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tankerkiller125.bloodydimensions.BD_Main;

public class BloodyDirt extends Block
{
	public BloodyDirt()
	{
		super(Material.ground);
		setBlockName("bloodyDirt");
		setCreativeTab(BD_Main.bd_tab);
		setStepSound(soundTypeGravel);
		setHardness(0.49865F);
		setBlockTextureName(BD_Main.BD_Info.modid + ":bloodyDirt");
	}
}