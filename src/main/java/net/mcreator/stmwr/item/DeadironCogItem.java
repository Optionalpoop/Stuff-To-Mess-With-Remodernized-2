
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DeadironCogItem extends Item {
	public DeadironCogItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
