
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlueprintPowercellItem extends Item {
	public BlueprintPowercellItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
