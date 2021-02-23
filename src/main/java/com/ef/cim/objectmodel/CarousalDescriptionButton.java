package com.ef.cim.objectmodel;

public class CarousalDescriptionButton extends CarouselElementActions {
    private String text;

    // Constructor --> Args: header, body
    public CarousalDescriptionButton() {
    }

    // Getters
    public String getText() {
        return this.text;
    }

    // Setters
    public void setText(String text) {
        this.text = text;
    }
}