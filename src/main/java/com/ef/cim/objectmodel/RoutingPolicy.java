package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class RoutingPolicy implements Serializable {
  private UUID queueID;
  PolicyType policy;

  // Constructor
  public RoutingPolicy() {
    this.queueID = UUID.randomUUID();
  }

  // Getters
  public UUID getQueueID() {
    return this.queueID;
  }

  public PolicyType getPolicy() {
    return policy;
  }

  public void setPolicy(PolicyType policy) {
    this.policy = policy;
  }
  /***
   * String Representation of RoutingPolicy
   * @return String
   */
  @Override
  public String toString() {
    return "RoutingPolicy{" +
            "queueID=" + queueID +
            ", policy=" + policy +
            '}';
  }
}
