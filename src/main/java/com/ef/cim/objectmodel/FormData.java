package com.ef.cim.objectmodel;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.bson.types.ObjectId;

public class FormData implements Serializable {
    private UUID id;
    @JsonSerialize(using= ToStringSerializer.class)
    private ObjectId form;
    private String filledBy;
    private Date createdOn;
    private List<Attribute> attributes;

    public FormData() {
        this.id = UUID.randomUUID();
        this.createdOn = new Date();
        this.attributes = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ObjectId getForm() {
        return form;
    }

    public void setForm(ObjectId form) {
        this.form = form;
    }

    public String getFilledBy() {
        return filledBy;
    }

    public void setFilledBy(String filledBy) {
        this.filledBy = filledBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "FormData{" +
                "id=" + id +
                ", form=" + form +
                ", filledBy='" + filledBy + '\'' +
                ", createdOn=" + createdOn +
                ", attributes=" + attributes +
                '}';
    }
}
