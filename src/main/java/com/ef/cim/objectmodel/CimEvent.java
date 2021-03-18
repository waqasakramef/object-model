package com.ef.cim.objectmodel;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

public class CimEvent {


    private final UUID id;
    private CimEventName name;
    private CimEventType type;
    private Timestamp timestamp;
    private Object data;

    public CimEvent(UUID id) {
        this.id = UUID.randomUUID();
    }
    // Getters
    public UUID getId() { return id; }

    public CimEventName getName() { return name; }

    public CimEventType getType() { return type; }

    public Timestamp getTimestamp() { return timestamp; }

    public Object getData() { return data; }

    // Setters
    public void setName(CimEventName name) { this.name = name; }

    public void setType(CimEventType type) { this.type = type; }

    public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }

    public void setData(Object data) { this.data = data; }
}
