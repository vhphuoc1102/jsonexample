package com.phuocvh.jsonexample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrefixableMixin {
  @JsonIgnore
  private String prefix;

  public String getPrefixedFieldName(String fieldName) {
    return prefix != null ? prefix + "." + fieldName : fieldName;
  }
}
