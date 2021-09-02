package com.ef.cim.objectmodel;

import javax.validation.Valid;

public class FileMessage extends MultimediaMessage {

    //Constructor
    public FileMessage(String caption, @Valid Attachment attachment) {
        super(MessageType.FILE, caption, attachment);
    }


    @Override
    public String toString() {
        return "FileMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
