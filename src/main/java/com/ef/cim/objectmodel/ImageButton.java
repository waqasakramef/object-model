package com.ef.cim.objectmodel;

import java.net.URL;

public class ImageButton extends CarouselElementActions {
    private URL imageUrl;

    // Default Constructor
    public ImageButton() {
    }

    public ImageButton(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Getters
    public URL getImageUrl() {
        return this.imageUrl;
    }

    // Setters
    public void setImageUrl(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "ImageButton{" +
                "actionType='" + actionType + '\'' +
                ", actionBody='" + actionBody + '\'' +
                ", height=" + height +
                ", imageUrl=" + imageUrl +
                '}';
    }
}
