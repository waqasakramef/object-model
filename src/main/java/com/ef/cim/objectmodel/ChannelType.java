package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.Serializable;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A {@code ChannelType} object represents the type of a particular channel e.g. whatsapp, web, viber e.t.c.
 */
@Document(collection = "ChannelType")
public class ChannelType implements Serializable {

    @Id
    private UUID id;
    @NotBlank
    private String typeName;
    private String channelLogo;
    private boolean isInteractive;
    @JsonSerialize(using= ToStringSerializer.class)
    private ObjectId channelConfigSchema;
    private String mediaRoutingDomain;

    /**
     * Default Constructor, Sets an immutable unique identifier for the channel type object. Sets the is channel type
     * interactive flag as {@code false}
     */
    public ChannelType() {
        this.id = UUID.randomUUID();
        this.isInteractive = false;
    }

    /**
     * Returns the unique identifier of the channel type
     *
     * @return {@code UUID}
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Returns the name of the channel type
     *
     * @return {@code String}
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Sets the name of the channel type
     *
     * @param channelTypeName, object of type {@code String}
     */
    public void setTypeName(String channelTypeName) {
        this.typeName = channelTypeName;
    }

    /**
     * Returns whether the channel type is interactive or not
     *
     * @return {@code boolean}
     */
    public boolean getIsInteractive() {
        return this.isInteractive;
    }

    /**
     * Sets the isInteractive flag of the channel type
     *
     * @param interactive, of type {@code boolean}
     */
    public void setIsInteractive(boolean interactive) {
        this.isInteractive = interactive;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public String getChannelLogo() {
        return channelLogo;
    }

    public void setChannelLogo(String channelLogo) {
        this.channelLogo = channelLogo;
    }


    public ObjectId getChannelConfigSchema() {
        return channelConfigSchema;
    }

    public void setChannelConfigSchema(ObjectId channelConfigSchema) {
        this.channelConfigSchema = channelConfigSchema;
    }

    public String getMediaRoutingDomain() {
        return mediaRoutingDomain;
    }

    public void setMediaRoutingDomain(String mediaRoutingDomain) {
        this.mediaRoutingDomain = mediaRoutingDomain;
    }

    /***
     * String Representation of ChannelType
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", channelLogo=" + channelLogo +
                ", isInteractive=" + isInteractive +
                ", channelConfigSchema=" + channelConfigSchema +
                ", mediaRoutingDomain=" + mediaRoutingDomain +
                '}';
    }
}
