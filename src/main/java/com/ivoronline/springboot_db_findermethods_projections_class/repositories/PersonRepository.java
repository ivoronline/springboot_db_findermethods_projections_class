package com.ivoronline.springboot_db_findermethods_projections_class.repositories;

import com.ivoronline.springboot_db_findermethods_projections_class.dto.PersonDTO;
import com.ivoronline.springboot_db_findermethods_projections_class.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  PersonDTO findDTOByName(String name);
}


