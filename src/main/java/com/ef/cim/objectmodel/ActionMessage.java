package com.ef.cim.objectmodel;

import java.util.UUID;

public class ActionMessage implements ICimMessage {
    private final UUID id;
    private MessageHeader header;
    private String actionName;

    public ActionMessage() {
        this.id = UUID.randomUUID();
    }

    public ActionMessage(String actionName) {
        this.id = UUID.randomUUID();
        this.actionName = actionName;
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
        return this.header;
    }

    @Override
    public void setHeader(MessageHeader header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "ActionMessage{" +
                "id=" + id +
                ", actionName='" + actionName + '\'' +
                ", header=" + header +
                '}';
    }
}
