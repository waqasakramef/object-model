package com.ef.cim.objectmodel;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.validation.constraints.NotEmpty;

public class Customer implements Serializable {




    private UUID id;
    @NotEmpty(message = "Customer First Name is Mandatory")
    private String firstName;
    private String lastName;
    private String email;
    @NotEmpty(message = "Phone 1 is Mandatory")
    private String phone1;
    private  String phone2;
    private String viberId;
    private  String facebookId;
    private  String webId;
    private String createdAt;
    private  String updatedAt;
   @NotEmpty(message = "Is Anonymous Flag is Mandatory")
    private boolean isAnonymous;
    private int __v;


   private Map<String, Object> additionalDetail = new HashMap<>();

   @JsonAnySetter
   public void setAdditionalDetail(String key, Object value) {
      additionalDetail.put(key, value);
   }

   @JsonAnyGetter
    public Map<String, Object> getAdditionalDetail() {
        return additionalDetail;
    }



   // Default Constructor
    public Customer() {

    }


   public UUID getId() {
      return id;
   }

   public void setId(UUID id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhone1() {
      return phone1;
   }

   public void setPhone1(String phone1) {
      this.phone1 = phone1;
   }

   public String getPhone2() {
      return phone2;
   }

   public void setPhone2(String phone2) {
      this.phone2 = phone2;
   }

   public String getViberId() {
      return viberId;
   }

   public void setViberId(String viberId) {
      this.viberId = viberId;
   }

   public String getFacebookId() {
      return facebookId;
   }

   public void setFacebookId(String facebookId) {
      this.facebookId = facebookId;
   }

   public String getWebId() {
      return webId;
   }

   public void setWebId(String webId) {
      this.webId = webId;
   }

   public String getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(String createdAt) {
      this.createdAt = createdAt;
   }

   public String getUpdatedAt() {
      return updatedAt;
   }

   public void setUpdatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
   }

   public boolean getIsAnonymous() {
      return isAnonymous;
   }

   public void setIsAnonymous(boolean anonymous) {
      isAnonymous = anonymous;
   }

   public int get__v() {
      return __v;
   }

   public void set__v(int __v) {
      this.__v = __v;
   }

}
