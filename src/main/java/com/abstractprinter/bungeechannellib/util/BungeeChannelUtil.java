package com.abstractprinter.bungeechannellib.util;

import com.abstractprinter.bungeechannellib.BungeeChannelLib;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * 获取数据的方法，请注册相应的"Listener"来接收数据。
 *
 * @author AbstractPrinter
 */
public class BungeeChannelUtil {
    private final static String CHANNEL_NAME = "BungeeCord";
    private final static Plugin PLUGIN = BungeeChannelLib.getInstance();

    /**
     * 使一个玩家连接到指定服务器.
     *
     * @param player           Player
     * @param targetServerName 你希望连接到的服务器名称，必须要在 BungeeCord 的配置文件（config.yml）内设置。
     */
    public static void connect(Player player, String targetServerName) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF(targetServerName);
        player.sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }


    /**
     * 使一个指定玩家连接到指定服务器.
     *
     * @param playerName       你希望传送的玩家名称
     * @param targetServerName 你希望连接到的服务器名称，必须要在 BungeeCord 的配置文件（config.yml）内设置。
     */
    public static void connectOther(String playerName, String targetServerName) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("ConnectOther");
        out.writeUTF(playerName);
        out.writeUTF(targetServerName);
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    /**
     * 获取某个服务器或者所有服务器的玩家数量
     *
     * @param targetServerName 你希望获取玩家数量的服务器名称，如果你希望获取所有服务器的玩家数量，使用 "ALL"
     */
    public static void playerCount(String targetServerName) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("PlayerCount");
        out.writeUTF(targetServerName);
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    /**
     * 获取某个服务器或者所有服务器的玩家名称
     *
     * @param targetServerName 你希望获取玩家名称的服务器名词，如果你希望获取全部服务器的玩家名称，使用 "ALL"
     */
    public static void playerList(String targetServerName) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("PlayerList");
        out.writeUTF(targetServerName);
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    /**
     * 获得当前服务器名称，必须在 BungeeCord 的配置文件（config.yml）内设置
     */
    public static void getServer() {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("GetServer");
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    /**
     * 获取所有服务器的名称, 必须要在 BungeeCord 的配置文件（config.yml）内设置
     */
    public static void getServers() {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("GetServers");
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    /**
     * 向指定玩家发送一个消息（比如聊天消息）
     *
     * @param playerName 需要发送消息的玩家名称
     * @param message    需要发送的消息内容
     */
    public static void sendMessageToPlayer(String playerName, String message) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Message");
        out.writeUTF(playerName);
        out.writeUTF(message);
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    /**
     * 获取指定玩家的UUID
     *
     * @param playerName 你需要获取UUID的玩家的名称
     */
    public static void uuidOther(String playerName) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("UUIDOther");
        out.writeUTF(playerName);
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    /**
     * 获取指定服务器在群组中的IP
     *
     * @param targetServerName 需要获取IP的服务器名称
     */
    public static void getServerIp(String targetServerName) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("ServerIP");
        out.writeUTF(targetServerName);
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }

    public static void kickPlayer(String playerName, String reason) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("KickPlayer");
        out.writeUTF(playerName);
        out.writeUTF(reason);
        PLUGIN.getServer().sendPluginMessage(PLUGIN, CHANNEL_NAME, out.toByteArray());
    }
}
