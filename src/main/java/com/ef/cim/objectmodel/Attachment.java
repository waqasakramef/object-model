package com.ef.cim.objectmodel;

import javax.validation.constraints.NotBlank;

public class Attachment {
    @NotBlank
    private String mediaUrl;
    private String thumbnail;
    private long size;

    public Attachment() {
    }

    // Getters
    public String getMediaUrl() {
        return this.mediaUrl;
    }

    // Setters
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + mediaUrl + '\'' +
                ", type='" + thumbnail + '\'' +
                ", size=" + size +
                '}';
    }
}