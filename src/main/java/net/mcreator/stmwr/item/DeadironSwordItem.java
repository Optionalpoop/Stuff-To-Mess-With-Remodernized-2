
package net.mcreator.stmwr.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.stmwr.init.StmwrModItems;

public class DeadironSwordItem extends SwordItem {
	public DeadironSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 35f;
			}

			public float getAttackDamageBonus() {
				return 28f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 80;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(StmwrModItems.DEADIRON_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
