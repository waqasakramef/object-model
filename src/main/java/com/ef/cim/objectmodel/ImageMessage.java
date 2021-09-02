package com.ef.cim.objectmodel;

import javax.validation.Valid;

public class ImageMessage extends MultimediaMessage {

    // Constructor
    public ImageMessage(String caption, @Valid Attachment attachment) {
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
