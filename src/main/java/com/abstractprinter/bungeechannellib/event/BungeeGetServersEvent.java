package com.abstractprinter.bungeechannellib.event;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Arrays;
import java.util.List;

/**
 * @author AbstractPrinter
 */
public class BungeeGetServersEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final List<String> serverList;

    public BungeeGetServersEvent(String[] serverList) {
        this.serverList = Arrays.asList(serverList);
    }

    public List<String> getServerList() {
        return serverList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
