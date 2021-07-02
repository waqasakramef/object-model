package com.ef.cim.objectmodel;

import java.net.URL;

public class LocationMessage extends StructuredMessage {
    private double latitude;
    private double longitude;
    private String name;
    private String address;

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
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    // Setters
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LocationMessage{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
