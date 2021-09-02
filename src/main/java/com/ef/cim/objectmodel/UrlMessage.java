package com.ef.cim.objectmodel;

import javax.validation.constraints.NotBlank;

public class UrlMessage extends StructuredMessage {

    private String mediaUrl;

    //default constructor
    public UrlMessage(@NotBlank String mediaUrl) {
        super(MessageType.URL);
        this.mediaUrl = mediaUrl;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Override
    public String toString() {
        return "UrlMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                ", mediaUrl='" + mediaUrl + '\'' +
                '}';
    }
}
