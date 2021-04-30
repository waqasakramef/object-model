package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotBlank;

/**
 * A {@code ChannelData} object represents the data available on different type of channels. For
 * example on web channel we have browser id, language e.t.c This is the <strong>parent</strong>
 * object for more specific channels' data objects. e.g. WebChannelData.
 */


public class ChannelData implements Serializable {
    @NotBlank
    private String channelCustomerIdentifier;
    @NotBlank
    private String serviceIdentifier;
    private int requestPriority;

    // This field should be List<KeyValuePair>. Changed it for initial integration
    // with Agent Manager
    private List<KeyValuePair> additionalAttributes;

    public ChannelData() {
        this.additionalAttributes = new ArrayList<>();
    }

    public String getChannelCustomerIdentifier() {
        return channelCustomerIdentifier;
    }

    public void setChannelCustomerIdentifier(String channelCustomerIdentifier) {
        this.channelCustomerIdentifier = channelCustomerIdentifier;
    }

    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    public List<KeyValuePair> getAdditionalAttributes() { return additionalAttributes; }

    public void setAdditionalAttributes(List<KeyValuePair> additionalAttributes) { this.additionalAttributes = additionalAttributes; }

    public void addAdditionalAttribute(String key, String value) {
        this.additionalAttributes.add(new KeyValuePair(key,value));
    }
    public void removeAdditionalAttribute(KeyValuePair keyValuePair) {
        this.additionalAttributes.remove(keyValuePair);
    }
    public void removeAdditionalAttribute(int index) {
        this.additionalAttributes.remove(index);
    }

    public int getRequestPriority() {
        return requestPriority;
    }

    public void setRequestPriority(int requestPriority) {
        this.requestPriority = requestPriority;
    }

    /**
     * String Representation of ChannelData
     *
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelData{" +
                "channelCustomerIdentifier='" + channelCustomerIdentifier + '\'' +
                ", serviceIdentifier='" + serviceIdentifier + '\'' +
                ", requestPriority=" + requestPriority +
                ", additionalAttributes=" + additionalAttributes +
                '}';
    }
}
