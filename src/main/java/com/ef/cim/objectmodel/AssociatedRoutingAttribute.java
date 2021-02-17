package com.ef.cim.objectmodel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AssociatedRoutingAttribute {
    @NotNull
    private RoutingAttribute routingAttribute;
    @NotBlank
    private String value;

    public RoutingAttribute getRoutingAttribute() {
        return routingAttribute;
    }

    public void setRoutingAttribute(RoutingAttribute routingAttribute) {
        this.routingAttribute = routingAttribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AssociatedRoutingAttribute{" +
                "routingAttribute=" + routingAttribute +
                ", value='" + value + '\'' +
                '}';
    }
}
