package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class Attribute implements Serializable {

    private UUID id;
    private String key;
    private String displayName;
    private boolean isRequired;
    private AttributeType type;
    private String value;

    public Attribute() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public AttributeType getType() {
        return type;
    }

    public void setType(AttributeType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", displayName='" + displayName + '\'' +
                ", isRequired=" + isRequired +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
