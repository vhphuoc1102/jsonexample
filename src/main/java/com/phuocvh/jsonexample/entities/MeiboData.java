package com.phuocvh.jsonexample.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.springframework.boot.jackson.JsonMixin;

@Getter
@Setter
@Builder
@NoArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.STRING)
@JsonMixin(PrefixableMixin.class)
public class MeiboData extends BaseData {
//  @JsonIgnore
//  private String prefix;

  @JsonUnwrapped
  @JsonProperty(index=1)
  @JsonPropertyOrder({"id", "name", "updateTs"})
  private Meibo meibo;

  public MeiboData(Meibo meibo){
    this.meibo = meibo;
  }
}
