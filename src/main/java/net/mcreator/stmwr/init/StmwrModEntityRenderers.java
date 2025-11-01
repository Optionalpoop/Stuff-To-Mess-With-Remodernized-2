
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.stmwr.client.renderer.WeaselWormRenderer;
import net.mcreator.stmwr.client.renderer.UndeadSoulRenderer;
import net.mcreator.stmwr.client.renderer.TheTimelessRenderer;
import net.mcreator.stmwr.client.renderer.TheMeatyOneRenderer;
import net.mcreator.stmwr.client.renderer.SurvivorRenderer;
import net.mcreator.stmwr.client.renderer.SteveCowRenderer;
import net.mcreator.stmwr.client.renderer.SoldierRenderer;
import net.mcreator.stmwr.client.renderer.PoisonedSkeletonRenderer;
import net.mcreator.stmwr.client.renderer.PikachuRenderer;
import net.mcreator.stmwr.client.renderer.PaperBoyRenderer;
import net.mcreator.stmwr.client.renderer.LightningWizardRenderer;
import net.mcreator.stmwr.client.renderer.LightningCultistRenderer;
import net.mcreator.stmwr.client.renderer.LesserWizardRenderer;
import net.mcreator.stmwr.client.renderer.LavambieRenderer;
import net.mcreator.stmwr.client.renderer.InfectedPigRenderer;
import net.mcreator.stmwr.client.renderer.InfectedCowRenderer;
import net.mcreator.stmwr.client.renderer.InfectedChickenRenderer;
import net.mcreator.stmwr.client.renderer.HordebeastRenderer;
import net.mcreator.stmwr.client.renderer.GoolingRenderer;
import net.mcreator.stmwr.client.renderer.GoblinRenderer;
import net.mcreator.stmwr.client.renderer.GiantSteveCowRenderer;
import net.mcreator.stmwr.client.renderer.FrombieRenderer;
import net.mcreator.stmwr.client.renderer.FireSlingerRenderer;
import net.mcreator.stmwr.client.renderer.EmptinessRenderer;
import net.mcreator.stmwr.client.renderer.DreamlingRenderer;
import net.mcreator.stmwr.client.renderer.CrusherRenderer;
import net.mcreator.stmwr.client.renderer.CrazyPersonRenderer;
import net.mcreator.stmwr.client.renderer.CorpsepuppetRenderer;
import net.mcreator.stmwr.client.renderer.CamperRenderer;
import net.mcreator.stmwr.client.renderer.AncientWizardRenderer;
import net.mcreator.stmwr.client.renderer.AlligatorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StmwrModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StmwrModEntities.ALLIGATOR.get(), AlligatorRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.STEVE_COW.get(), SteveCowRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.PIKACHU.get(), PikachuRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.FROMBIE.get(), FrombieRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.CRUSHER.get(), CrusherRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.HORDEBEAST.get(), HordebeastRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.LESSER_WIZARD.get(), LesserWizardRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.SNOWSHOT_AMMO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.SNOW_SHARD_AMMO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.LIGHTNING_CULTIST.get(), LightningCultistRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.LIGHTNING_WIZARD.get(), LightningWizardRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.LIGHTNING_BLAST_AMMO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.CAMPER.get(), CamperRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.GIANT_STEVE_COW.get(), GiantSteveCowRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.INFECTED_PIG.get(), InfectedPigRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.INFECTED_COW.get(), InfectedCowRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.INFECTED_CHICKEN.get(), InfectedChickenRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.GOOLING.get(), GoolingRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.SURVIVOR.get(), SurvivorRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.SOLDIER.get(), SoldierRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.HANDGUN_ROUND_AMMO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.IRRADIATED_EGG_AMMO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.UNDEAD_SOUL.get(), UndeadSoulRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.CORPSEPUPPET.get(), CorpsepuppetRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.ANCIENT_WIZARD.get(), AncientWizardRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.POISON_DART_AMMO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.THE_TIMELESS.get(), TheTimelessRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.POISONED_SKELETON.get(), PoisonedSkeletonRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.GOBLIN.get(), GoblinRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.CRAZY_PERSON.get(), CrazyPersonRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.FIREBLOOD_SHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.FIRE_SLINGER.get(), FireSlingerRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.FIRE_SLINGER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.WEASEL_WORM.get(), WeaselWormRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.LAVAMBIE.get(), LavambieRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.MAGIC_POWDER_AMMO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.DREAMLING.get(), DreamlingRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.PAPER_BOY.get(), PaperBoyRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.THE_MEATY_ONE.get(), TheMeatyOneRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.EMPTINESS.get(), EmptinessRenderer::new);
	}
}
