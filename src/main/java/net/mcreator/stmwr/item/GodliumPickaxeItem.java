
package net.mcreator.stmwr.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.stmwr.init.StmwrModItems;

public class GodliumPickaxeItem extends PickaxeItem {
	public GodliumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4000;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 50;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(StmwrModItems.GODLIUM_INGOT.get()));
			}
		}, 1, -1f, new Item.Properties());
	}
}
