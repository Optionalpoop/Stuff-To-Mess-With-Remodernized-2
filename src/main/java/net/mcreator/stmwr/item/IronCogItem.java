
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronCogItem extends Item {
	public IronCogItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
