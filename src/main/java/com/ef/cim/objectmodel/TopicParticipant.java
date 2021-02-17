package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class TopicParticipant implements Serializable {
  private final UUID id;
  private ParticipantType type;
  private ParticipantRole role;
  private Participant participant;
  private Timestamp joiningTime;
  private String token;
  private UUID topicId;
  private UserCredentials userCredentials; // Class UserCredentials Empty | not in object model

  // Constructor
  public TopicParticipant(@JsonProperty("type") ParticipantType type, @JsonProperty("role") ParticipantRole role, @JsonProperty("participant") Participant participant) {
    this.id = UUID.randomUUID();
    this.type = type;
    this.role = role;
    this.participant = participant;

    // TODO: review/discuss if initialization time is indeed the join time?
    this.joiningTime = new Timestamp(System.currentTimeMillis());
//    this.topic = new CustomerTopic();
    this.userCredentials = new UserCredentials();
  }

  // Getters
  public UUID getId() {
    return this.id;
  }

  public ParticipantType getType() {
    return this.type;
  }

  public ParticipantRole getRole() {
    return this.role;
  }

  public Participant getParticipant() {
    return this.participant;
  }

  public Timestamp getJoiningTime() {
    return this.joiningTime;
  }

  public String getToken() {
    return this.token;
  }

  public UserCredentials getUserCredentials() {
    return this.userCredentials;
  }

  public UUID getTopicId() { return topicId; }

  // Setters

  public void setType(ParticipantType type) {
    this.type = type;
  }

  public void setRole(ParticipantRole role) {
    this.role = role;
  }

  public void setParticipant(Participant participant) {
    this.participant = participant;
  }

  public void setJoiningTime(Timestamp joiningTime) {
    this.joiningTime = joiningTime;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public void setTopicId(UUID topicId) { this.topicId = topicId; }

  public void setUserCredentials(UserCredentials userCredentials) {
    this.userCredentials = userCredentials;
  }

  /***
   * String Representation of TopicParticipant
   * @return String
   */
  @Override
  public String toString() {
    return "TopicParticipant{" +
            "id=" + id +
            ", type=" + type +
            ", role=" + role +
            ", participant=" + participant +
            ", joiningTime=" + joiningTime +
            ", token='" + token + '\'' +
            ", topicId=" + topicId +
            ", userCredentials=" + userCredentials +
            '}';
  }
}
