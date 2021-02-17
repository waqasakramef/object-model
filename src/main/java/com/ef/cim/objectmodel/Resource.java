package com.ef.cim.objectmodel;

import java.util.UUID;

public class Resource {
    private UUID rsid;
    private String rsname;

    public UUID getRsid() {
        return rsid;
    }

    public void setRsid(UUID rsid) {
        this.rsid = rsid;
    }

    public String getRsname() {
        return rsname;
    }

    public void setRsname(String rsname) {
        this.rsname = rsname;
    }
}
