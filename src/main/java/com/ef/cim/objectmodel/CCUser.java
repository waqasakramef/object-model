package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "agents")
public class CCUser implements Participant {
    @Id
    private UUID id;
    @NotNull
    @Valid
    private KeycloakUser keycloakUser;
    private List<AssociatedRoutingAttribute> associatedRoutingAttributes;
    private final String participantType;

    public CCUser() {
        this.associatedRoutingAttributes = new ArrayList<>();
        this.participantType = "CCUser";
    }

    @JsonIgnore
    @Override
    public String getDisplayName() {
        if (keycloakUser != null) {
            return this.keycloakUser.getFirstName() + " " + this.keycloakUser.getLastName();
        }
        return null;
    }

    @Override
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public KeycloakUser getKeycloakUser() {
        return keycloakUser;
    }

    public void setKeycloakUser(KeycloakUser keycloakUser) {
        this.keycloakUser = keycloakUser;
    }

    public List<AssociatedRoutingAttribute> getAssociatedRoutingAttributes() {
        return associatedRoutingAttributes;
    }

    public void setAssociatedRoutingAttributes(
            List<AssociatedRoutingAttribute> associatedRoutingAttributes) {
        this.associatedRoutingAttributes = associatedRoutingAttributes;
    }

    public boolean containsAssociatedRoutingAttribute(
            AssociatedRoutingAttribute associatedRoutingAttribute) {
        return this.associatedRoutingAttributes.contains(associatedRoutingAttribute);
    }

    public boolean addAssociatedRoutingAttribute(
            AssociatedRoutingAttribute associatedRoutingAttribute) {
        return this.associatedRoutingAttributes.add(associatedRoutingAttribute);
    }

    public boolean removeAssociatedRoutingAttribute(
            AssociatedRoutingAttribute associatedRoutingAttribute) {
        return this.associatedRoutingAttributes.remove(associatedRoutingAttribute);
    }
}
