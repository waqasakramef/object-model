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

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
