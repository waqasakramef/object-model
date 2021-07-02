package com.ef.cim.objectmodel;

import java.net.URL;

public class AudioMessage extends MultimediaMessage{
    private long size;

    //Default Constructor
    public AudioMessage(URL media) {
        super(MessageType.AUDIO, media);
    }

    public AudioMessage(URL media,long size) {
        super(MessageType.AUDIO,media);
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AudioMessage{" +
                "size=" + size +
                '}';
    }
}
