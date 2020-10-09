package com.launchacademy.adoptapet.repositories;

import com.launchacademy.adoptapet.models.AdoptablePet;
import com.launchacademy.adoptapet.models.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetTypesRepository extends CrudRepository<PetType, Integer> {
    Optional findById(Integer id);
}
