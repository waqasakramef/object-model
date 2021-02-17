package com.ef.cim.objectmodel;

import java.util.UUID;

public class Agent implements Participant{
    private final UUID id;
    private String displayName;

    public Agent(){
        this.id = UUID.randomUUID();
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
