package tankerkiller125.bloodydimensions.block.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBloodyStone extends ItemBlock
{
	public ItemBloodyStone(Block par1) 
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
			name = "bloodyStone";
			break;
		
		case 1:
			name = "bloodyCobble";
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
