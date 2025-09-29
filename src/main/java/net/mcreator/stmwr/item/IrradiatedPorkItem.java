
package net.mcreator.stmwr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.stmwr.procedures.IrradiatedPorkPlayerFinishesUsingItemProcedure;

public class IrradiatedPorkItem extends Item {
	public IrradiatedPorkItem() {
		super(new Item.Properties().stacksTo(61).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.6f).meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		IrradiatedPorkPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
