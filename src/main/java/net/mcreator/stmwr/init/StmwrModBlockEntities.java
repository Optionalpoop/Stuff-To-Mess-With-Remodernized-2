
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.stmwr.block.entity.TotemFusionStationBlockEntity;
import net.mcreator.stmwr.block.entity.StorageCubeBlockEntity;
import net.mcreator.stmwr.block.entity.SpellforgeBlockEntity;
import net.mcreator.stmwr.block.entity.SoulManipulatorAccessPointBlockEntity;
import net.mcreator.stmwr.block.entity.RitualStoneBlockEntity;
import net.mcreator.stmwr.block.entity.RadiationRemovalPlantAccessPointBlockEntity;
import net.mcreator.stmwr.block.entity.PurifierMK2BlockEntity;
import net.mcreator.stmwr.block.entity.OrePurifierBlockEntity;
import net.mcreator.stmwr.block.entity.ManufacturingPlantAccessPointBlockEntity;
import net.mcreator.stmwr.block.entity.MagiciansWorkbenchBlockEntity;
import net.mcreator.stmwr.block.entity.KitchenBlockEntity;
import net.mcreator.stmwr.block.entity.KeyAnvilBlockEntity;
import net.mcreator.stmwr.block.entity.ItemReseacherAccessPointBlockEntity;
import net.mcreator.stmwr.block.entity.GodlyStorageCubeBlockEntity;
import net.mcreator.stmwr.block.entity.FrozenForgeBlockEntity;
import net.mcreator.stmwr.block.entity.ForgeBlockEntity;
import net.mcreator.stmwr.block.entity.FlamingStorageCubeBlockEntity;
import net.mcreator.stmwr.block.entity.DoomforgeAccessPointBlockEntity;
import net.mcreator.stmwr.block.entity.DesignerAccessPointBlockEntity;
import net.mcreator.stmwr.block.entity.ConsumerBlockEntity;
import net.mcreator.stmwr.block.entity.CompressorBlockEntity;
import net.mcreator.stmwr.block.entity.AlloyFuseBlockEntity;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StmwrMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> KITCHEN = register("kitchen", StmwrModBlocks.KITCHEN, KitchenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGICIANS_WORKBENCH = register("magicians_workbench", StmwrModBlocks.MAGICIANS_WORKBENCH, MagiciansWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STORAGE_CUBE = register("storage_cube", StmwrModBlocks.STORAGE_CUBE, StorageCubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORGE = register("forge", StmwrModBlocks.FORGE, ForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPELLFORGE = register("spellforge", StmwrModBlocks.SPELLFORGE, SpellforgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLAMING_STORAGE_CUBE = register("flaming_storage_cube", StmwrModBlocks.FLAMING_STORAGE_CUBE, FlamingStorageCubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ORE_PURIFIER = register("ore_purifier", StmwrModBlocks.ORE_PURIFIER, OrePurifierBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALLOY_FUSE = register("alloy_fuse", StmwrModBlocks.ALLOY_FUSE, AlloyFuseBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOTEM_FUSION_STATION = register("totem_fusion_station", StmwrModBlocks.TOTEM_FUSION_STATION, TotemFusionStationBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CONSUMER = register("consumer", StmwrModBlocks.CONSUMER, ConsumerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COMPRESSOR = register("compressor", StmwrModBlocks.COMPRESSOR, CompressorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GODLY_STORAGE_CUBE = register("godly_storage_cube", StmwrModBlocks.GODLY_STORAGE_CUBE, GodlyStorageCubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEY_ANVIL = register("key_anvil", StmwrModBlocks.KEY_ANVIL, KeyAnvilBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FROZEN_FORGE = register("frozen_forge", StmwrModBlocks.FROZEN_FORGE, FrozenForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PURIFIER_MK_2 = register("purifier_mk_2", StmwrModBlocks.PURIFIER_MK_2, PurifierMK2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DOOMFORGE_ACCESS_POINT = register("doomforge_access_point", StmwrModBlocks.DOOMFORGE_ACCESS_POINT, DoomforgeAccessPointBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RADIATION_REMOVAL_PLANT_ACCESS_POINT = register("radiation_removal_plant_access_point", StmwrModBlocks.RADIATION_REMOVAL_PLANT_ACCESS_POINT, RadiationRemovalPlantAccessPointBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANUFACTURING_PLANT_ACCESS_POINT = register("manufacturing_plant_access_point", StmwrModBlocks.MANUFACTURING_PLANT_ACCESS_POINT, ManufacturingPlantAccessPointBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOUL_MANIPULATOR_ACCESS_POINT = register("soul_manipulator_access_point", StmwrModBlocks.SOUL_MANIPULATOR_ACCESS_POINT, SoulManipulatorAccessPointBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RITUAL_STONE = register("ritual_stone", StmwrModBlocks.RITUAL_STONE, RitualStoneBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESIGNER_ACCESS_POINT = register("designer_access_point", StmwrModBlocks.DESIGNER_ACCESS_POINT, DesignerAccessPointBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ITEM_RESEACHER_ACCESS_POINT = register("item_reseacher_access_point", StmwrModBlocks.ITEM_RESEACHER_ACCESS_POINT, ItemReseacherAccessPointBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
