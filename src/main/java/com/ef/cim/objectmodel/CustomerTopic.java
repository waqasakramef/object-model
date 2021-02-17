package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerTopic implements Serializable {
  private final UUID id;
  private List<TopicParticipant> participants;
  private List<CimMessage> messages;

  // Default Constructor
  public CustomerTopic() {
    this.id = UUID.randomUUID();
    this.participants = new ArrayList<TopicParticipant>();
    this.messages = new ArrayList<CimMessage>();
  }

  // Getters
  public UUID getId() {
    return this.id;
  }
  public List<CimMessage> getMessages() { return messages; }
  public List<TopicParticipant> getParticipants() {
    return this.participants;
  }

  // Setters
  public void setParticipants(List<TopicParticipant> participants) {
    this.participants = participants;
  }
  public void setMessages(List<CimMessage> messages) { this.messages = messages; }

  public void addParticipant(TopicParticipant participant) {
    if (this.participants == null) {
      this.participants = new ArrayList<TopicParticipant>();
    }
    this.participants.add(participant);
  }


  public void addMessage(CimMessage message) {
    if (this.messages == null) {
      this.messages = new ArrayList<CimMessage>();
    }
    this.messages.add(message);
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
            ", messages=" + messages +
            '}';
  }
}
