package net.mcreator.stmwr.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.init.StmwrModItems;
import net.mcreator.stmwr.init.StmwrModBlocks;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class DoomforgeProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_DUST
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_DUST
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.URANIUM_DUST.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.URANIUM_DUST.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.URANIUM_DUST.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.URANIUM_DUST.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.URANIUM_DUST.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.URANIUM_DUST.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.URANIUM_DUST.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.URANIUM_DUST.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.URANIUM_DUST.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.URANIUM_DUST.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModBlocks.DOOMGLASS.get().asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.URANIUM_FUEL_ROD.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.IRRADIATED_EGG
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.GOLD_NAIL
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.IRRADIATED_EGG.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.IRRADIATED_EGG.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.STEVUM_SPRING.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.IRRADIATED_EGG.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.IRRADIATED_EGG.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.GOLD_NAIL.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.IRRADIATED_EGG.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.IRRADIATED_EGG.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.STEVUM_SPRING.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.IRRADIATED_EGG.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.FROSTWATCH.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.CHICKEN_GUN.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.HEARTSTONE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.ULTRITE
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.HEARTSTONE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.HEARTSTONE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.ULTRITE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.HEARTSTONE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.HEARTSTONE.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.ULTRITE.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.HEARTSTONE.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.HEARTSTONE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.ULTRITE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.HEARTSTONE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.MAGICIANS_SOUL.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModBlocks.RITUAL_STONE.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLUEPRINT_CONCRETE_MIXER
				.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.PINK_CONCRETE
							.asItem()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.PINK_CONCRETE
									.asItem()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == Blocks.PINK_CONCRETE.asItem()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == Items.WATER_BUCKET) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == Blocks.PINK_CONCRETE.asItem()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Blocks.PINK_CONCRETE.asItem()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == Items.WATER_BUCKET) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Blocks.PINK_CONCRETE.asItem()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == Blocks.PINK_CONCRETE.asItem()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == Items.WATER_BUCKET) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == Blocks.PINK_CONCRETE.asItem()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == Blocks.CAULDRON.asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModBlocks.CONCRETE_MIXER.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_URANIUM_HYDROPONICS.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_DUST
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.DIRT.asItem()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.URANIUM_DUST.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.IRRADIATED_WATER_BUCKET.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.URANIUM_DUST.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == Blocks.DIRT.asItem()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.URANIUM_DUST.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.IRRADIATED_WATER_BUCKET.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModBlocks.DEADIRON_CASING.get().asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModBlocks.URANIUM_HYDROPONICS.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_URANIUM_HYDROPONICS.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DEADIRON_NAIL
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.COPPER_PLATE
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.DEADIRON_NAIL.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.STORUM_SPRING.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.STEVUM_ROD.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.STORUM_SPRING.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.DEADIRON_NAIL.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.COPPER_PLATE.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.DEADIRON_NAIL.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.STORUM_SPRING.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.STEVUM_ROD.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.STORUM_SPRING.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModBlocks.URANIUM_HYDROPONICS.get().asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModBlocks.URANIUM_HYDROPONICS_UTILITY_HATCH.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLUEPRINT_POWERCELL.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.COPPER_PLATE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.COPPER_PLATE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.COPPER_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.COPPER_PLATE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.COPPER_PLATE.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.COPPER_PLATE.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.COPPER_PLATE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.COPPER_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModBlocks.DOOMGLASS.get().asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.POWERCELL.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR
				.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.COLDSTEEL_PLATE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR
												.asItem()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Blocks.AIR.asItem()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.POWERCELL.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Blocks.AIR.asItem()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == Blocks.AIR.asItem()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.DEADIRON_ARMOR_HELMET.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULAR_ARMOR_HELMET.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR
				.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.COLDSTEEL_PLATE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.POWERCELL
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.DEADIRON_ARMOR_CHESTPLATE.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULAR_ARMOR_CHESTPLATE.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR
				.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.COLDSTEEL_PLATE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Blocks.AIR.asItem()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.POWERCELL.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Blocks.AIR.asItem()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.DEADIRON_ARMOR_LEGGINGS.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULAR_ARMOR_LEGGINGS.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR
				.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.POWERCELL
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Blocks.AIR.asItem()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == Blocks.AIR.asItem()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Blocks.AIR.asItem()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.COLDSTEEL_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.DEADIRON_ARMOR_BOOTS.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULAR_ARMOR_BOOTS.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR_UPGRADES.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_EYE) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.MAGIC_CARROT
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_EYE) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_EYE) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.MAGIC_CARROT.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == Items.ENDER_EYE) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Items.ENDER_EYE) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.MAGIC_CARROT.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Items.ENDER_EYE) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == Items.ENDER_EYE) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.MAGIC_CARROT.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == Items.ENDER_EYE) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.MODULAR_ARMOR_HELMET.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULED_ARMOR_HELMET.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR_UPGRADES.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.COPPER_SPRING
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.GOLD_ROD
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.COPPER_SPRING.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.COPPER_SPRING.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.GOLD_ROD.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.COPPER_SPRING.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.COPPER_SPRING.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.GOLD_ROD.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.COPPER_SPRING.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.COPPER_SPRING.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.GOLD_ROD.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.COPPER_SPRING.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.MODULAR_ARMOR_CHESTPLATE.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULED_ARMOR_CHESTPLATE.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR_UPGRADES.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BOING_APPLE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.ZOOM_APPLE
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.BOING_APPLE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.BOING_APPLE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.ZOOM_APPLE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.BOING_APPLE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.BOING_APPLE.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.ZOOM_APPLE.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.BOING_APPLE.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.BOING_APPLE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.ZOOM_APPLE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.BOING_APPLE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.MODULAR_ARMOR_LEGGINGS.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULED_ARMOR_LEGGINGS.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_MODULAR_ARMOR_UPGRADES.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.SLIME_BLOCK
								.asItem()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == Items.WATER_BUCKET) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == Blocks.SLIME_BLOCK.asItem()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == Items.WATER_BUCKET) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Items.WATER_BUCKET) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == Blocks.SLIME_BLOCK.asItem()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Items.WATER_BUCKET) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == Items.WATER_BUCKET) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == Blocks.SLIME_BLOCK.asItem()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == Items.WATER_BUCKET) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.MODULAR_ARMOR_BOOTS.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.MODULED_ARMOR_BOOTS.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLUEPRINT_REPAIR_PLANT
				.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.IRON_COG.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModBlocks.BLOCK_OF_SCRAP.get().asItem()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.IRON_COG
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.IRON_COG.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModBlocks.BLOCK_OF_SCRAP.get().asItem()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.IRON_COG.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.IRON_COG.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModBlocks.BLOCK_OF_SCRAP.get().asItem()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.IRON_COG.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.IRON_COG.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModBlocks.BLOCK_OF_SCRAP.get().asItem()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.IRON_COG.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == Blocks.ANVIL.asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModBlocks.REPAIR_PLANT.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_VORTEX_MANIPULATION.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == Items.ENDER_PEARL) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == Items.ENDER_PEARL) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == Items.ENDER_PEARL) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Items.ENDER_PEARL) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == Items.ENDER_PEARL) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Items.ENDER_PEARL) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == Items.ENDER_PEARL) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == Items.ENDER_PEARL) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == Items.ENDER_PEARL) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModBlocks.SMOOTH_SNAPSTONE.get().asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModBlocks.WARP_BRICK.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_VORTEX_MANIPULATION.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Items.POPPED_CHORUS_FRUIT) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == Items.AMETHYST_SHARD) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == Items.POPPED_CHORUS_FRUIT) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == Items.AMETHYST_SHARD) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == Items.AMETHYST_SHARD) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == Items.POPPED_CHORUS_FRUIT) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == Items.AMETHYST_SHARD) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == Items.AMETHYST_SHARD) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == Items.POPPED_CHORUS_FRUIT) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == Items.AMETHYST_SHARD) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == Items.CLOCK) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.VORTEX_MANIPULATOR.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_PORTABLE_CRUCIBLE_OVEN.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.ULTRITE.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.HEARTSTONE
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.ULTRITE
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.ULTRITE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.HEARTSTONE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.ULTRITE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.ULTRITE.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.HEARTSTONE.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.ULTRITE.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.ULTRITE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.HEARTSTONE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.ULTRITE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModBlocks.PURIFIER_MK_2.get().asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.PORTABLE_CRUCIBLE.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY)
				.getItem() == StmwrModItems.BLUEPRINT_PORTABLE_CRUCIBLE_OVEN.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DEADIRON_PLATE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.DEADIRON_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == Blocks.SMOKER.asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.PORTABLE_OVEN.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.STORUM_PLATE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.STORALIUM
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModItems.STORUM_PLATE.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.STORUM_PLATE.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.STORALIUM.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModItems.STORUM_PLATE.get()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModItems.STORUM_PLATE.get()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.STORALIUM.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModItems.STORUM_PLATE.get()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModItems.STORUM_PLATE.get()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.STORALIUM.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModItems.STORUM_PLATE.get()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModItems.POCKET_CELL.get()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModItems.EXTREME_POCKET_CELL.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(16)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(12)).getItem() : ItemStack.EMPTY)
					.is(ItemTags.create(new ResourceLocation("minecraft:forging_hammers")))) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(15)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModBlocks.CELL_CASING
							.get().asItem()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.ULTRITE
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == StmwrModBlocks.CELL_CASING.get().asItem()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModBlocks.CELL_CASING.get().asItem()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.ULTRITE.get()) {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
												.getItem() == StmwrModBlocks.CELL_CASING.get().asItem()) {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
													.getItem() == StmwrModBlocks.CELL_CASING.get().asItem()) {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
														.getItem() == StmwrModItems.ULTRITE.get()) {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
															.getItem() == StmwrModBlocks.CELL_CASING.get().asItem()) {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
																.getItem() == StmwrModBlocks.CELL_CASING.get().asItem()) {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY)
																	.getItem() == StmwrModItems.ULTRITE.get()) {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
																		.getItem() == StmwrModBlocks.CELL_CASING.get().asItem()) {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(13)).getItem()
																			: ItemStack.EMPTY).getItem() == StmwrModBlocks.IMPROVED_CELL.get().asItem()) {
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 12;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						if (_stk.hurt(_amount, RandomSource.create(), null)) {
																							_stk.shrink(1);
																							_stk.setDamageValue(0);
																						}
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 0;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 1;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 2;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 3;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 4;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 5;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 6;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 7;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 8;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 9;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 10;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 11;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 13;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 14;
																				final ItemStack _setstack = new ItemStack(StmwrModBlocks.HYPERCELL.get()).copy();
																				_setstack.setCount((int) (new Object() {
																					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						BlockEntity _ent = world.getBlockEntity(pos);
																						if (_ent != null)
																							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
																						return _retval.get();
																					}
																				}.getAmount(world, BlockPos.containing(x, y, z), 14) + 1));
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable)
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
																				});
																			}
																		}
																		{
																			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
																			if (_ent != null) {
																				final int _slotid = 15;
																				final int _amount = 1;
																				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
																					if (capability instanceof IItemHandlerModifiable) {
																						ItemStack _stk = capability.getStackInSlot(_slotid).copy();
																						_stk.shrink(_amount);
																						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
																					}
																				});
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
