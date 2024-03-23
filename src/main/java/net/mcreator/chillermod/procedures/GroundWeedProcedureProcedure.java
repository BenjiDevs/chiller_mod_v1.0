package net.mcreator.chillermod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GroundWeedProcedureProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 1 && itemstack.is(ItemTags.create(new ResourceLocation("chiller_mod:marijuanleaf")))) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ChillerModModItems.GRINDED_WEED.get());
				_setstack.setCount(6);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ChillerModModItems.KEEF.get());
				_setstack.setCount(2);
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
