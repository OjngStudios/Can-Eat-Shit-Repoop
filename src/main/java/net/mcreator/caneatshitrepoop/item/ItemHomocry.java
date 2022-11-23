
package net.mcreator.caneatshitrepoop.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.caneatshitrepoop.creativetab.TabCanEatShitRepoop;
import net.mcreator.caneatshitrepoop.ElementsCanEatShitRepoop;

@ElementsCanEatShitRepoop.ModElement.Tag
public class ItemHomocry extends ElementsCanEatShitRepoop.ModElement {
	@GameRegistry.ObjectHolder("caneatshitrepoop:homocry")
	public static final Item block = null;
	public ItemHomocry(ElementsCanEatShitRepoop instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("caneatshitrepoop:homocry", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("homocry", ElementsCanEatShitRepoop.sounds.get(new ResourceLocation("caneatshitrepoop:homo_cry")));
			setUnlocalizedName("homocry");
			setRegistryName("homocry");
			setCreativeTab(TabCanEatShitRepoop.tab);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
