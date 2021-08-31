package com.ivoronline.springboot_db_findermethods_projections_class.dto;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //CONSTRUCTOR (Used during conversion)
  public PersonDTO(String name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}
