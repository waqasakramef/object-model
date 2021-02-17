package com.ef.cim.objectmodel;

import javax.validation.Valid;
import java.util.UUID;

public class CimMessage implements ICimMessage {
  private final UUID id;
  @Valid
  private MessageHeader header;
  private MessageBody body;

  // Constructor --> Args: header, body
  public CimMessage(MessageHeader header, MessageBody body) {
    this.id = UUID.randomUUID();
    this.header = header;
    this.body = body;
  }

  // Getters
  public UUID getId() {
    return this.id;
  }

  public MessageHeader getHeader() {
    return this.header;
  }

  public MessageBody getBody() {
    return this.body;
  }

  // Setters
  public void setHeader(MessageHeader header) {
    this.header = header;
  }

  public void setBody(MessageBody body) {
    this.body = body;
  }

  /***
   * String Representation of CimMessage
   * @return String
   */
  @Override
  public String toString() {
    return "CimMessage{" +
            "id=" + id +
            ", header=" + header +
            ", body=" + body +
            '}';
  }
}
