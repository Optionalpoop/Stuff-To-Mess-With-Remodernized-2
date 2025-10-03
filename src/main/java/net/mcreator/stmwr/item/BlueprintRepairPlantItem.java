
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlueprintRepairPlantItem extends Item {
	public BlueprintRepairPlantItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
