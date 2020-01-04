package pw.kaboom.extras.modules.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;

public final class BlockCheck implements Listener {
	@EventHandler
	void onBlockPlace(final BlockPlaceEvent event) {
		try {
			final int maxItemStringLength = 3019;

			if (event.getItemInHand().toString().length() > maxItemStringLength) {
				event.setCancelled(true);
			}

			event.getBlockPlaced().getState();
		} catch (Exception exception) {
			event.setCancelled(true);
		}
	}

	@EventHandler
	void onSignChange(final SignChangeEvent event) {
		try {
			event.getLines();
		} catch (Exception exception) {
			event.setCancelled(true);
		}
	}
}