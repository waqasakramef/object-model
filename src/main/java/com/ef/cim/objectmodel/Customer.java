package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;
import javax.validation.constraints.NotEmpty;

public class Customer implements Serializable {
    private final UUID id;
    @NotEmpty(message = "Customer First Name is Mandatory")
    private String firstName;

    // Default Constructor
    public Customer() {
        this.id = UUID.randomUUID();
    }

    // Getters
    public UUID getId() {
        return this.id;
    }


    public String getFirstName() {
        return this.firstName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /***
     * String Representation of Customer
     * @return String
     */
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
