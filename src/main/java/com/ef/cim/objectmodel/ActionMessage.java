package com.ef.cim.objectmodel;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ActionMessage implements ICimMessage {
    private final UUID id;
    private MessageHeader header;
    private String name;
    private Map<String, Object> data;

    public ActionMessage() {
        this.id = UUID.randomUUID();
        this.data = new HashMap<>();
    }

    public ActionMessage(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.data = new HashMap<>();
    }

    // Getters
    public String getName() {
        return this.name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
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

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ActionMessage{" +
                "id=" + id +
                ", header=" + header +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
