package com.ef.cim.objectmodel;

public class Organization {
    private String company;
    private String department;
    private String title;

    //Default Constructor
    public Organization() {
    }

    //Parameterized Constructor

    public Organization(String company, String department, String title) {
        this.company = company;
        this.department = department;
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
