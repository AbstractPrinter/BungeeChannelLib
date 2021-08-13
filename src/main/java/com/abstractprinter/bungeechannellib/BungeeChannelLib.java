package com.abstractprinter.bungeechannellib;

import com.abstractprinter.bungeechannellib.channel.BungeeChannelListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * @author AbstractPrinter
 */
public final class BungeeChannelLib extends JavaPlugin {
    private static Plugin instance;

    public static Plugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        Logger logger = this.getServer().getLogger();
        logger.info(
                "\n" +
                        " ____                              \n" +
                        "|  _ \\                             \n" +
                        "| |_) |_   _ _ __   __ _  ___  ___ \n" +
                        "|  _ <| | | | '_ \\ / _` |/ _ \\/ _ \\\n" +
                        "| |_) | |_| | | | | (_| |  __/  __/\n" +
                        "|____/ \\__,_|_| |_|\\__, |\\___|\\___|\n" +
                        "                    __/ |          \n" +
                        "                   |___/           \n" +
                        "  _____ _                            _ _      _ _     \n" +
                        " / ____| |                          | | |    (_) |    \n" +
                        "| |    | |__   __ _ _ __  _ __   ___| | |     _| |__  \n" +
                        "| |    | '_ \\ / _` | '_ \\| '_ \\ / _ \\ | |    | | '_ \\ \n" +
                        "| |____| | | | (_| | | | | | | |  __/ | |____| | |_) |\n" +
                        " \\_____|_| |_|\\__,_|_| |_|_| |_|\\___|_|______|_|_.__/ ");
        logger.info("Register BungeeChannel.");
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        this.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", new BungeeChannelListener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        this.getServer().getMessenger().unregisterIncomingPluginChannel(this, "BungeeCord");
    }
}
