
package net.mcreator.stmwr.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.stmwr.procedures.BurnProcedure;
import net.mcreator.stmwr.init.StmwrModItems;

public class BlazedShovelItem extends ShovelItem {
	public BlazedShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(StmwrModItems.BLAZED_INGOT.get()));
			}
		}, 1, -2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		BurnProcedure.execute(entity);
		return retval;
	}
}
