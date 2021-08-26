package com.ef.cim.objectmodel;

public class VideoMessage extends MultimediaMessage {

    // Constructor
    public VideoMessage(String caption, Attachment attachment) {
        super(MessageType.VIDEO, caption, attachment);
    }

    @Override
    public String toString() {
        return "VideoMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
