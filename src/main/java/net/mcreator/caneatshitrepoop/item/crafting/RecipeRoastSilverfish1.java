
package net.mcreator.caneatshitrepoop.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.caneatshitrepoop.item.ItemRoastSilverfish;
import net.mcreator.caneatshitrepoop.item.ItemFreshSilverfish;
import net.mcreator.caneatshitrepoop.ElementsCanEatShitRepoop;

@ElementsCanEatShitRepoop.ModElement.Tag
public class RecipeRoastSilverfish1 extends ElementsCanEatShitRepoop.ModElement {
	public RecipeRoastSilverfish1(ElementsCanEatShitRepoop instance) {
		super(instance, 15);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemFreshSilverfish.block, (int) (1)), new ItemStack(ItemRoastSilverfish.block, (int) (1)), 5F);
	}
}
