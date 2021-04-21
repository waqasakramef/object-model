package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.net.URL;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ChannelConnector")
public class ChannelConnector implements Serializable {
    @Id
    private UUID id;
    @NotBlank
    private String channelConnectorName;
    private URL channelWebhook;
    @DBRef(lazy = true)
    private ChannelType channelType;
//    private UndefinedObject channelLogo;
    private FormData channelConnectorData;
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


    public FormData getChannelConnectorData() {
        return channelConnectorData;
    }

    public void setChannelConnectorData(FormData channelConnectorData) {
        this.channelConnectorData = channelConnectorData;
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
                ", formData=" + channelConnectorData +
                ", tenant=" + tenant +
                '}';
    }
}
