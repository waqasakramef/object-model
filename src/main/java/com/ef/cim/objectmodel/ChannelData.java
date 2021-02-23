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
    private List<KeyValuePair> additionalAttribute;

    public ChannelData() {
        this.additionalAttribute = new ArrayList<>();
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

    public List<KeyValuePair> getAdditionalAttribute() {
        return additionalAttribute;
    }

    public void setAdditionalAttribute(List<KeyValuePair> additionalAttribute) {
        this.additionalAttribute = additionalAttribute;
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
