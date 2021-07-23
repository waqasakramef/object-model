package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.bson.types.ObjectId;

public class FormData implements Serializable {
    private ObjectId id;
    private Form form;
    private String filledBy;
    private Date createdOn;
    private List<Attribute> attributes;

    public FormData() {
        this.id = new ObjectId();
        this.createdOn = new Date();
        this.attributes = new ArrayList<>();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
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
