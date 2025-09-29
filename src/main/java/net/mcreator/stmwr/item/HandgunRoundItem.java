
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HandgunRoundItem extends Item {
	public HandgunRoundItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
