package com.ef.cim.objectmodel;

public class URL {
    private java.net.URL url;
    private String type;

    //Default Constructor
    public URL() {
    }

    //Parameterized Constructor

    public URL(java.net.URL url, String type) {
        this.url = url;
        this.type = type;
    }

    public java.net.URL getUrl() {
        return url;
    }

    public void setUrl(java.net.URL url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "URL{" +
                "url=" + url +
                ", type='" + type + '\'' +
                '}';
    }
}
