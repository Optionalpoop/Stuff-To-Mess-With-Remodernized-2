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
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.init.StmwrModItems;
import net.mcreator.stmwr.init.StmwrModBlocks;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class DesignerProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_CONCRETE.asItem()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_CONCRETE
								.asItem()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_CONCRETE_MIXER.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModBlocks.DEADIRON_CASING
						.get().asItem()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.CHICKEN_GUN
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModBlocks.DEADIRON_CASING.get().asItem()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_GUNS.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.WHEAT_SEEDS) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == StmwrModBlocks.URANIUM_BLOCK
							.get().asItem()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.WHEAT_SEEDS) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_URANIUM_HYDROPONICS.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.LIGHTNING_FRAGMENT
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.REDSTONE_BLOCK
							.asItem()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModItems.LIGHTNING_FRAGMENT.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_POWERCELL.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModBlocks.STEVUM_BLOCK.get()
						.asItem()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.getItem() == StmwrModItems.DEADIRON_ARMOR_HELMET.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == StmwrModBlocks.STEVUM_BLOCK
								.get().asItem()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_MODULAR_ARMOR.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_INGOT) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.getItem() == StmwrModItems.DEADIRON_ARMOR_CHESTPLATE.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_INGOT) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_MODULAR_ARMOR_UPGRADES.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DEADIRON_AXE.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BIOHARVESTER
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
								.getItem() == StmwrModItems.DEADIRON_PICKAXE.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_POWER_TOOLS.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.HEALING_APPLE
						.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.BLAZED_PICKAXE
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.HEALING_APPLE
								.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_REPAIR_PLANT.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_EYE) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.CREATION_ORB
							.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_EYE) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_VORTEX_MANIPULATION.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.EMPTY_BLUEPRINT.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.URANIUM_FUEL_ROD.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.BLAST_FURNACE.asItem()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.BUCKET) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Blocks.SMOKER.asItem()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == StmwrModItems.DATA_CARD
									.get()) {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
										.getItem() == StmwrModItems.DATA_CARD.get()) {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
											.getItem() == StmwrModItems.DATA_CARD.get()) {
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
												final ItemStack _setstack = new ItemStack(StmwrModItems.BLUEPRINT_PORTABLE_CRUCIBLE_OVEN.get()).copy();
												_setstack.setCount((int) (new Object() {
													public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
														AtomicInteger _retval = new AtomicInteger(0);
														BlockEntity _ent = world.getBlockEntity(pos);
														if (_ent != null)
															_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
														return _retval.get();
													}
												}.getAmount(world, BlockPos.containing(x, y, z), 8) + 1));
												_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													if (capability instanceof IItemHandlerModifiable)
														((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
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
