package com.abstractprinter.bungeechannellib.event;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author AbstractPrinter
 */
public class BungeeGetServerEvent extends Event {
    private static HandlerList handlerList = new HandlerList();
    private String serverName;

    public BungeeGetServerEvent(String serverName) {
        this.serverName = serverName;
    }

    public String getServerName() {
        return serverName;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
