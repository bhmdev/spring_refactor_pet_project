package com.launchacademy.adoptapet.seeders;

import com.launchacademy.adoptapet.models.PetType;
import com.launchacademy.adoptapet.repositories.PetTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PetTypesSeeder {
    private PetTypesRepository petTypesRepository;

    @Autowired
    public void setPetTypesRepository(PetTypesRepository petTypesRepository) {
        this.petTypesRepository = petTypesRepository;
    }

    public void seed() {
        List<PetType> petTypesList = new ArrayList();

        PetType petTypeOne = new PetType();
        petTypeOne.setType("cat");
        petTypesList.add(petTypeOne);

        PetType petTypeTwo = new PetType();
        petTypeTwo.setType("cat");
        petTypesList.add(petTypeTwo);

        PetType petTypeThree = new PetType();
        petTypeThree.setType("cat");
        petTypesList.add(petTypeThree);

        PetType petTypeFour = new PetType();
        petTypeFour.setType("dog");
        petTypesList.add(petTypeFour);

        PetType petTypeFive = new PetType();
        petTypeFive.setType("dog");
        petTypesList.add(petTypeFive);

        PetType petTypeSix = new PetType();
        petTypeSix.setType("raccoon");
        petTypesList.add(petTypeSix);


        PetType petTypeSeven = new PetType();
        petTypeSeven.setType("tiger");
        petTypesList.add(petTypeSeven);


        PetType petTypeEight = new PetType();
        petTypeEight.setType("phoenix");
        petTypesList.add(petTypeEight);


        PetType petTypeNine = new PetType();
        petTypeNine.setType("dragon");
        petTypesList.add(petTypeNine);


        PetType petTypeTen = new PetType();
        petTypeTen.setType("taco monkey");
        petTypesList.add(petTypeTen);

        if (petTypesRepository.count() == 0) {
            for (PetType name : petTypesList) {
                petTypesRepository.save(name);
            }
        }
    }
}
