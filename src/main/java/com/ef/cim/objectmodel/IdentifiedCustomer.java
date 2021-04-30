package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class IdentifiedCustomer implements Serializable {
    private boolean isAnonymous;
    private Customer associatedCustomer;
    private UUID lastAssignedAgent;

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

    public UUID getLastAssignedAgent() {
        return lastAssignedAgent;
    }

    public void setLastAssignedAgent(UUID lastAssignedAgent) {
        this.lastAssignedAgent = lastAssignedAgent;
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
                ", lastAssignedAgent=" + lastAssignedAgent +
                '}';
    }
}
