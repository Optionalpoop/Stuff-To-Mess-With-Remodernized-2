
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AlmightyTrialCoinItem extends Item {
	public AlmightyTrialCoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
