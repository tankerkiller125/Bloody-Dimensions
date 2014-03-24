package tankerkiller125.bloodydimensions.core;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class BD_Recipes
{
	BD_Items i = new BD_Items();
	BD_Blocks b = new BD_Blocks();
	public void addRecipes()
	{
		addToolRecipes(i.bloodyDust, Items.stick, i.bloodyPick, i.bloodySpade, i.bloodyAxe, i.bloodySword, i.bloodyHoe);
		addToolRecipes(i.creeperBlood, Items.stick, i.creeperPick, i.creeperSpade, i.creeperAxe, i.creeperSword, i.creeperHoe);
	}
	
	private static void addToolRecipes(Item mat, Item stick, Item pick, Item spade, Item axe, Item sword, Item hoe)
	{
		GameRegistry.addRecipe(new ItemStack(pick, 1), "XXX", " Y ", " Y ", 'X', mat, 'Y', stick);
		GameRegistry.addRecipe(new ItemStack(spade, 1), "X", "Y", "Y", 'X', mat, 'Y', stick);
		GameRegistry.addRecipe(new ItemStack(axe, 1), "XX ", "XY ", " Y ", 'X', mat, 'Y', stick); //Axe head on the left
		GameRegistry.addRecipe(new ItemStack(axe, 1), " XX", " YX", " Y ", 'X', mat, 'Y', stick); //Axe  head onthe right
		GameRegistry.addRecipe(new ItemStack(sword, 1), "X", "X", "Y", 'X', mat, 'Y', stick);
		GameRegistry.addRecipe(new ItemStack(hoe, 1), "XX", " Y ", " Y ", 'X', mat, 'Y', stick);
	}
	
	private static void addArmorRecipes(Item mat, Item helmet, Item chest, Item pants, Item shoes)
	{
		GameRegistry.addRecipe(new ItemStack(helmet, 1), "XXX", "X X", 'X', mat);
		GameRegistry.addRecipe(new ItemStack(chest, 1), "X X", "XXX", "XXX", 'X', mat);
		GameRegistry.addRecipe(new ItemStack(pants, 1), "XXX", "X X", "X X", 'X', mat);
		GameRegistry.addRecipe(new ItemStack(shoes, 1), "X X", "X X", 'X', mat);
	}
}
