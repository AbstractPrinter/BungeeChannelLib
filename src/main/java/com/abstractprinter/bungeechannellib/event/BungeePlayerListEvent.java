package com.abstractprinter.bungeechannellib.event;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Arrays;
import java.util.List;

/**
 * @author AbstractPrinter
 */
public class BungeePlayerListEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final String serverName;
    private final List<String> playerList;

    public BungeePlayerListEvent(String serverName, String[] playerList) {
        this.serverName = serverName;
        this.playerList = Arrays.asList(playerList);
    }

    public String getServerName() {
        return serverName;
    }

    public List<String> getPlayerList() {
        return playerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
