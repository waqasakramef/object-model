package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class Attribute implements Serializable {

    private String key;
    private ValueType type;
    private String value;

    public Attribute() {}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ValueType getType() {
        return type;
    }

    public void setType(ValueType type) {
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
                "key='" + key + '\'' +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
