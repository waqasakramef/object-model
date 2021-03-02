package com.ef.cim.objectmodel;

public class AttachmentMessage {
    private String name;
    private String type;
    private long size;

    public AttachmentMessage() {
    }

    // Getters
    public String getName() {
        return this.name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AttachmentMessage{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}