package com.ef.cim.objectmodel;

import java.util.UUID;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "routingAttributes")
public class RoutingAttribute {
    @Id
    private UUID id;
    @NotNull
    @Size(min = 3, max = 110)
    private String name;
    @Size(max = 500)
    private String description;
    @NotNull
    private AttributeType type;
    private int defaultValue;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AttributeType getType() {
        return type;
    }

    public void setType(AttributeType type) {
        this.type = type;
    }

    public int getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(int defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "RoutingAttribute{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", description='" + description + '\''
                + ", type=" + type
                + ", defaultValue='" + defaultValue + '\''
                + '}';
    }
}
