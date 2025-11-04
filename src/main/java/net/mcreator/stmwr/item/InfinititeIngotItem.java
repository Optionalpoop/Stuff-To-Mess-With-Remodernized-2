
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class InfinititeIngotItem extends Item {
	public InfinititeIngotItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC));
	}
}
