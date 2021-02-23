package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;
import javax.validation.constraints.NotNull;

/**
 * A {@code ChannelType} object represents the type of a particular channel e.g. whatsapp, web,
 * viber e.t.c.
 */
public class ChannelConnectorType implements Serializable {
    private final UUID id;
    @NotNull
    private ChannelType name;
    private boolean isInteractive;

    /**
     * Default Constructor, Sets an immutable unique identifier for the channel type object. Sets the is
     * channel type interactive flag as {@code false}
     */
    public ChannelConnectorType() {
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
    public ChannelType getName() {
        return this.name;
    }

    /**
     * Sets the name of the channel type
     *
     * @param channelTypeName, object of type {@code String}
     */
    public void setName(ChannelType channelTypeName) {
        this.name = channelTypeName;
    }

    /**
     * Returns whether the channel type is interactive or not
     *
     * @return {@code boolean}
     */
    public boolean isInteractive() {
        return this.isInteractive;
    }

    /**
     * Sets the isInteractive flag of the channel type
     *
     * @param interactive, of type {@code boolean}
     */
    public void setInteractive(boolean interactive) {
        this.isInteractive = interactive;
    }

    /***
     * String Representation of ChannelType
     * @return String
     */
    @Override
    public String toString() {
        return "ChannelType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isInteractive=" + isInteractive +
                '}';
    }
}
