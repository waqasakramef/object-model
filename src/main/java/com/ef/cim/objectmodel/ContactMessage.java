package com.ef.cim.objectmodel;

public class ContactMessage extends StructuredMessage {
    private String name;
    private String phoneNumber;

    // Default Constructor
    public ContactMessage() {
        super(MessageType.CONTACT);
    }

    // Getters
    public String getName() {
        return this.name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactMessage{"
                +
                "name='" + name + '\''
                +
                ", phoneNumber='" + phoneNumber
                + '\''
                +
                ", type=" + type
                +
                ", markdownText='"
                + markdownText + '\''
                +
                '}';
    }
}
