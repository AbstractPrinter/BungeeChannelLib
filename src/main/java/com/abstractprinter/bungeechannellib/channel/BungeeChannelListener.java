package com.abstractprinter.bungeechannellib.channel;

import com.abstractprinter.bungeechannellib.BungeeChannelLib;
import com.abstractprinter.bungeechannellib.event.*;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.messaging.PluginMessageListener;

/**
 * @author AbstractPrinter
 */
public class BungeeChannelListener implements PluginMessageListener {
    private final static String CHANNEL_NAME = "BungeeCord";
    private final Plugin plugin = BungeeChannelLib.getInstance();
    private final PluginManager pluginManager = plugin.getServer().getPluginManager();

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        if (!CHANNEL_NAME.equals(channel)) {
            return;
        }
        ByteArrayDataInput in = ByteStreams.newDataInput(message);
        String subChannel = in.readUTF();
        switch (subChannel) {
            case "PlayerCount":
                pluginManager.callEvent(new BungeePlayerCountEvent(in.readUTF(), in.readInt()));
                break;
            case "PlayerList":
                pluginManager.callEvent(new BungeePlayerListEvent(in.readUTF(), in.readUTF().split(", ")));
                break;
            case "GetServers":
                pluginManager.callEvent(new BungeeGetServersEvent(in.readUTF().split(", ")));
                break;
            case "GetServer":
                pluginManager.callEvent(new BungeeGetServerEvent(in.readUTF()));
                break;
            case "UUIDOther":
                pluginManager.callEvent(new BungeeUUIDOtherEvent(in.readUTF(), in.readUTF()));
                break;
            case "ServerIP":
                pluginManager.callEvent(new BungeeServerIpEvent(in.readUTF(), in.readUTF(), in.readInt()));
                break;
            default:
        }
    }
}
