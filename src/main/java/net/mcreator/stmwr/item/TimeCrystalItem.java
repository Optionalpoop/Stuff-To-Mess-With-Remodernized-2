
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TimeCrystalItem extends Item {
	public TimeCrystalItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
