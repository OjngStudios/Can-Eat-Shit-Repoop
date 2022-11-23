
package net.mcreator.caneatshitrepoop.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.caneatshitrepoop.creativetab.TabCanEatShitRepoop;
import net.mcreator.caneatshitrepoop.ElementsCanEatShitRepoop;

@ElementsCanEatShitRepoop.ModElement.Tag
public class BlockShitingotblock extends ElementsCanEatShitRepoop.ModElement {
	@GameRegistry.ObjectHolder("caneatshitrepoop:shitingotblock")
	public static final Block block = null;
	public BlockShitingotblock(ElementsCanEatShitRepoop instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("shitingotblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("caneatshitrepoop:shitingotblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("shitingotblock");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 1);
			setHardness(2.2F);
			setResistance(18F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabCanEatShitRepoop.tab);
		}
	}
}
