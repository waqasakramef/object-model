package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @Type(value = DeliveryNotification.class, name = "DELIVERYNOTIFICATION"),
        @Type(value = CustomMessage.class, name = "CUSTOM"),
        @Type(value = StructuredMessage.class, name = "StructuredMessage"),
        @Type(value = NotificationMessage.class, name = "NOTIFICATION"),
        @Type(value = MultimediaMessage.class, name = "MULTIMEDIA"),
        @Type(value = VideoMessage.class, name = "VIDEO"),
        @Type(value = ImageMessage.class, name = "IMAGE"),
        @Type(value = AudioMessage.class, name = "AUDIO"),
        @Type(value = FileMessage.class, name = "FILE"),
        @Type(value = ContactMessage.class, name = "CONTACT"),
        @Type(value = LocationMessage.class, name = "LOCATION"),
        @Type(value = CarouselMessage.class, name = "CAROUSEL"),
        @Type(value = ButtonMessage.class, name = "BUTTON"),
        @Type(value = MessageBody.class, name = "PLAIN"),
        @Type(value = ListMessage.class, name = "LIST"),
        @Type(value = UrlMessage.class, name = "URL"),
        @Type(value = StickerMessage.class, name = "STICKER"),
        @Type(value = ReceiptTemplateMessage.class, name = "RECEIPT"),
        @Type(value = TemplateMessage.class, name = "TEMPLATE")





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
     * @param type value of MessageType
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
