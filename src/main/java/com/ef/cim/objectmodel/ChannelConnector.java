package com.ef.cim.objectmodel;

import java.io.Serializable;
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
    private ChannelConnectorInterface channelConnectorInterface;
    private String interfaceAddress;
    @DBRef
    private ChannelType channelType;
//    private UndefinedObject channelLogo;
    private FormData connectorConfig;
    private Tenant tenant;

    public ChannelConnector() {
        this.id = UUID.randomUUID();
        channelConnectorInterface = ChannelConnectorInterface.REST;
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


    public FormData getConnectorConfig() {
        return connectorConfig;
    }

    public void setConnectorConfig(FormData connectorConfig) {
        this.connectorConfig = connectorConfig;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void setId(UUID id) { this.id = id; }

    public ChannelConnectorInterface getChannelConnectorInterface() {
        return channelConnectorInterface;
    }

    public void setChannelConnectorInterface(ChannelConnectorInterface channelConnectorInterface) {
        this.channelConnectorInterface = channelConnectorInterface;
    }

    public String getInterfaceAddress() {
        return interfaceAddress;
    }

    public void setInterfaceAddress(String interfaceAddress) {
        this.interfaceAddress = interfaceAddress;
    }

    /***
     * String Representation of ChannelConnector.
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelConnector{" +
                "id=" + id +
                ", channelConnectorName='" + channelConnectorName + '\'' +
                ", channelConnectorInterface=" + channelConnectorInterface +
                ", interfaceAddress='" + interfaceAddress + '\'' +
                ", channelType=" + channelType +
                ", connectorConfig=" + connectorConfig +
                ", tenant=" + tenant +
                '}';
    }
}
