package com.ef.cim.objectmodel;

import javax.validation.Valid;

public class AudioMessage extends MultimediaMessage{

    //Default Constructor
    public AudioMessage(String caption, @Valid Attachment attachment) {
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
