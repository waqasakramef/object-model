package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.net.URL;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class ChannelConnector implements Serializable {
    private UUID id;
    @NotBlank
    private String channelConnectorName;
    @NotBlank
    private URL channelWebhook;
    @Valid
    private ChannelType channelType;
//    private UndefinedObject channelLogo;
    private FormData formData;
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

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

//    public UndefinedObject getChannelLogo() {
//        return channelLogo;
//    }

//    public void setChannelLogo(UndefinedObject channelLogo) {
//        this.channelLogo = channelLogo;
//    }


    public FormData getFormData() {
        return formData;
    }

    public void setFormData(FormData formData) {
        this.formData = formData;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void setId(UUID id) { this.id = id; }


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
                ", type=" + channelType +
                ", formData=" + formData +
                ", tenant=" + tenant +
                '}';
    }
}
