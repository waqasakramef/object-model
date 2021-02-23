package com.ef.cim.objectmodel;

import java.util.UUID;

public class ActionMessage implements ICimMessage {
    private String actionName;
    private final UUID id;

    // Default Constructor
    public ActionMessage(String actionName) {
        this.actionName = actionName;
        this.id = UUID.randomUUID();
    }

    // Getters
    public String getActionName() {
        return this.actionName;
    }
    // public void serActionData(JSONObject actionData) {
    //   this.actionData = actionData;
    // }

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
}
