
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

import net.mcreator.stmwr.entity.SteveCowEntity;
import net.mcreator.stmwr.entity.PikachuEntity;
import net.mcreator.stmwr.entity.LesserWizardEntity;
import net.mcreator.stmwr.entity.HordebeastEntity;
import net.mcreator.stmwr.entity.FrombieEntity;
import net.mcreator.stmwr.entity.CrusherEntity;
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
	}
}
