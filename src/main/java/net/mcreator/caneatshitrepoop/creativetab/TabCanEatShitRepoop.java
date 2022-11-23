
package net.mcreator.caneatshitrepoop.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.caneatshitrepoop.item.ItemHomocry;
import net.mcreator.caneatshitrepoop.ElementsCanEatShitRepoop;

@ElementsCanEatShitRepoop.ModElement.Tag
public class TabCanEatShitRepoop extends ElementsCanEatShitRepoop.ModElement {
	public TabCanEatShitRepoop(ElementsCanEatShitRepoop instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcaneatshitrepoop") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemHomocry.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
