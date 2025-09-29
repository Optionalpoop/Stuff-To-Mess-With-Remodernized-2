
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronSpringItem extends Item {
	public IronSpringItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
