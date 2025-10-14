package net.mcreator.stmwr.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stmwr.init.StmwrModItems;
import net.mcreator.stmwr.init.StmwrModBlocks;
import net.mcreator.stmwr.StmwrMod;

public class TARDISHandleOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == StmwrModItems.TARDIS_KEY.get()) {
			if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PHONE.get()) {
								if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
											if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
												if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
													if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
														if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
															if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
																			ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("stmwr:time_vortex"));
																			if (_player.level().dimension() == destinationType)
																				return;
																			ServerLevel nextLevel = _player.server.getLevel(destinationType);
																			if (nextLevel != null) {
																				_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
																				_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
																				_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
																				for (MobEffectInstance _effectinstance : _player.getActiveEffects())
																					_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
																				_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
																			}
																		}
																		StmwrMod.queueServerWork(20, () -> {
																			{
																				Entity _ent = entity;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands()
																							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																									_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
																									_ent.level().getServer(), _ent), "tardisinterior");
																				}
																			}
																		});
																	} else {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																	}
																} else {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																}
															} else {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
															}
														} else {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
														}
													} else {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
											}
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
										}
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
									}
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
			}
			if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PHONE.get()) {
								if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
											if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
												if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
													if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
														if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
															if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + -1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + -1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
																			ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("stmwr:time_vortex"));
																			if (_player.level().dimension() == destinationType)
																				return;
																			ServerLevel nextLevel = _player.server.getLevel(destinationType);
																			if (nextLevel != null) {
																				_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
																				_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
																				_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
																				for (MobEffectInstance _effectinstance : _player.getActiveEffects())
																					_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
																				_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
																			}
																		}
																		StmwrMod.queueServerWork(20, () -> {
																			{
																				Entity _ent = entity;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands()
																							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																									_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
																									_ent.level().getServer(), _ent), "tardisinterior");
																				}
																			}
																		});
																	} else {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																	}
																} else {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																}
															} else {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
															}
														} else {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
														}
													} else {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
											}
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
										}
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
									}
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
			}
			if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + -1, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + -1, y + -1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PHONE.get()) {
								if ((world.getBlockState(BlockPos.containing(x + -1, y + 0, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + -1, y + 0, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
											if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
												if ((world.getBlockState(BlockPos.containing(x + -1, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
													if ((world.getBlockState(BlockPos.containing(x + -1, y + 1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
														if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
															if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																if ((world.getBlockState(BlockPos.containing(x + -1, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + -1, y + 2, z + 1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
																			ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("stmwr:time_vortex"));
																			if (_player.level().dimension() == destinationType)
																				return;
																			ServerLevel nextLevel = _player.server.getLevel(destinationType);
																			if (nextLevel != null) {
																				_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
																				_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
																				_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
																				for (MobEffectInstance _effectinstance : _player.getActiveEffects())
																					_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
																				_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
																			}
																		}
																		StmwrMod.queueServerWork(20, () -> {
																			{
																				Entity _ent = entity;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands()
																							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																									_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
																									_ent.level().getServer(), _ent), "tardisinterior");
																				}
																			}
																		});
																	} else {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																	}
																} else {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																}
															} else {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
															}
														} else {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
														}
													} else {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
											}
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
										}
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
									}
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
			}
			if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PHONE.get()) {
								if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
											if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
												if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
													if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
														if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
															if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
																			ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("stmwr:time_vortex"));
																			if (_player.level().dimension() == destinationType)
																				return;
																			ServerLevel nextLevel = _player.server.getLevel(destinationType);
																			if (nextLevel != null) {
																				_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
																				_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
																				_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
																				for (MobEffectInstance _effectinstance : _player.getActiveEffects())
																					_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
																				_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
																			}
																		}
																		StmwrMod.queueServerWork(20, () -> {
																			{
																				Entity _ent = entity;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands()
																							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																									_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
																									_ent.level().getServer(), _ent), "tardisinterior");
																				}
																			}
																		});
																	} else {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																	}
																} else {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																}
															} else {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
															}
														} else {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
														}
													} else {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
											}
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
										}
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
									}
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
			}
			if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + 1, y + -1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PHONE.get()) {
								if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
											if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
												if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
													if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
														if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
															if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + -1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + 1, y + 2, z + -1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
																			ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("stmwr:time_vortex"));
																			if (_player.level().dimension() == destinationType)
																				return;
																			ServerLevel nextLevel = _player.server.getLevel(destinationType);
																			if (nextLevel != null) {
																				_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
																				_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
																				_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
																				for (MobEffectInstance _effectinstance : _player.getActiveEffects())
																					_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
																				_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
																			}
																		}
																		StmwrMod.queueServerWork(20, () -> {
																			{
																				Entity _ent = entity;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands()
																							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																									_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
																									_ent.level().getServer(), _ent), "tardisinterior");
																				}
																			}
																		});
																	} else {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																	}
																} else {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																}
															} else {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
															}
														} else {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
														}
													} else {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
											}
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
										}
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
									}
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
			}
			if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
				if ((world.getBlockState(BlockPos.containing(x + -1, y + -1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
					if ((world.getBlockState(BlockPos.containing(x + 0, y + -1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
						if ((world.getBlockState(BlockPos.containing(x + -1, y + -1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
							if ((world.getBlockState(BlockPos.containing(x + -1, y + 0, z + 0))).getBlock() == StmwrModBlocks.TARDIS_PHONE.get()) {
								if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
									if ((world.getBlockState(BlockPos.containing(x + -1, y + 0, z + -1))).getBlock() == StmwrModBlocks.TARDIS_PLATING.get()) {
										if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
											if ((world.getBlockState(BlockPos.containing(x + -1, y + 1, z + 0))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
												if ((world.getBlockState(BlockPos.containing(x + 0, y + 1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
													if ((world.getBlockState(BlockPos.containing(x + -1, y + 1, z + -1))).getBlock() == StmwrModBlocks.TARDIS_WINDOWS.get()) {
														if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
															if ((world.getBlockState(BlockPos.containing(x + -1, y + 2, z + 0))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																if ((world.getBlockState(BlockPos.containing(x + 0, y + 2, z + -1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																	if ((world.getBlockState(BlockPos.containing(x + -1, y + 2, z + -1))).getBlock() == StmwrModBlocks.TARDIS_TOP_TEXT.get()) {
																		if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
																			ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("stmwr:time_vortex"));
																			if (_player.level().dimension() == destinationType)
																				return;
																			ServerLevel nextLevel = _player.server.getLevel(destinationType);
																			if (nextLevel != null) {
																				_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
																				_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
																				_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
																				for (MobEffectInstance _effectinstance : _player.getActiveEffects())
																					_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
																				_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
																			}
																		}
																		StmwrMod.queueServerWork(20, () -> {
																			{
																				Entity _ent = entity;
																				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
																					_ent.getServer().getCommands()
																							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																									_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
																									_ent.level().getServer(), _ent), "tardisinterior");
																				}
																			}
																		});
																	} else {
																		if (entity instanceof Player _player && !_player.level().isClientSide())
																			_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																	}
																} else {
																	if (entity instanceof Player _player && !_player.level().isClientSide())
																		_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
																}
															} else {
																if (entity instanceof Player _player && !_player.level().isClientSide())
																	_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
															}
														} else {
															if (entity instanceof Player _player && !_player.level().isClientSide())
																_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
														}
													} else {
														if (entity instanceof Player _player && !_player.level().isClientSide())
															_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
												}
											} else {
												if (entity instanceof Player _player && !_player.level().isClientSide())
													_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
											}
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
										}
									} else {
										if (entity instanceof Player _player && !_player.level().isClientSide())
											_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
									}
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
								}
							} else {
								if (entity instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Ship Incomplete."), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You need the key!"), true);
		}
	}
}
