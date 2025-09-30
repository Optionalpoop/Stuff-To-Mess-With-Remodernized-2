
package net.mcreator.stmwr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.stmwr.procedures.TotemOfRegenerationIIRightclickedProcedure;

public class TotemOfRegenerationIIItem extends Item {
	public TotemOfRegenerationIIItem() {
		super(new Item.Properties().durability(30).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		TotemOfRegenerationIIRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
