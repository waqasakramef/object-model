package com.ef.cim.objectmodel;

import java.net.URL;

public class ImageMessage extends MultimediaMessage {
    private long size;

    // Constructor
    public ImageMessage(URL media) {
        super(MessageType.IMAGE, media);
    }

    public ImageMessage(URL media,long size){
        super(MessageType.IMAGE,media);
        this.size = size;
    }

    // Getters
    public long getSize() {
        return this.size;
    }

    // Setters
    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ImageMessage{" +
                "size=" + size +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", media=" + media +
                '}';
    }
}
