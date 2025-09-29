
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.stmwr.procedures.PoisonDartLivingEntityIsHitWithItemProcedure;

public class PoisonDartItem extends Item {
	public PoisonDartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PoisonDartLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}
}
