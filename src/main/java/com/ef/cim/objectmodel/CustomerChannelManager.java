package com.ef.cim.objectmodel;

import java.util.UUID;

public class CustomerChannelManager implements Participant{
    private UUID id;
    private String displayName;

    // Default Constructor
    public CustomerChannelManager(UUID id, String displayName) {
        this.id =id;
        this.displayName = displayName;
    }
    public CustomerChannelManager() {
        this.id = UUID.randomUUID();
    }


    //Setters
    public void setId(UUID id){
        this.id=id;
    }
    public void setDisplayName(String displayName){
        this.displayName=displayName;
    }

    // Getters
    public UUID getId() {
        return this.id;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
