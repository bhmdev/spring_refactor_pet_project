package com.launchacademy.adoptapet.controllers.api.v1;

import com.launchacademy.adoptapet.models.AdoptablePet;
import com.launchacademy.adoptapet.repositories.AdoptablePetsRepository;
import com.launchacademy.adoptapet.repositories.PetTypesRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class AdoptablePetsRestController {
    private PetTypesRepository petTypesRepository;
    private AdoptablePetsRepository petsRepository;

    @Autowired
    public void PetsRestController(AdoptablePetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    public AdoptablePetsRestController(AdoptablePetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    @GetMapping("/pets/{petType}")
    public Iterable<AdoptablePet> getPetsByType(@PathVariable String petType) {
        return petsRepository.findAllByPetTypeType(petType);
    }

    @NoArgsConstructor
    private class PetNotFoundException extends RuntimeException {};

    @ControllerAdvice
    private class PetNotFoundAdvice {
        @ResponseBody
        @ExceptionHandler(PetNotFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String petNotFoundHandler(PetNotFoundException ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("/pets/{petType}/{id}")
    public AdoptablePet getPetsById(@PathVariable Integer id, @PathVariable String petType) {
        return petsRepository.findById(id).orElseThrow(() -> new PetNotFoundException());
    }
}



