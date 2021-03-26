package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    // This field should be List<KeyValuePair>. Changed it for initial integration
    // with Agent Manager
    private Map<String, Object> additionalAttribute;

    public ChannelData() {
        this.additionalAttribute = new HashMap<>();
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

    public Map<String, Object> getAdditionalAttribute() {
        return additionalAttribute;
    }

    public void setAdditionalAttribute(Map<String, Object> additionalAttribute) {
        this.additionalAttribute = additionalAttribute;
    }

    public void addAdditionalAttribute(String key, Object value) {
        this.additionalAttribute.put(key, value);
    }

    public void removeAdditionalAttribute(String key) {
        this.additionalAttribute.remove(key);
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
                ", additionalAttribute=" + additionalAttribute +
                '}';
    }
}
