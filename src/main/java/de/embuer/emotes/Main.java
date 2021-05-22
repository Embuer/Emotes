package de.embuer.emotes;

import Listeners.ChatListener;
import de.embuer.emotes.Commands.EmotesCMD;
import de.embuer.emotes.Commands.LoademotesCMD;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        commandRegistration();
        listenerRegistration();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    private void listenerRegistration() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ChatListener(), this);
    }
    private void commandRegistration() {
        Objects.requireNonNull(getCommand("emotes")).setExecutor(new EmotesCMD());
        Objects.requireNonNull(getCommand("loademotes")).setExecutor(new LoademotesCMD());
    }
}
