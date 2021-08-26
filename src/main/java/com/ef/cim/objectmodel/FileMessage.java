package com.ef.cim.objectmodel;

public class FileMessage extends MultimediaMessage {

    //Constructor
    public FileMessage(String caption, Attachment attachment) {
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
