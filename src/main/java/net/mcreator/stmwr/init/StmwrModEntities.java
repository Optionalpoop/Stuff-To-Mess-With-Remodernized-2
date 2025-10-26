
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.stmwr.entity.UndeadSoulEntity;
import net.mcreator.stmwr.entity.TheTimelessEntity;
import net.mcreator.stmwr.entity.SurvivorEntity;
import net.mcreator.stmwr.entity.SteveCowEntity;
import net.mcreator.stmwr.entity.SoldierEntity;
import net.mcreator.stmwr.entity.SnowshotAmmoEntity;
import net.mcreator.stmwr.entity.SnowShardAmmoEntity;
import net.mcreator.stmwr.entity.PoisonedSkeletonEntity;
import net.mcreator.stmwr.entity.PoisonDartAmmoEntity;
import net.mcreator.stmwr.entity.PikachuEntity;
import net.mcreator.stmwr.entity.LightningWizardEntity;
import net.mcreator.stmwr.entity.LightningCultistEntity;
import net.mcreator.stmwr.entity.LightningBlastAmmoEntity;
import net.mcreator.stmwr.entity.LesserWizardEntity;
import net.mcreator.stmwr.entity.IrradiatedEggAmmoEntity;
import net.mcreator.stmwr.entity.InfectedPigEntity;
import net.mcreator.stmwr.entity.InfectedCowEntity;
import net.mcreator.stmwr.entity.InfectedChickenEntity;
import net.mcreator.stmwr.entity.HordebeastEntity;
import net.mcreator.stmwr.entity.HandgunRoundAmmoEntity;
import net.mcreator.stmwr.entity.GoolingEntity;
import net.mcreator.stmwr.entity.GiantSteveCowEntity;
import net.mcreator.stmwr.entity.FrombieEntity;
import net.mcreator.stmwr.entity.CrusherEntity;
import net.mcreator.stmwr.entity.CorpsepuppetEntity;
import net.mcreator.stmwr.entity.CamperEntity;
import net.mcreator.stmwr.entity.AncientWizardEntity;
import net.mcreator.stmwr.entity.AlligatorEntity;
import net.mcreator.stmwr.StmwrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StmwrModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StmwrMod.MODID);
	public static final RegistryObject<EntityType<AlligatorEntity>> ALLIGATOR = register("alligator",
			EntityType.Builder.<AlligatorEntity>of(AlligatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AlligatorEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<SteveCowEntity>> STEVE_COW = register("steve_cow",
			EntityType.Builder.<SteveCowEntity>of(SteveCowEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SteveCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<PikachuEntity>> PIKACHU = register("pikachu",
			EntityType.Builder.<PikachuEntity>of(PikachuEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(PikachuEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<FrombieEntity>> FROMBIE = register("frombie",
			EntityType.Builder.<FrombieEntity>of(FrombieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrusherEntity>> CRUSHER = register("crusher",
			EntityType.Builder.<CrusherEntity>of(CrusherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrusherEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<HordebeastEntity>> HORDEBEAST = register("hordebeast",
			EntityType.Builder.<HordebeastEntity>of(HordebeastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HordebeastEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LesserWizardEntity>> LESSER_WIZARD = register("lesser_wizard",
			EntityType.Builder.<LesserWizardEntity>of(LesserWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LesserWizardEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SnowshotAmmoEntity>> SNOWSHOT_AMMO = register("snowshot_ammo",
			EntityType.Builder.<SnowshotAmmoEntity>of(SnowshotAmmoEntity::new, MobCategory.MISC).setCustomClientFactory(SnowshotAmmoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SnowShardAmmoEntity>> SNOW_SHARD_AMMO = register("snow_shard_ammo",
			EntityType.Builder.<SnowShardAmmoEntity>of(SnowShardAmmoEntity::new, MobCategory.MISC).setCustomClientFactory(SnowShardAmmoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightningCultistEntity>> LIGHTNING_CULTIST = register("lightning_cultist", EntityType.Builder.<LightningCultistEntity>of(LightningCultistEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LightningCultistEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LightningWizardEntity>> LIGHTNING_WIZARD = register("lightning_wizard", EntityType.Builder.<LightningWizardEntity>of(LightningWizardEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LightningWizardEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LightningBlastAmmoEntity>> LIGHTNING_BLAST_AMMO = register("lightning_blast_ammo", EntityType.Builder.<LightningBlastAmmoEntity>of(LightningBlastAmmoEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LightningBlastAmmoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CamperEntity>> CAMPER = register("camper",
			EntityType.Builder.<CamperEntity>of(CamperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CamperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GiantSteveCowEntity>> GIANT_STEVE_COW = register("giant_steve_cow",
			EntityType.Builder.<GiantSteveCowEntity>of(GiantSteveCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(GiantSteveCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<InfectedPigEntity>> INFECTED_PIG = register("infected_pig", EntityType.Builder.<InfectedPigEntity>of(InfectedPigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InfectedPigEntity::new).fireImmune().sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<InfectedCowEntity>> INFECTED_COW = register("infected_cow", EntityType.Builder.<InfectedCowEntity>of(InfectedCowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(InfectedCowEntity::new).fireImmune().sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<InfectedChickenEntity>> INFECTED_CHICKEN = register("infected_chicken", EntityType.Builder.<InfectedChickenEntity>of(InfectedChickenEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InfectedChickenEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<GoolingEntity>> GOOLING = register("gooling",
			EntityType.Builder.<GoolingEntity>of(GoolingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoolingEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<SurvivorEntity>> SURVIVOR = register("survivor",
			EntityType.Builder.<SurvivorEntity>of(SurvivorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(SurvivorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoldierEntity>> SOLDIER = register("soldier",
			EntityType.Builder.<SoldierEntity>of(SoldierEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(SoldierEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HandgunRoundAmmoEntity>> HANDGUN_ROUND_AMMO = register("handgun_round_ammo", EntityType.Builder.<HandgunRoundAmmoEntity>of(HandgunRoundAmmoEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HandgunRoundAmmoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IrradiatedEggAmmoEntity>> IRRADIATED_EGG_AMMO = register("irradiated_egg_ammo", EntityType.Builder.<IrradiatedEggAmmoEntity>of(IrradiatedEggAmmoEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IrradiatedEggAmmoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UndeadSoulEntity>> UNDEAD_SOUL = register("undead_soul", EntityType.Builder.<UndeadSoulEntity>of(UndeadSoulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(UndeadSoulEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorpsepuppetEntity>> CORPSEPUPPET = register("corpsepuppet",
			EntityType.Builder.<CorpsepuppetEntity>of(CorpsepuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorpsepuppetEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AncientWizardEntity>> ANCIENT_WIZARD = register("ancient_wizard", EntityType.Builder.<AncientWizardEntity>of(AncientWizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AncientWizardEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PoisonDartAmmoEntity>> POISON_DART_AMMO = register("poison_dart_ammo",
			EntityType.Builder.<PoisonDartAmmoEntity>of(PoisonDartAmmoEntity::new, MobCategory.MISC).setCustomClientFactory(PoisonDartAmmoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TheTimelessEntity>> THE_TIMELESS = register("the_timeless",
			EntityType.Builder.<TheTimelessEntity>of(TheTimelessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(512).setUpdateInterval(3).setCustomClientFactory(TheTimelessEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PoisonedSkeletonEntity>> POISONED_SKELETON = register("poisoned_skeleton",
			EntityType.Builder.<PoisonedSkeletonEntity>of(PoisonedSkeletonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoisonedSkeletonEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AlligatorEntity.init();
			SteveCowEntity.init();
			PikachuEntity.init();
			FrombieEntity.init();
			CrusherEntity.init();
			HordebeastEntity.init();
			LesserWizardEntity.init();
			LightningCultistEntity.init();
			LightningWizardEntity.init();
			CamperEntity.init();
			GiantSteveCowEntity.init();
			InfectedPigEntity.init();
			InfectedCowEntity.init();
			InfectedChickenEntity.init();
			GoolingEntity.init();
			SurvivorEntity.init();
			SoldierEntity.init();
			UndeadSoulEntity.init();
			CorpsepuppetEntity.init();
			AncientWizardEntity.init();
			TheTimelessEntity.init();
			PoisonedSkeletonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ALLIGATOR.get(), AlligatorEntity.createAttributes().build());
		event.put(STEVE_COW.get(), SteveCowEntity.createAttributes().build());
		event.put(PIKACHU.get(), PikachuEntity.createAttributes().build());
		event.put(FROMBIE.get(), FrombieEntity.createAttributes().build());
		event.put(CRUSHER.get(), CrusherEntity.createAttributes().build());
		event.put(HORDEBEAST.get(), HordebeastEntity.createAttributes().build());
		event.put(LESSER_WIZARD.get(), LesserWizardEntity.createAttributes().build());
		event.put(LIGHTNING_CULTIST.get(), LightningCultistEntity.createAttributes().build());
		event.put(LIGHTNING_WIZARD.get(), LightningWizardEntity.createAttributes().build());
		event.put(CAMPER.get(), CamperEntity.createAttributes().build());
		event.put(GIANT_STEVE_COW.get(), GiantSteveCowEntity.createAttributes().build());
		event.put(INFECTED_PIG.get(), InfectedPigEntity.createAttributes().build());
		event.put(INFECTED_COW.get(), InfectedCowEntity.createAttributes().build());
		event.put(INFECTED_CHICKEN.get(), InfectedChickenEntity.createAttributes().build());
		event.put(GOOLING.get(), GoolingEntity.createAttributes().build());
		event.put(SURVIVOR.get(), SurvivorEntity.createAttributes().build());
		event.put(SOLDIER.get(), SoldierEntity.createAttributes().build());
		event.put(UNDEAD_SOUL.get(), UndeadSoulEntity.createAttributes().build());
		event.put(CORPSEPUPPET.get(), CorpsepuppetEntity.createAttributes().build());
		event.put(ANCIENT_WIZARD.get(), AncientWizardEntity.createAttributes().build());
		event.put(THE_TIMELESS.get(), TheTimelessEntity.createAttributes().build());
		event.put(POISONED_SKELETON.get(), PoisonedSkeletonEntity.createAttributes().build());
	}
}
