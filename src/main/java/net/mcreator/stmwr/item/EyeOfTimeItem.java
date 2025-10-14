
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EyeOfTimeItem extends Item {
	public EyeOfTimeItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}
}
