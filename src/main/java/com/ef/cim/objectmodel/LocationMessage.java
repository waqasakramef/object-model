package com.ef.cim.objectmodel;

public class LocationMessage extends StructuredMessage {
  private double latitude;
  private double longitude;

  // Default Constructor
  public LocationMessage() {
    super(MessageType.LOCATION);
  }

  // Getters
  public double getLatitude() {
    return this.latitude;
  }

  public double getLongitude() {
    return this.longitude;
  }

  // Setters
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
}
