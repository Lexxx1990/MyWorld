
package net.mcreator.mip.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mip.itemgroup.RPmiscItemGroup;
import net.mcreator.mip.MipModElements;

@MipModElements.ModElement.Tag
public class DvoinoiemalienkoiekoliesoItem extends MipModElements.ModElement {
	@ObjectHolder("mip:dvoinoiemalienkoiekolieso")
	public static final Item block = null;

	public DvoinoiemalienkoiekoliesoItem(MipModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RPmiscItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("dvoinoiemalienkoiekolieso");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
