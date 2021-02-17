package com.ef.cim.objectmodel;

import java.net.URL;

public class MultimediaMessage extends StructuredMessage {
  protected URL media;

  // Default Constructor
  public MultimediaMessage(URL media) {
    super(MessageType.MULTIMEDIA);
    this.media = media;
  }

  // Constructor 1
  protected MultimediaMessage(MessageType type, URL media) {
    super(type);
    this.media = media;
  }

  // Getters
  public URL getMedia() {
    return this.media;
  }

  // Setters
  public void setMedia(URL media) {
    this.media = media;
  }
}
