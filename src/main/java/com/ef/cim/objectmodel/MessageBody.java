package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @Type(value = DeliveryNotification.class, name = "DELIVERYNOTIFICATION"),
        @Type(value = StructuredMessage.class, name = "StructuredMessage"),
        @Type(value = MultimediaMessage.class, name = "MULTIMEDIA"),
        @Type(value = VideoMessage.class, name = "VIDEO"),
        @Type(value = ImageMessage.class, name = "IMAGE"),
        @Type(value = AudioMessage.class, name = "AUDIO"),
        @Type(value = FileMessage.class, name = "FILE"),
        @Type(value = ContactMessage.class, name = "CONTACT"),
        @Type(value = LocationMessage.class, name = "LOCATION"),
        @Type(value = CarousalMessage.class, name = "CAROUSAL"),
        @Type(value = ButtonMessage.class, name = "BUTTON"),
        @Type(value = MessageBody.class, name = "PLAIN")
})
public class MessageBody implements Serializable {
    @NotNull
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
