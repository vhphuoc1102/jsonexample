package com.phuocvh.jsonexample.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class BaseData {
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  @JsonProperty(index = 2)
  private Map<String, Object> properties = new HashMap<>();

  @JsonAnyGetter
  public Map<String, Object> getProperties() {
    return properties;
  }
}
