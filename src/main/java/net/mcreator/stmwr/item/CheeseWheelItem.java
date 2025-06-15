
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CheeseWheelItem extends Item {
	public CheeseWheelItem() {
		super(new Item.Properties().stacksTo(8).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(10f).build()));
	}
}
