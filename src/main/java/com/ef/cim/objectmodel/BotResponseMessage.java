package com.ef.cim.objectmodel;

public class BotResponseMessage {
    private ChannelType channelType;
    private ParticipantRole participantRole;
    private ICimMessage message;

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public void setParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole;
    }

    public void setICimMessage(ICimMessage message) {
        this.message = message;
    }

    public ChannelType getChannelType() {
        return this.channelType;
    }

    public ParticipantRole getParticipantRole() {
        return this.participantRole;
    }

    public ICimMessage getICimMessage() {
        return this.message;
    }
}