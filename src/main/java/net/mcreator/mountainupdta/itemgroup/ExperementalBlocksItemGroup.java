
package net.mcreator.mountainupdta.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mountainupdta.block.SnowerizerBlock;
import net.mcreator.mountainupdta.NewmountainsModElements;

@NewmountainsModElements.ModElement.Tag
public class ExperementalBlocksItemGroup extends NewmountainsModElements.ModElement {
	public ExperementalBlocksItemGroup(NewmountainsModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabexperemental_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SnowerizerBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
