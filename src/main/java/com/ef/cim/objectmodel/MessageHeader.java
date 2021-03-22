package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

public class MessageHeader implements Serializable {
    private TopicParticipant sender;
    @Valid
    private ChannelData channelData;
    private LanguageCode language; // Class LanguageCode Empty | not in object model
    private Timestamp timestamp;
    private MessageSecurity securityInfo; // Class MessageSecurity Empty | not in object model
    private List<String> stamps;
    private NLUIntent intent;
    private Map<String, Object> entities;
    private ChannelSession channelSession;

    // Default Constructor
    public MessageHeader() {
        //this.channelData = new new Ch
        this.language = new LanguageCode();
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.securityInfo = new MessageSecurity();
        this.stamps = new ArrayList<String>();
        this.entities = new HashMap<String, Object>();
        this.channelSession = new ChannelSession();
    }

    // Getters
    public TopicParticipant getSender() {
        return this.sender;
    }

    // Setters
    public void setSender(TopicParticipant sender) {
        this.sender = sender;
    }

    public ChannelData getChannelData() {
        return this.channelData;
    }

    public void setChannelData(ChannelData channelData) {
        this.channelData = channelData;
    }

    public LanguageCode getLanguage() {
        return this.language;
    }

    public void setLanguage(LanguageCode language) {
        this.language = language;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public MessageSecurity getSecurityInfo() {
        return this.securityInfo;
    }

    public void setSecurityInfo(MessageSecurity securityInfo) {
        this.securityInfo = securityInfo;
    }

    public List<String> getStamps() {
        return this.stamps;
    }

    public void setStamps(List<String> stamps) {
        this.stamps = stamps;
    }

    public NLUIntent getIntent() {
        return this.intent;
    }

    public void setIntent(NLUIntent intent) {
        this.intent = intent;
    }

    public Map<String, Object> getEntities() {
        return this.entities;
    }

    public void setEntities(Map<String, Object> entities) {
        this.entities = entities;
    }

    public ChannelSession getChannelSession() {
        return this.channelSession;
    }

    public void setChannelSession(ChannelSession channelSession) {
        this.channelSession = channelSession;
    }

    public void addStamp(String stamp) {
        if (this.stamps == null) {
            this.stamps = new ArrayList<String>();
        }
        this.stamps.add(stamp);
    }

    public void removeStamp(String stamp) {
        if (this.stamps != null) {
            this.stamps.remove(stamp);
        }
    }

    public void removeStamp(int index) {
        if (this.stamps != null) {
            this.stamps.remove(index);
        }
    }

    public void addEntity(String entity) {
        if (this.stamps == null) {
            this.stamps = new ArrayList<String>();
        }
        this.stamps.add(entity);
    }

    public void removeEntity(String entity) {
        if (this.stamps != null) {
            this.stamps.remove(entity);
        }
    }

    public void removeEntity(int index) {
        if (this.stamps != null) {
            this.stamps.remove(index);
        }
    }

    /***
     * String Representation of MessageHeader
     * @return String
     */
    @Override
    public String toString() {
        return "MessageHeader{" +
                "sender=" + sender +
                ", channelData=" + channelData +
                ", language=" + language +
                ", timestamp=" + timestamp +
                ", securityInfo=" + securityInfo +
                ", stamps=" + stamps +
                ", intent='" + intent + '\'' +
                ", entities=" + entities +
                ", channelSession=" + channelSession +
                '}';
    }

}
