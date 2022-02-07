package com.abstractprinter.bungeechannellib.event;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author AbstractPrinter
 */
public class BungeeUUIDOtherEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();
    private final String playerName;
    private final String uuid;

    public BungeeUUIDOtherEvent(String playerName, String uuid) {
        this.playerName = playerName;
        this.uuid = uuid;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getUuid() {
        return uuid;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
