package com.phuocvh.jsonexample.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.STRING)
public class PayData extends BaseData{
//  @JsonIgnore
//  private String prefix;

  @JsonUnwrapped
  @JsonProperty(index=1)
  @JsonPropertyOrder({"id", "payName", "updateTs"})
  private Pay pay;

  public PayData(Pay pay){
    this.pay = pay;
  }
}
