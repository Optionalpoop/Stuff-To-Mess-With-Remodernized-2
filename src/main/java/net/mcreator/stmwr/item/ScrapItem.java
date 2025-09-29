
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScrapItem extends Item {
	public ScrapItem() {
		super(new Item.Properties().stacksTo(48).rarity(Rarity.COMMON));
	}
}
