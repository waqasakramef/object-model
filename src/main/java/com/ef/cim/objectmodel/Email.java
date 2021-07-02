package com.ef.cim.objectmodel;

public class Email {
    private String email;
    private String type;

    //Default Constructor
    public Email() {
    }

    //Parameterized Constructor
    public Email(String email, String type) {
        this.email = email;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
