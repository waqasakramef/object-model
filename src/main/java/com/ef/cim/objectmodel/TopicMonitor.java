package com.ef.cim.objectmodel;

import java.util.UUID;

public class TopicMonitor implements Participant {
    private UUID id;
    private final String displayName;

    private final String participantType;

    // Default Constructor
    public TopicMonitor() {
        this.id = UUID.randomUUID();
        this.displayName = "Topic Monitor: " + this.id.toString();
        this.participantType = "TopicMonitor";
    }

    // Getters
    public UUID getId() {
        return this.id;
    }

    public String getDisplayName() {
        return this.displayName;
    }


    public String getParticipantType() {
        return participantType;
    }

    public void setId(UUID id) { this.id = id; }
}
