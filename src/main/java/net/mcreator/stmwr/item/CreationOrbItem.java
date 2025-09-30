
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CreationOrbItem extends Item {
	public CreationOrbItem() {
		super(new Item.Properties().durability(15).rarity(Rarity.RARE));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}
