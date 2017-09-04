package com.traveloganizer.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Person {

  private String name;

  private String surname;

  private Date birthDate;

}
