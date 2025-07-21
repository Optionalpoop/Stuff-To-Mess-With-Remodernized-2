
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LightningInABottleItem extends Item {
	public LightningInABottleItem() {
		super(new Item.Properties().stacksTo(16).fireResistant().rarity(Rarity.RARE));
	}
}
