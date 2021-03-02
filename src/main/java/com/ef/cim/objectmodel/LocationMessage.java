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

    // Setters
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "LocationMessage{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                '}';
    }
}
