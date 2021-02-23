package com.ef.cim.objectmodel;

import java.io.Serializable;

public class KeyValuePair implements Serializable {
    private String key;
    private String value;

    /**
     * Default Constructor
     */
    public KeyValuePair() {
    }

    /**
     * Constructor
     *
     * @param key
     * @param value
     */
    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for key field.
     *
     * @return String object
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Setter key field.
     *
     * @param key String object
     */
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * toString method for displaying, logging.
     *
     * @return String object.
     */
    @Override
    public String toString() {
        return "Attribute{" + "key='" + key + '\'' + ", value='" + value + '\'' + '}';
    }
}
