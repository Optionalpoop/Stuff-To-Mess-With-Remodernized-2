
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.stmwr.StmwrMod;

public class StmwrModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, StmwrMod.MODID);
	public static final RegistryObject<PaintingVariant> AETHER = REGISTRY.register("aether", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> COLD = REGISTRY.register("cold", () -> new PaintingVariant(48, 32));
	public static final RegistryObject<PaintingVariant> JACK_BLACK = REGISTRY.register("jack_black", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> KING = REGISTRY.register("king", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> MATH = REGISTRY.register("math", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> PORTAL = REGISTRY.register("portal", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> SAND_WORM = REGISTRY.register("sand_worm", () -> new PaintingVariant(64, 32));
	public static final RegistryObject<PaintingVariant> TOTEM = REGISTRY.register("totem", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> WARRIOR = REGISTRY.register("warrior", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> PIKA_PIKA = REGISTRY.register("pika_pika", () -> new PaintingVariant(16, 16));
}
