package com.ef.cim.objectmodel;

import javax.validation.constraints.NotBlank;

public class Attachment {
    @NotBlank
    private String mediaUrl;
    private String thumbnail;
    private String mimeType;
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

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "mediaUrl='" + mediaUrl + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", size=" + size +
                '}';
    }
}