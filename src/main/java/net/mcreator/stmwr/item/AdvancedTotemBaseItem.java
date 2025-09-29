
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdvancedTotemBaseItem extends Item {
	public AdvancedTotemBaseItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}
}
