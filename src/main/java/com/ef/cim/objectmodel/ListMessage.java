package com.ef.cim.objectmodel;

import javax.validation.Valid;

public class ListMessage extends StructuredMessage {

    @Valid
    private Interactive interactive;

    public ListMessage( Interactive interactive) {
        super(MessageType.LIST);
        this.interactive = interactive;
    }

    //Default Constructor
    public ListMessage() {
        super(MessageType.LIST);
    }

    public Interactive getInteractive() {
        return interactive;
    }

    public void setInteractive(Interactive interactive) {
        this.interactive = interactive;
    }

    @Override
    public String toString() {
        return "ListMessage{" +
                "interactive=" + interactive +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
