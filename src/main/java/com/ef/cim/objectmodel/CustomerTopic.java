package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerTopic implements Serializable {
    private final UUID id;
    private List<TopicParticipant> participants;
    private List<CimEvent> cimEvents;
    private TopicState state;

    // Default Constructor
    public CustomerTopic() {
        this.id = UUID.randomUUID();
        this.participants = new ArrayList<TopicParticipant>();
        this.cimEvents = new ArrayList<CimEvent>();
    }

    // Getters
    public UUID getId() {
        return this.id;
    }

    public List<CimEvent> getCimEvents() { return cimEvents; }

    public void setCimEvents(List<CimEvent> cimEvents) { this.cimEvents = cimEvents; }

    public List<TopicParticipant> getParticipants() {
        return this.participants;
    }

    public TopicState getState() { return this.state; }

    // Setters
    public void setParticipants(List<TopicParticipant> participants) {
        this.participants = participants;
    }

    public void setState(TopicState topicState) { this.state = topicState; }

    public void addParticipant(TopicParticipant participant) {
        if (this.participants == null) {
            this.participants = new ArrayList<TopicParticipant>();
        }
        this.participants.add(participant);
    }


    public void addCimEvent(CimEvent cimEvent) {
        if (this.cimEvents == null) {
            this.cimEvents = new ArrayList<CimEvent>();
        }
        this.cimEvents.add(cimEvent);
    }

    public void removeParticipant(TopicParticipant participant) {
        if (this.participants != null) {
            this.participants.remove(participant);
        }
    }

    public void removeParticipant(int index) {
        if (this.participants != null) {
            this.participants.remove(index);
        }
    }

    /***
     * String Representation of CustomerTopic
     * @return String
     */
    @Override
    public String toString() {
        return "CustomerTopic{" +
                "id=" + id +
                ", participants=" + participants +
                ", cimEvents=" + cimEvents +
                ", state=" + state +
                '}';
    }
}
