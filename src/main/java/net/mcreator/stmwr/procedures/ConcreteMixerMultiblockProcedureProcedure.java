package net.mcreator.stmwr.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.ConcreteMixerGUIMenu;
import net.mcreator.stmwr.init.StmwrModBlocks;

import io.netty.buffer.Unpooled;

public class ConcreteMixerMultiblockProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 0))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
			if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + -1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 0))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + -1, y + -1, z + 0))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
								if ((world.getBlockState(BlockPos.containing(x + -1, y + -1, z + -1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + -1, y + -1, z + 1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
											if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == StmwrModBlocks.URANIUM_BLOCK.get()) {
												if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 1))).getBlock() == StmwrModBlocks.DOOMGLASS.get()) {
													if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + -1))).getBlock() == StmwrModBlocks.DOOMGLASS.get()) {
														if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 0))).getBlock() == StmwrModBlocks.DOOMGLASS.get()) {
															if ((world.getBlockState(BlockPos.containing(x + -1, y + 1, z + 0))).getBlock() == StmwrModBlocks.DOOMGLASS.get()) {
																if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 0))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
																		if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + -1))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
																			if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 0))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
																				if ((world.getBlockState(BlockPos.containing(x + -1, y + 2, z + 0))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
																					if ((world.getBlockState(BlockPos.containing(x + 0, y + 3, z + 0))).getBlock() == StmwrModBlocks.DEADIRON_CASING.get()) {
																						if (entity instanceof ServerPlayer _ent) {
																							BlockPos _bpos = BlockPos.containing(x, y, z);
																							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
																								@Override
																								public Component getDisplayName() {
																									return Component.literal("ConcreteMixerGUI");
																								}

																								@Override
																								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
																									return new ConcreteMixerGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
																								}
																							}, _bpos);
																						}
																					} else {
																						if (entity instanceof Player _player && !_player.level().isClientSide())
																							_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
																					}
																				} else {
																					if (entity instanceof Player _player && !_player.level().isClientSide())
																						_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
																				}
																			} else {
																				if (entity instanceof Player _player && !_player.level().isClientSide())
																					_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
																			}
																		} else {
																			if (entity instanceof Player _player && !_player.level().isClientSide())
																				_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
																		}
																	} else {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
																	}
																} else {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
																}
															} else {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
															}
														} else {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
														}
													} else {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
											}
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
										}
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
									}
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Incomplete Multiblock!"), true);
		}
	}
}
