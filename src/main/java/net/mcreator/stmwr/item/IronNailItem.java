
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronNailItem extends Item {
	public IronNailItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
