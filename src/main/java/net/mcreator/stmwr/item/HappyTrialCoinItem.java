
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HappyTrialCoinItem extends Item {
	public HappyTrialCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
