package tankerkiller125.bloodydimensions.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import tankerkiller125.bloodydimensions.BD_Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class BloodyOre extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public BloodyOre()
	{
		super(Material.rock);
		setBlockName("bloodyOre");
		setCreativeTab(BD_Main.bd_tab);
		setStepSound(soundTypeStone);
		setHardness(2.7612F);
		setResistance(2.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg)
	{
		icons = new IIcon[2];

		for(int i = 0; i < icons.length; i++)
		{
			if(i == 0)
			{
				icons[i] = reg.registerIcon(BD_Main.BD_Info.modid + ":bloodyOre");
			}
			if(i == 1)
			{
				icons[i] = reg.registerIcon(BD_Main.BD_Info.modid + ":bloodyOre_End");
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return icons[par2];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, CreativeTabs tab, List list)
	{
		for(int i = 0; i < 2; ++i)
		{
			list.add(new ItemStack(par1, 1, i));
		}
	}

	@Override
	public int damageDropped(int par1)
	{
		return par1;
	}
}
