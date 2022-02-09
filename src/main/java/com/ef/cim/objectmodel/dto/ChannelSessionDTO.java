package com.ef.cim.objectmodel.dto;

import java.util.UUID;

public class ChannelSessionDTO {


    private UUID topicParticipantId;
    private String providerWebhook;


    public UUID getTopicParticipantId() {
        return topicParticipantId;
    }

    public void setTopicParticipantId(UUID topicParticipantId) {
        this.topicParticipantId = topicParticipantId;
    }

    public String getProviderWebhook() {
        return providerWebhook;
    }

    public void setProviderWebhook(String providerWebhook) {
        this.providerWebhook = providerWebhook;
    }
}
