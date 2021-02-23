package com.ef.cim.objectmodel;

import java.net.URL;

public class VideoMessage extends MultimediaMessage {
    private URL thumbnail;
    private long size;
    private int length;

    // Constructor
    public VideoMessage(URL media, URL thumbnail) {
        super(MessageType.VIDEO, media);
        this.thumbnail = thumbnail;
    }

    // Getters
    public URL getThumbnail() {
        return this.thumbnail;
    }

    // Setters
    public void setThumbnail(URL thumbnail) {
        this.thumbnail = thumbnail;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
