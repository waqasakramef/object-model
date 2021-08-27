package com.ef.cim.objectmodel;

public class Footer {

    private String text;

    public Footer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Footer{" +
                "text='" + text + '\'' +
                '}';
    }
}
