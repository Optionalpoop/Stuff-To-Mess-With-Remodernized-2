
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TuskItem extends Item {
	public TuskItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
