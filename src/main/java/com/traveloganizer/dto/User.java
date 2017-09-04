package com.traveloganizer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User extends Person {

  @Getter
  @Setter
  private Long id;

  @Getter
  @Setter
  private String login;

  @Getter
  @Setter
  private String password;

  @Getter
  @Setter
  private String email;

}
