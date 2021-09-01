package com.ef.cim.objectmodel;

public class ImageMessage extends MultimediaMessage {

    // Constructor
    public ImageMessage(String caption, Attachment attachment) {
        super(MessageType.IMAGE, caption, attachment);
    }

    @Override
    public String toString() {
        return "ImageMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
