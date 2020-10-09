package com.launchacademy.adoptapet.controllers.api.v1;


import com.launchacademy.adoptapet.models.PetType;
import com.launchacademy.adoptapet.models.SurrenderApplication;
import com.launchacademy.adoptapet.repositories.PetTypesRepository;
import com.launchacademy.adoptapet.repositories.SurrenderApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class SurrenderApplicationsRestController {

    private SurrenderApplicationsRepository surrenderApplicationRepository;
    private PetTypesRepository petTypesRepository;

    @Autowired
    public SurrenderApplicationsRestController(SurrenderApplicationsRepository surrenderApplicationsRepository,
            PetTypesRepository petTypesRepository) {
        this.surrenderApplicationsRepository = surrenderApplicationsRepository;
        this.petTypesRepository = petTypesRepository;
    }

    @PostMapping("/adoptions/new/{type_id}")
    public SurrenderApplication surrenderApplication(@RequestBody SurrenderApplication surrenderApplication, @PathVariable Integer type_id) {
        Optional<PetType> petType = petTypesRepository.findById(type_id);

        surrenderApplication.setPetType(petType.get());

        surrenderApplication.setApplicationStatus(false);

        return surrenderApplicationsRepository.save(surrenderApplication);
    }
}