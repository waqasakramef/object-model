package com.ef.cim.objectmodel;

import javax.validation.constraints.NotBlank;

public class Body {

    @NotBlank(message = "text is mandatory")
    private String text;

    public Body() {
    }

    public Body(String text) {
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
        return "Body{" +
                "text='" + text + '\'' +
                '}';
    }
}
