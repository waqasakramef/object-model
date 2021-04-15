package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class FormData implements Serializable {
    private UUID id;
    private Form form;
    private String filledBy;
    private Date createdOn;

    public FormData() {
        this.id = UUID.randomUUID();
        this.createdOn = new Date();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    @Override
    public String toString() {
        return "FormData{" +
                "id=" + id +
                ", form=" + form +
                ", filledBy='" + filledBy + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
