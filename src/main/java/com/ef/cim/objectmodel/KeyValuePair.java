package com.ef.cim.objectmodel;

import java.io.Serializable;

public class KeyValuePair implements Serializable {
  private String key;
  private String value;

  /** Default Constructor */
  public KeyValuePair() {}

  /**
   * Constructor
   *
   * @param key
   * @param value
   */
  public KeyValuePair(String key, String value) {
    this.key = key;
    this.value = value;
  }

  /** All the getters */
  public String getKey() {
    return this.key;
  }

  public String getValue() {
    return this.value;
  }

  /** All the Setters */
  public void setKey(String key) {
    this.key = key;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Override toString() method for displaying / Logging */
  @Override
  public String toString() {
    return "Attribute{" + "key='" + key + '\'' + ", value='" + value + '\'' + '}';
  }
}
