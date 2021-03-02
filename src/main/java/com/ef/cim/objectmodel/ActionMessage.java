package com.ef.cim.objectmodel;

import java.util.UUID;

public class ActionMessage implements ICimMessage {
    private final UUID id;
    private String actionName;

    // Default Constructor
    public ActionMessage(String actionName) {
        this.actionName = actionName;
        this.id = UUID.randomUUID();
    }

    // Getters
    public String getActionName() {
        return this.actionName;
    }

    // Setters
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public MessageHeader getHeader() {
        return null;
    }

    @Override
    public void setHeader(MessageHeader header) {
    }

    @Override
    public String toString() {
        return "ActionMessage{"
                + "id=" + id
                + ", actionName='" + actionName + '\''
                + '}';
    }
}
