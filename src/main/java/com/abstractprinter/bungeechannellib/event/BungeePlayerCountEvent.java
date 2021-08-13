package com.abstractprinter.bungeechannellib.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author AbstractPrinter
 */
public class BungeePlayerCountEvent extends Event {
    private static HandlerList handlerList = new HandlerList();
    private String serverName;
    private int playerCount;

    public BungeePlayerCountEvent(String serverName, int playerCount) {
        this.serverName = serverName;
        this.playerCount = playerCount;
    }

    public String getServerName() {
        return serverName;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
