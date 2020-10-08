package com.launchacademy.adoptapet.controllers.api.v1;

import com.launchacademy.adoptapet.models.PetType;
import com.launchacademy.adoptapet.repositories.PetTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetTypesRestController {
    private PetTypesRepository petTypesRepository;

    @Autowired
    public  PetTypesRestController(PetTypesRepository petTypesRepository ) {
        this.petTypesRepository = petTypesRepository;
    }

    @GetMapping("/api/v1/pet_types")
        public Iterable<PetType> getPetTypes(){
        return petTypesRepository.findAll();
        }

}
