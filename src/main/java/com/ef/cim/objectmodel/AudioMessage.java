package com.ef.cim.objectmodel;

public class AudioMessage extends MultimediaMessage{

    //Default Constructor
    public AudioMessage(String caption, Attachment attachment) {
        super(MessageType.AUDIO, caption, attachment);
    }

    @Override
    public String toString() {
        return "AudioMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
