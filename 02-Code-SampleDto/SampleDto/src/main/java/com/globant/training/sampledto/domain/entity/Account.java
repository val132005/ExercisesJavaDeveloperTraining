package com.globant.training.sampledto.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {
  private Long id;
  private String login;
  private String password;
  private Boolean active;
}
