
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
import net.mcreator.stmwr.block.entity.OrePurifierBlockEntity;
import net.mcreator.stmwr.block.entity.MagiciansWorkbenchBlockEntity;
import net.mcreator.stmwr.block.entity.KitchenBlockEntity;
import net.mcreator.stmwr.block.entity.GodlyStorageCubeBlockEntity;
import net.mcreator.stmwr.block.entity.ForgeBlockEntity;
import net.mcreator.stmwr.block.entity.FlamingStorageCubeBlockEntity;
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

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
