package com.ef.cim.objectmodel;

public class CarouselElementActions {
    protected String actionType;
    protected String actionBody;
    protected int height;

    // Default Constructor
    public CarouselElementActions() {
    }

    // Getters
    public String getActionType() {
        return this.actionType;
    }

    // Setters
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionBody() {
        return this.actionBody;
    }

    public void setActionBody(String actionBody) {
        this.actionBody = actionBody;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "CarouselElementActions{" +
                "actionType='" + actionType + '\'' +
                ", actionBody='" + actionBody + '\'' +
                ", height=" + height +
                '}';
    }
}
