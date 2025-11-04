
package net.mcreator.stmwr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.stmwr.procedures.TotemOfJumpBoostIIIRightClickedProcedure;

public class TotemOfJumpBoostIIIItem extends Item {
	public TotemOfJumpBoostIIIItem() {
		super(new Item.Properties().durability(25).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		TotemOfJumpBoostIIIRightClickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
