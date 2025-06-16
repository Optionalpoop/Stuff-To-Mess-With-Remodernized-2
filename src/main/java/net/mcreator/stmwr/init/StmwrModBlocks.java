
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.stmwr.block.TotemFusionStationBlock;
import net.mcreator.stmwr.block.TomatoPlantBlock;
import net.mcreator.stmwr.block.StorumOreBlock;
import net.mcreator.stmwr.block.StorumBlockBlock;
import net.mcreator.stmwr.block.StorageCubeBlock;
import net.mcreator.stmwr.block.StopstoneBlock;
import net.mcreator.stmwr.block.SpellforgeBlock;
import net.mcreator.stmwr.block.SpeedstoneBlock;
import net.mcreator.stmwr.block.PlasticBlock;
import net.mcreator.stmwr.block.PeanutPlantBlock;
import net.mcreator.stmwr.block.OrePurifierBlock;
import net.mcreator.stmwr.block.MagiciteOreBlock;
import net.mcreator.stmwr.block.MagiciteBlockBlock;
import net.mcreator.stmwr.block.MagiciansWorkbenchBlock;
import net.mcreator.stmwr.block.KitchenBlock;
import net.mcreator.stmwr.block.GodliumOreBlock;
import net.mcreator.stmwr.block.GodliumBlockBlock;
import net.mcreator.stmwr.block.ForgeBlock;
import net.mcreator.stmwr.block.FlamingStorageCubeBlock;
import net.mcreator.stmwr.block.DupestoneBlock;
import net.mcreator.stmwr.block.BlazingPlasticBlock;
import net.mcreator.stmwr.block.BlazedOreBlock;
import net.mcreator.stmwr.block.BlazedBlockBlock;
import net.mcreator.stmwr.block.AlloyFuseBlock;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StmwrMod.MODID);
	public static final RegistryObject<Block> KITCHEN = REGISTRY.register("kitchen", () -> new KitchenBlock());
	public static final RegistryObject<Block> PEANUT_PLANT = REGISTRY.register("peanut_plant", () -> new PeanutPlantBlock());
	public static final RegistryObject<Block> TOMATO_PLANT = REGISTRY.register("tomato_plant", () -> new TomatoPlantBlock());
	public static final RegistryObject<Block> MAGICITE_ORE = REGISTRY.register("magicite_ore", () -> new MagiciteOreBlock());
	public static final RegistryObject<Block> MAGICITE_BLOCK = REGISTRY.register("magicite_block", () -> new MagiciteBlockBlock());
	public static final RegistryObject<Block> MAGICIANS_WORKBENCH = REGISTRY.register("magicians_workbench", () -> new MagiciansWorkbenchBlock());
	public static final RegistryObject<Block> STORUM_ORE = REGISTRY.register("storum_ore", () -> new StorumOreBlock());
	public static final RegistryObject<Block> STORUM_BLOCK = REGISTRY.register("storum_block", () -> new StorumBlockBlock());
	public static final RegistryObject<Block> STORAGE_CUBE = REGISTRY.register("storage_cube", () -> new StorageCubeBlock());
	public static final RegistryObject<Block> PLASTIC = REGISTRY.register("plastic", () -> new PlasticBlock());
	public static final RegistryObject<Block> FORGE = REGISTRY.register("forge", () -> new ForgeBlock());
	public static final RegistryObject<Block> SPELLFORGE = REGISTRY.register("spellforge", () -> new SpellforgeBlock());
	public static final RegistryObject<Block> BLAZED_ORE = REGISTRY.register("blazed_ore", () -> new BlazedOreBlock());
	public static final RegistryObject<Block> BLAZED_BLOCK = REGISTRY.register("blazed_block", () -> new BlazedBlockBlock());
	public static final RegistryObject<Block> BLAZING_PLASTIC = REGISTRY.register("blazing_plastic", () -> new BlazingPlasticBlock());
	public static final RegistryObject<Block> FLAMING_STORAGE_CUBE = REGISTRY.register("flaming_storage_cube", () -> new FlamingStorageCubeBlock());
	public static final RegistryObject<Block> ORE_PURIFIER = REGISTRY.register("ore_purifier", () -> new OrePurifierBlock());
	public static final RegistryObject<Block> GODLIUM_ORE = REGISTRY.register("godlium_ore", () -> new GodliumOreBlock());
	public static final RegistryObject<Block> GODLIUM_BLOCK = REGISTRY.register("godlium_block", () -> new GodliumBlockBlock());
	public static final RegistryObject<Block> STOPSTONE = REGISTRY.register("stopstone", () -> new StopstoneBlock());
	public static final RegistryObject<Block> SPEEDSTONE = REGISTRY.register("speedstone", () -> new SpeedstoneBlock());
	public static final RegistryObject<Block> DUPESTONE = REGISTRY.register("dupestone", () -> new DupestoneBlock());
	public static final RegistryObject<Block> ALLOY_FUSE = REGISTRY.register("alloy_fuse", () -> new AlloyFuseBlock());
	public static final RegistryObject<Block> TOTEM_FUSION_STATION = REGISTRY.register("totem_fusion_station", () -> new TotemFusionStationBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
