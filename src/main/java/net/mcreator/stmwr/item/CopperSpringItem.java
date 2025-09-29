
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CopperSpringItem extends Item {
	public CopperSpringItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
