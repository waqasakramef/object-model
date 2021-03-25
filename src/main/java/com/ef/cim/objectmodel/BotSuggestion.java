package com.ef.cim.objectmodel;

import java.io.Serializable;

public class BotSuggestion implements Serializable {
    private MessageBody messageBody;
    private float confidenceLevel;

    public BotSuggestion() {

    }

    /**
     * Constructor
     *
     * @param body takes a {@code MessageBody} object.
     */
    public BotSuggestion(MessageBody body) {
        this.messageBody = body;
    }

    /**
     * Returns the message body of the Bot's suggestion
     *
     * @return {@code MessageBody}
     */
    public MessageBody getMessageBody() {
        return this.messageBody;
    }

    /**
     * Sets the message body for the Bot's suggestion
     *
     * @param messageBody object of type {@code MessageBody}
     */
    public void setMessageBody(MessageBody messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * Returns the confidence level of the Bot's suggestion.
     *
     * @return {@code float}
     */
    public float getConfidenceLevel() {
        return this.confidenceLevel;
    }

    /**
     * Sets the confidence level for the Bot's suggestion
     *
     * @param confidenceLevel of type {@code float}
     */
    public void setConfidenceLevel(float confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    /**
     * Converts the {@code BotSuggestion} object to string
     *
     * @return {@code String}
     */
    @Override
    public String toString() {
        return "BotSuggestion{"
                + "messageBody="
                + messageBody.toString()
                + ", confidenceLevel="
                + confidenceLevel
                + '}';
    }
}
