package com.ef.cim.objectmodel;

import java.util.List;

public class BotResponse {
    private NLUIntent intent;
    private List<ICimMessage> messages;

    public NLUIntent getIntent() {
        return this.intent;
    }

    public void setIntent(NLUIntent intent) {
        this.intent = intent;
    }

    public List<ICimMessage> getMessages() {
        return this.messages;
    }

    public void setMessages(List<ICimMessage> messages) {
        this.messages = messages;
    }
}
