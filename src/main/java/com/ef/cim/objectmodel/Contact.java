package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private List<Address> addresses;
    private String birthday;
    private List<Email> emails;
    private Name name;
    private Organization org;
    private List<Phone> phones;
    private List<URL> urls;

    public Contact() {
        addresses = new ArrayList<>();
        emails = new ArrayList<>();
        urls = new ArrayList<>();
    }

    public Contact(List<Address> addresses, String birthday, List<Email> emails, Name name,
            Organization organization, List<Phone> phones, List<URL> urls) {
        this.addresses = addresses;
        this.birthday = birthday;
        this.emails = emails;
        this.name = name;
        this.org = organization;
        this.phones = phones;
        this.urls = urls;
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

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
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
        return "Contact{" +
                "addresses=" + addresses +
                ", birthday='" + birthday + '\'' +
                ", emails=" + emails +
                ", name=" + name +
                ", organization=" + org +
                ", phones=" + phones +
                ", urls=" + urls +
                '}';
    }
}
