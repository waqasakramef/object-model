package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.net.URL;
import java.util.UUID;
import javax.validation.Valid;

public class ChannelConnector implements Serializable {
    private final UUID id;
    private String channelConnectorName;
    private URL channelWebhook;
    @Valid
    private ChannelConnectorType type;
    private UndefinedObject channelLogo;
    private Tenant tenant;

    public ChannelConnector() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getChannelConnectorName() {
        return channelConnectorName;
    }

    public void setChannelConnectorName(String channelConnectorName) {
        this.channelConnectorName = channelConnectorName;
    }

    public URL getChannelWebhook() {
        return channelWebhook;
    }

    public void setChannelWebhook(URL channelWebhook) {
        this.channelWebhook = channelWebhook;
    }

    public ChannelConnectorType getType() {
        return type;
    }

    public void setType(ChannelConnectorType type) {
        this.type = type;
    }

    public UndefinedObject getChannelLogo() {
        return channelLogo;
    }

    public void setChannelLogo(UndefinedObject channelLogo) {
        this.channelLogo = channelLogo;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    /***
     * String Representation of ChannelConnector
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelConnector{" +
                "id=" + id +
                ", channelConnectorName='" + channelConnectorName + '\'' +
                ", channelWebhook=" + channelWebhook +
                ", type=" + type +
                ", channelLogo=" + channelLogo +
                ", tenant=" + tenant +
                '}';
    }
}
