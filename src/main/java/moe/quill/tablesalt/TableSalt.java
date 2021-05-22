package moe.quill.tablesalt;

import org.bukkit.plugin.java.JavaPlugin;

public final class TableSalt extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        final var pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new OnFishEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
