package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.io.Serializable;
import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "participantType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = TopicMonitor.class, name = "TopicMonitor"),
        @JsonSubTypes.Type(value = ChannelSession.class, name = "ChannelSession")
})
public interface Participant extends Serializable {
    UUID getId();
    String getDisplayName();
}
