package net.mcreator.stmwr.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.init.StmwrModEntities;

public class ForceOfDreamsEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = StmwrModEntities.GHOST.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
		if (Math.random() < 0.7) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (Math.random() < 0.4) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.ambient")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.ambient")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
		if (Math.random() < 0.7) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("BEHIND YOU!"), false);
		}
		if (Math.random() < 0.3) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"AAAAWDOJAOWJDIUERHGIOHAIERUHGFIOAHWIEUHFLKDUSAHFIOLAWUHEFLKUSDAHLIFWEUKLFASDIFUHELKAUJSDHFIUWEHFKJADHJIHWKDJHFISUHEKJFHWIUEHFLKJSDHIUEHKJHFWIUHSKEJUHLFKJSDHLFIWEJFHSEHIFKSJEHFLIGIUWEHFIJHSDJKHFIWUEHKFSHUEHFJKSDJHGFLAHUFIOWAEHFLAIKUHEULIFHLKWUHFKLSAJHLFHAIWUHEFLKJHLKASJDHLKFHASDHJFLAKSJDHFLAKSJHDFLKASJDHFLKAJSDHFLKAJHSDFLKHAJSKDLFHAWIEUOYROIUQYWREOIUYHMNBMN,BVMN,B,MNBZXM,NCBVM,NBZXCBV,MZXNBCV,HAEJRFUIOAYWEGHFAERKJGFAOIW3GHFOIAWHEFJLKYHGBKARJYGWEIKUYFGHLAWE"),
						false);
		}
	}
}
