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
        petTypeOne.setDescription("a furry animal");
        petTypeOne.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        petTypesList.add(petTypeOne);

        PetType petTypeFour = new PetType();
        petTypeFour.setType("dog");
        petTypeFour.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        petTypeFour.setDescription("an even more funny animal");
        petTypesList.add(petTypeFour);


        PetType petTypeSix = new PetType();
        petTypeSix.setType("raccoon");
        petTypeSix.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        petTypeSix.setDescription("a lurker of the night");
        petTypesList.add(petTypeSix);

        PetType petTypeSeven = new PetType();
        petTypeSeven.setType("tiger");
        petTypeSeven.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        petTypeSeven.setDescription("it lives in the jungle");
        petTypesList.add(petTypeSeven);


        PetType petTypeEight = new PetType();
        petTypeEight.setType("phoenix");
        petTypeEight.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        petTypeEight.setDescription("x-men");
        petTypesList.add(petTypeEight);


        PetType petTypeNine = new PetType();
        petTypeNine.setType("dragon");
        petTypeNine.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        petTypeNine.setDescription("puff the magic dragon");
        petTypesList.add(petTypeNine);


        PetType petTypeTen = new PetType();
        petTypeTen.setType("taco monkey");
        petTypeTen.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        petTypeTen.setDescription("little big");
        petTypesList.add(petTypeTen);

        if (petTypesRepository.count() == 0) {
            for (PetType name : petTypesList) {
                petTypesRepository.save(name);
            }
        }
    }
}
