package com.ef.cim.objectmodel;

public class Phone {
    private String phone;
    private String type;

    //Default Constructor
    public Phone() {
    }

    //Parameterized Constructor

    public Phone(String phone, String type) {
        this.phone = phone;
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
