package com.ef.cim.objectmodel;

public class CarouselElementActions {
  protected String actionType;
  protected String actionBody;
  protected int height;

  // Default Constructor
  public CarouselElementActions() {}

  // Getters
  public String getActionType() {
    return this.actionType;
  }
  public String getActionBody() {
    return this.actionBody;
  }
  public int getHeight() {
    return this.height;
  }

  // Setters
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }
  public void setActionBody(String actionBody) {
    this.actionBody = actionBody;
  }
  public void setHeight(int height) {
    this.height = height;
  }
}
