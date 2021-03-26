package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SuggestionMessage implements ICimMessage {
    private final UUID id;
    private MessageHeader header;
    private List<BotSuggestion> suggestions;
    private CimMessage requestedMessage;

    // Default Constructor
    public SuggestionMessage() {
        this.id = UUID.randomUUID();
        this.suggestions = new ArrayList<>();
    }

    // Getters
    public UUID getId() {
        return this.id;
    }

    public MessageHeader getHeader() {
        return this.header;
    }

    // Setters
    public void setHeader(MessageHeader header) {
        this.header = header;
    }

    public List<BotSuggestion> getSuggestions() {
        if (this.suggestions == null) {
            this.suggestions = new ArrayList<>();
        }
        return this.suggestions;
    }

    public void setSuggestions(List<BotSuggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public void addSuggestion(BotSuggestion suggestion) {
        if (this.suggestions == null) {
            this.suggestions = new ArrayList<>();
        }
        this.suggestions.add(suggestion);
    }

    public void removeSuggestion(BotSuggestion suggestion) {
        if (this.suggestions != null) {
            this.suggestions.remove(suggestion);
        }
    }

    public void removeSuggestion(int index) {
        if (this.suggestions != null) {
            this.suggestions.remove(index);
        }
    }

    public CimMessage getRequestedMessage() {
        return requestedMessage;
    }

    public void setRequestedMessage(CimMessage requestedMessage) {
        this.requestedMessage = requestedMessage;
    }

    @Override
    public String toString() {
        return "SuggestionMessage{" +
                "id=" + id +
                ", header=" + header +
                ", suggestions=" + suggestions +
                ", requestedMessage=" + requestedMessage +
                '}';
    }
}
