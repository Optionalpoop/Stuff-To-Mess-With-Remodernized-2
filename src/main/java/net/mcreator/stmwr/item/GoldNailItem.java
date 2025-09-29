
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldNailItem extends Item {
	public GoldNailItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
