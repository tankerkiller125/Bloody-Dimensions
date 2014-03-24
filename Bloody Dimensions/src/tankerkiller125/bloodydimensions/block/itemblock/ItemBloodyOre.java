package tankerkiller125.bloodydimensions.block.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBloodyOre extends ItemBlock
{
	public ItemBloodyOre(Block par1) 
	{
		super(par1);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		
		switch(itemstack.getItemDamage())
		{
		case 0:
			name = "bloodyOre";
			break;
		
		case 1:
			name = "bloodyOre_End";
			break;
			
		default:
			name = "thisWillNeverHappen";
		}
		return getUnlocalizedName() + "." + name;
	}
	
	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}
}
