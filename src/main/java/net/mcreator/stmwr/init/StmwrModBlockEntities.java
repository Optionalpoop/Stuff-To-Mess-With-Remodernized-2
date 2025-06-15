
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.stmwr.block.entity.StorageCubeBlockEntity;
import net.mcreator.stmwr.block.entity.SpellforgeBlockEntity;
import net.mcreator.stmwr.block.entity.MagiciansWorkbenchBlockEntity;
import net.mcreator.stmwr.block.entity.KitchenBlockEntity;
import net.mcreator.stmwr.block.entity.ForgeBlockEntity;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StmwrMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> KITCHEN = register("kitchen", StmwrModBlocks.KITCHEN, KitchenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGICIANS_WORKBENCH = register("magicians_workbench", StmwrModBlocks.MAGICIANS_WORKBENCH, MagiciansWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STORAGE_CUBE = register("storage_cube", StmwrModBlocks.STORAGE_CUBE, StorageCubeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FORGE = register("forge", StmwrModBlocks.FORGE, ForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPELLFORGE = register("spellforge", StmwrModBlocks.SPELLFORGE, SpellforgeBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
