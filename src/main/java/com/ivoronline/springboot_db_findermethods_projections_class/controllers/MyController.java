package com.ivoronline.springboot_db_findermethods_projections_class.controllers;

import com.ivoronline.springboot_db_findermethods_projections_class.dto.PersonDTO;
import com.ivoronline.springboot_db_findermethods_projections_class.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND DTO BY NAME
  //================================================================
  @RequestMapping("FindDTOByName")
  PersonDTO findDTOByName() {
    PersonDTO personDTO = personRepository.findDTOByName("John");
    return    personDTO;
  }

}
