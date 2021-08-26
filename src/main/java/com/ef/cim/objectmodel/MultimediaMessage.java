package com.ef.cim.objectmodel;

public class MultimediaMessage extends StructuredMessage {

    protected String caption;
    protected Attachment attachment;

    // Default Constructor
    public MultimediaMessage(String caption, Attachment attachment) {
        super(MessageType.MULTIMEDIA);
        this.caption = caption;
        this.attachment = attachment;
    }

    // parameterized constructor
    protected MultimediaMessage(MessageType type, String caption, Attachment attachment) {
        super(type);
        this.caption = caption;
        this.attachment = attachment;
    }


    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "MultimediaMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", caption='" + caption + '\'' +
                ", attachment=" + attachment +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
