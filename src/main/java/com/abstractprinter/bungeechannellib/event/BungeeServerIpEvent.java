package com.abstractprinter.bungeechannellib.event;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author AbstractPrinter
 */
public class BungeeServerIpEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final String serverName;
    private final String serverIp;
    private final int port;

    public BungeeServerIpEvent(String serverName, String serverIp, int port) {
        this.serverName = serverName;
        this.serverIp = serverIp;
        this.port = port;
    }

    public String getServerName() {
        return serverName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public int getPort() {
        return port;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
