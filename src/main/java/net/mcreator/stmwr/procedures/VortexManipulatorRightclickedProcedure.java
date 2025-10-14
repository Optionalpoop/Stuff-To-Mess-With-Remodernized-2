package net.mcreator.stmwr.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

public class VortexManipulatorRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("warpbrickx") != 0 && itemstack.getOrCreateTag().getDouble("warpbricky") != 0 && itemstack.getOrCreateTag().getDouble("warpbrickz") != 0) {
			if ((itemstack.getOrCreateTag().getString("warpbrickdimension")).equals("" + entity.level().dimension())) {
				{
					Entity _ent = entity;
					_ent.teleportTo((itemstack.getOrCreateTag().getDouble("warpbrickx")), (itemstack.getOrCreateTag().getDouble("warpbricky") + 1), (itemstack.getOrCreateTag().getDouble("warpbrickz")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((itemstack.getOrCreateTag().getDouble("warpbrickx")), (itemstack.getOrCreateTag().getDouble("warpbricky") + 1), (itemstack.getOrCreateTag().getDouble("warpbrickz")), _ent.getYRot(),
								_ent.getXRot());
				}
				{
					ItemStack _ist = itemstack;
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Quick and dirty time travel..."), true);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 3, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("The linked Warp Brick is not in this dimension!"), true);
			}
		}
	}
}
