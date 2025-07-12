
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HeartstoneItem extends Item {
	public HeartstoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
