package net.mcreator.stmwr.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stmwr.world.inventory.RitualStoneGUIMenu;
import net.mcreator.stmwr.init.StmwrModBlocks;

import io.netty.buffer.Unpooled;

public class RitualStoneMultiblockProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:frozen_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:frozen_sea"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:icelands")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:snowy_sands"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("stmwr:frosted_peaks"))) {
			if ((world.getBlockState(BlockPos.containing(x + 2, y + 0, z + 2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + -2, y + 0, z + -2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + 2, y + 0, z + -2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + -2, y + 0, z + 2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + 2, y + 1, z + 2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
								if ((world.getBlockState(BlockPos.containing(x + -2, y + 1, z + -2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + 2, y + 1, z + -2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + -2, y + 1, z + 2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
											if ((world.getBlockState(BlockPos.containing(x + 3, y + 0, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
												if ((world.getBlockState(BlockPos.containing(x + 3, y + 1, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
													if ((world.getBlockState(BlockPos.containing(x + -3, y + 0, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
														if ((world.getBlockState(BlockPos.containing(x + -3, y + 1, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
															if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 3))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 3))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + -3))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																		if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + -3))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																			if ((world.getBlockState(BlockPos.containing(x + 2, y + 2, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																				if ((world.getBlockState(BlockPos.containing(x + 2, y + 3, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																					if ((world.getBlockState(BlockPos.containing(x + -2, y + 2, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																						if ((world.getBlockState(BlockPos.containing(x + -2, y + 3, z + 0))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																							if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																								if ((world.getBlockState(BlockPos.containing(x + 0, y + 3, z + 2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																									if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + -2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																										if ((world.getBlockState(BlockPos.containing(x + 0, y + 3, z + -2))).getBlock() == StmwrModBlocks.MAGICAL_CASING.get()) {
																											if (entity instanceof ServerPlayer _ent) {
																												BlockPos _bpos = BlockPos.containing(x, y, z);
																												NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
																													@Override
																													public Component getDisplayName() {
																														return Component.literal("RitualStoneGUI");
																													}

																													@Override
																													public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
																														return new RitualStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
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
				_player.displayClientMessage(Component.literal("This must be built in SteveCow Land."), true);
		}
	}
}
