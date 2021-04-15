package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Form implements Serializable {
    private UUID id;
    private String name;
    private List<Attribute> attributes;

    public Form() {
        this.id = UUID.randomUUID();
    }

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

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
