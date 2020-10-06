package com.launchacademy.adoptapet.repositories;

import com.launchacademy.adoptapet.models.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypesRepository extends CrudRepository<PetType, Integer> {
}
