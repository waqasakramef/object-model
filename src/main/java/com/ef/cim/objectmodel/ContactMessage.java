package com.ef.cim.objectmodel;

import java.util.List;

public class ContactMessage extends StructuredMessage {

    private List<Address> addresses;
    private String birthday;
    private List<Email> emails;
    private Name name;
    private Organization organization;
    private List<Phone> phones;
    private List<URL> urls;



    // Default Constructor
    public ContactMessage() {
        super(MessageType.CONTACT);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<URL> getUrls() {
        return urls;
    }

    public void setUrls(List<URL> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "ContactMessage{" +
                "addresses=" + addresses +
                ", birthday='" + birthday + '\'' +
                ", emails=" + emails +
                ", name=" + name +
                ", organization=" + organization +
                ", phones=" + phones +
                ", urls=" + urls +
                '}';
    }
}
