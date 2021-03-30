package com.ef.cim.objectmodel;

import java.util.List;

public class BotResponse {
    private NLUIntent intent;
    private List<BotResponseMessage> messages;

    public NLUIntent getIntent() {
        return this.intent;
    }

    public void setIntent(NLUIntent intent) {
        this.intent = intent;
    }

    public List<BotResponseMessage> getMessages() {
        return this.messages;
    }

    public void setMessages(List<BotResponseMessage> messages) {
        this.messages = messages;
    }
}
