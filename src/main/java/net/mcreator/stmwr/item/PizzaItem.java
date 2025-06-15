
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PizzaItem extends Item {
	public PizzaItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(20).saturationMod(10f).build()));
	}
}
