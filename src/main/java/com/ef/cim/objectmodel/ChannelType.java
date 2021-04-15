package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;
import javax.validation.constraints.NotBlank;

/**
 * A {@code ChannelType} object represents the type of a particular channel e.g. whatsapp, web,
 * viber e.t.c.
 */
public class ChannelType implements Serializable {
    private UUID id;
    @NotBlank
    private String typeName;
    private UndefinedObject channelLogo;
    private boolean isInteractive;
    private Form channelConfigSchema;


    /**
     * Default Constructor, Sets an immutable unique identifier for the channel type object. Sets the is
     * channel type interactive flag as {@code false}
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

    public UndefinedObject getChannelLogo() {
        return channelLogo;
    }

    public void setChannelLogo(UndefinedObject channelLogo) {
        this.channelLogo = channelLogo;
    }

    public boolean isInteractive() {
        return isInteractive;
    }

    public void setInteractive(boolean interactive) {
        isInteractive = interactive;
    }

    public Form getChannelConfigSchema() {
        return channelConfigSchema;
    }

    public void setChannelConfigSchema(Form channelConfigSchema) {
        this.channelConfigSchema = channelConfigSchema;
    }

    /***
     * String Representation of ChannelType
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelType{" +
                "id=" + id +
                ", name='" + typeName + '\'' +
                ", isInteractive=" + isInteractive +
                '}';
    }
}
