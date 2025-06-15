
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TotemBaseItem extends Item {
	public TotemBaseItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
