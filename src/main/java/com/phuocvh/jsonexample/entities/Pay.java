package com.phuocvh.jsonexample.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Pay {
  private Integer id;
  private String payName;
  private LocalDateTime updateTs;
}
