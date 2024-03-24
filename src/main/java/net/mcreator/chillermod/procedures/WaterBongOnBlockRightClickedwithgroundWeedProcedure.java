package net.mcreator.chillermod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.chillermod.init.ChillerModModItems;
import net.mcreator.chillermod.init.ChillerModModBlocks;
import net.mcreator.chillermod.ChillerModMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WaterBongOnBlockRightClickedwithgroundWeedProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ChillerModModItems.GRINDED_WEED.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ChillerModModBlocks.WATER_BONG.get()) {
				ChillerModMod.queueServerWork(20, () -> {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ChillerModModItems.GRINDED_WEED.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					world.setBlock(BlockPos.containing(x, y, z), ChillerModModBlocks.WATER_BONG_WIT_GRASS.get().defaultBlockState(), 3);
				});
			}
		}
	}
}
