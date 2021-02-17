package com.ef.cim.objectmodel;

import java.io.Serializable;

public class MessageBody implements Serializable {
  protected MessageType type;
  protected String markdownText;

  public MessageBody() {
    this.type = MessageType.PLAIN;
  }

  /**
   * Default Constructor
   *
   * @param type
   */
  protected MessageBody(MessageType type) {
    this.type = type;
  }

  // Getters
  public MessageType getType() {
    return this.type;
  }

  public String getMarkdownText() {
    return this.markdownText;
  }

  // Setters
  public void setMarkdownText(String markdownText) {
    this.markdownText = markdownText;
  }

  /***
   * String Representation of MessageBody
   * @return String
   */
  @Override
  public String toString() {
    return "MessageBody{" +
            "type=" + type +
            ", markdownText='" + markdownText + '\'' +
            '}';
  }
}
