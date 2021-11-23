package com.ivoronline.springboot_db_findermethods_projections_class.controllers;

import com.ivoronline.springboot_db_findermethods_projections_class.dto.PersonDTO;
import com.ivoronline.springboot_db_findermethods_projections_class.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND DTO BY NAME
  //================================================================
  @RequestMapping("FindDTOByName")
  PersonDTO findDTOByName() {

    //GET DTO FROM DB
    PersonDTO personDTO = personRepository.findDTOByName("John");

    //GET PROJECTION PROPERTIES
    String  name = personDTO.name;
    Integer age  = personDTO.age;
    System.out.println(name + " is " + age + " years old");

    //RETURN DTO
    return    personDTO;

  }

}
