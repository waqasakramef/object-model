package com.ef.cim.objectmodel;

public class Header {

    private String type;
    private String text;

    public Header() {
    }

    public Header(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Header{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
