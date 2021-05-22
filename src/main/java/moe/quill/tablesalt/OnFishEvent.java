package moe.quill.tablesalt;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

public class OnFishEvent implements Listener {

    @EventHandler
    public void fishEvent(PlayerFishEvent event) {
        final var player = event.getPlayer();
        if (!event.getState().equals(PlayerFishEvent.State.CAUGHT_FISH)) return;
        event.setCancelled(true);
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        player.getInventory().addItem(diamond);

    }
}
