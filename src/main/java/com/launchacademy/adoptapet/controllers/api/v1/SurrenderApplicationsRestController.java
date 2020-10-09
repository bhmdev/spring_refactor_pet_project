package com.launchacademy.adoptapet.controllers.api.v1;


import com.launchacademy.adoptapet.models.PetType;
import com.launchacademy.adoptapet.models.SurrenderApplication;
import com.launchacademy.adoptapet.repositories.PetTypesRepository;
import com.launchacademy.adoptapet.repositories.SurrenderApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.validation.ValidationErrors;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class SurrenderApplicationsRestController {

    private SurrenderApplicationsRepository surrenderApplicationsRepository;
    private PetTypesRepository petTypesRepository;

    @Autowired
    public SurrenderApplicationsRestController(SurrenderApplicationsRepository surrenderApplicationsRepository,
                                               PetTypesRepository petTypesRepository) {
        this.surrenderApplicationsRepository = surrenderApplicationsRepository;
        this.petTypesRepository = petTypesRepository;
    }

    @PostMapping("/adoptions/new/{type_id}")
    public SurrenderApplication surrenderApplication(@RequestBody @Valid  SurrenderApplication surrenderApplication, @PathVariable Integer type_id, BindingResult bindingResult) {
        Optional<PetType> petType = petTypesRepository.findById(type_id);

        surrenderApplication.setPetType(petType.get());

        surrenderApplication.setApplicationStatus(false);

        if (bindingResult.hasErrors()) {
            return surrenderApplication;
        } else {

            return surrenderApplicationsRepository.save(surrenderApplication);
        }
    }
}
