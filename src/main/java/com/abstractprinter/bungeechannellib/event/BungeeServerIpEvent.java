package com.abstractprinter.bungeechannellib.event;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author AbstractPrinter
 */
public class BungeeServerIpEvent extends Event {
    private static HandlerList handlerList = new HandlerList();
    private String serverName;
    private String serverIp;
    private int port;

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
