
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MREItem extends Item {
	public MREItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(5f).alwaysEat().meat().build()));
	}
}
