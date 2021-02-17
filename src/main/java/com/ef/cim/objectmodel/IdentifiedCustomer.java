package com.ef.cim.objectmodel;

import java.io.Serializable;

public class IdentifiedCustomer implements Serializable {
    private boolean isAnonymous;
    private Customer associatedCustomer;

    public IdentifiedCustomer() {
        this.isAnonymous = false;
    }

    public boolean getIsAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Customer getAssociatedCustomer() {
        return associatedCustomer;
    }

    public void setAssociatedCustomer(Customer associatedCustomer) {
        this.associatedCustomer = associatedCustomer;
    }

    /***
     * String Representation of IdentifiedCustomer
     * @return String
     */
    @Override
    public String toString() {
        return "IdentifiedCustomer{" +
                "isAnonymous=" + isAnonymous +
                ", associatedCustomer=" + associatedCustomer +
                '}';
    }
}
