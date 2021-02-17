package com.ef.cim.objectmodel;

import java.net.URL;

public class FileMessage extends MultimediaMessage {
  private String fileName;
  private long size;
  private AttachmentMessage attachmentMessage;

  public FileMessage(URL media) {
    super(MessageType.FILE, media);
    attachmentMessage = new AttachmentMessage();
  }

  // Getters
  public String getFileName() {
    return this.fileName;
  }

  public long getSize() {
    return this.size;
  }

  public AttachmentMessage getAttachmentMessage() {
    return this.attachmentMessage;
  }

  // Setters
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public void setSize(long size) {
    this.size = size;
  }

  public void setAttachmentMessage(AttachmentMessage attachmentMessage) {
    this.attachmentMessage = attachmentMessage;
  }
}
