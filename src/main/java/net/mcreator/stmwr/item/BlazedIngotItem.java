
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlazedIngotItem extends Item {
	public BlazedIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
