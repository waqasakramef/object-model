package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

public class Resources {
    @JsonIgnore
    private List<Resource> Resources;

    public List<Resource> getResources() {
        return Resources;
    }

    public void setResources(List<Resource> resources) {
        Resources = resources;
    }
}
