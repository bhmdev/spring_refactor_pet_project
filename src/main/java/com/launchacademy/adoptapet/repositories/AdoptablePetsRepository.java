package com.launchacademy.adoptapet.repositories;

import com.launchacademy.adoptapet.models.AdoptablePet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdoptablePetsRepository extends CrudRepository<AdoptablePet, Integer>{
        public List<AdoptablePet> findAll();
        public Iterable<AdoptablePet> findAllByPetTypeType(String petType);
}


