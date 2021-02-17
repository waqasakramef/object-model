package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * A {@code ChannelSession} object represents a communication Session associated with a particular
 * channel for a customer. If there are 3 customers conversing on lets say the 'whatsapp' channel,
 * each customer will have their own channel session started. Likewise if there is a single customer
 * using more than one channels e.g. whatsapp and web, two channel sessions associated with the two
 * channels will be started for this customer.
 */


public class ChannelSession implements Participant {

  @Id
  private final UUID id;
  @Valid
  private Channel channel;
  @Valid
  private IdentifiedCustomer linkedCustomer;

  private List<Customer> customerSuggestions;
  @Valid
  private ChannelData channelData;
  private String latestIntent;
  private UndefinedObject customerPresence;
  @NotNull(message = "Is Active is Mandatory")
  private boolean isActive;
  @JsonIgnore
  private final String participantType;
  @NotBlank
  private UUID topicId;



  /**
   * Default Constructor, Sets an immutable Unique identifier for the channel session. Initializes all
   * the objects except the Strings. Initializes the List objects as empty lists. Sets the is channel
   * session active flag to {@code false}
   */
  public ChannelSession() {
    this.id = UUID.randomUUID();
    this.channel = new Channel();
    this.linkedCustomer = new IdentifiedCustomer();
    this.customerSuggestions = new ArrayList<Customer>();
    this.channelData = new ChannelData();
    this.customerPresence = new UndefinedObject();
    this.isActive = true;
    this.participantType = "ChannelSession";
  }

  /**
   * Returns the unique identifier of the channel session
   *
   * @return {@code UUID}
   */
  @Override
  public UUID getId() {
    return this.id;
  }

  @Override
  @JsonIgnore
  public String getDisplayName() {
    return "ChannelSession:" + this.id.toString();
  }
  /**
   * Returns the channel associated with the channel session
   *
   * @return {@code Channel}
   */
  public Channel getChannel() {
    return this.channel;
  }

  /**
   * Returns the customer associated with the channel session
   *
   * @return {@code Customer}
   */
  public IdentifiedCustomer getLinkedCustomer() {
    return this.linkedCustomer;
  }

  /**
   * Returns the list of customer suggestions for the channel session
   *
   * @return {@code List<Customer>}
   */
  public List<Customer> getCustomerSuggestions() {
    return this.customerSuggestions;
  }

  /**
   * Returns the channel specific data coming on the channel session This data is different for
   * different channels. e.g. browser id, language e.t.c are received on the web channel.
   *
   * @return {@code ChannelData}
   */
  public ChannelData getChannelData() {
    return this.channelData;
  }

  /**
   * Returns the latest intent for the channel session
   *
   * @return {@code String}
   */
  public String getLatestIntent() {
    return this.latestIntent;
  }

  /**
   * Returns the customer presence object of the channel session
   *
   * @return {@code Object} (not defined yet)
   */
  public UndefinedObject getCustomerPresence() {
    return this.customerPresence;
  }

  /**
   * Returns if the channel session is currently active or not.
   *
   * @return {@code boolean}
   */
  public boolean isActive() {
    return this.isActive;
  }

  /**
   * Sets the channel associated with the channel session
   *
   * @param channel, object of type {@code Channel}
   */
  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * Sets the customer associated with the channel session
   *
   * @param linkedCustomer, object of type {@code Customer}
   */
  public void setLinkedCustomer(IdentifiedCustomer linkedCustomer) {
    this.linkedCustomer = linkedCustomer;
  }

  /**
   * Sets the list of customer suggestions for the channel session
   *
   * @param customerSuggestions, object of type {@code List<Customer>}
   */
  public void setCustomerSuggestions(List<Customer> customerSuggestions) {
    this.customerSuggestions = customerSuggestions;
  }

  /**
   * Sets the channel data for the channel session
   *
   * @param channelData, object of type {@code ChannelData}
   */
  public void setChannelData(ChannelData channelData) {
    this.channelData = channelData;
  }

  /**
   * Sets the latest intent for the channel session
   *
   * @param latestIntent, object of type {@code String}
   */
  public void setLatestIntent(String latestIntent) {
    this.latestIntent = latestIntent;
  }

  /**
   * Sets the customer presence object of the channel session
   *
   * @param customerPresence, object of type {@code Object} (not defined yet)
   */
  public void setCustomerPresence(UndefinedObject customerPresence) {
    this.customerPresence = customerPresence;
  }

  /**
   * Sets whether the channel session is active or inactive
   *
   * @param active, of type {@code boolean}
   */
  public void setActive(boolean active) {
    this.isActive = active;
  }

  /**
   * Getter for topicId
   * @return topicId
   */
  public UUID getTopicId() {
    return topicId;
  }

  /**
   * Setter for topicId
   * @param topicId topicId
   */
  public void setTopicId(UUID topicId) {
    this.topicId = topicId;
  }

  /**
   * Adds a suggested customer to the list of customer suggestions
   *
   * @param customer, object of type {@code Customer}
   */
  public void addCustomerSuggestion(Customer customer) {
    if (this.customerSuggestions == null) {
      this.customerSuggestions = new ArrayList<Customer>();
    }
    this.customerSuggestions.add(customer);
  }

  /**
   * Takes a {@code Customer} object as input and removes it from the list of customer suggestions
   *
   * @param customer, Object of type {@code Customer}
   */
  public void removeCustomerSuggestion(Customer customer) {
    if (this.customerSuggestions != null) {
      this.customerSuggestions.remove(customer);
    }
  }

  /**
   * Takes an index as input and remove the object on that index from the list of customer
   * suggestions
   *
   * @param index, of type {@code int}
   */
  public void removeCustomerSuggestion(int index) {
    if (this.customerSuggestions != null) {
      this.customerSuggestions.remove(index);
    }
  }

  /***
   * String Representation of ChannelSession
   * @return String
   */
  @Override
  public String toString() {
    return "ChannelSession{" +
            "id=" + id +
            ", channel=" + channel +
            ", linkedCustomer=" + linkedCustomer +
            ", customerSuggestions=" + customerSuggestions +
            ", channelData=" + channelData +
            ", latestIntent='" + latestIntent + '\'' +
            ", customerPresence=" + customerPresence +
            ", isActive=" + isActive +
            '}';
  }
}
