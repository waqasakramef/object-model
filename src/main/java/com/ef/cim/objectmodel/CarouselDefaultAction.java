package com.ef.cim.objectmodel;

import java.net.URL;

public class CarouselDefaultAction {
    private String type;
    private URL url;

    // Default Constructor
    public CarouselDefaultAction() {
    }

    // Getters
    public String getType() {
        return this.type;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public URL getUrl() {
        return this.url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
