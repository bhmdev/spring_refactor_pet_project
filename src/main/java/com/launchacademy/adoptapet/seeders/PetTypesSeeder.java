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
        petTypeFour.setImg_url("https://i.pinimg.com/originals/79/ff/00/79ff00f7e84d5246a08e74c8d0e8e115.jpg");
        petTypeFour.setDescription("an even more funny animal");
        petTypesList.add(petTypeFour);


        PetType petTypeSix = new PetType();
        petTypeSix.setType("raccoon");
        petTypeSix.setImg_url("https://images-na.ssl-images-amazon.com/images/I/51qDy2I7plL._AC_SY450_.jpg");
        petTypeSix.setDescription("a lurker of the night");
        petTypesList.add(petTypeSix);

        PetType petTypeSeven = new PetType();
        petTypeSeven.setType("tiger");
        petTypeSeven.setImg_url("https://i.pinimg.com/originals/34/60/8c/34608c94d6adc7f630174d4a976251e1.jpg");
        petTypeSeven.setDescription("it lives in the jungle");
        petTypesList.add(petTypeSeven);


        PetType petTypeEight = new PetType();
        petTypeEight.setType("phoenix");
        petTypeEight.setImg_url("https://i.pinimg.com/originals/f9/4b/2b/f94b2be27194a6a9242b1dc9174f48e1.png");
        petTypeEight.setDescription("x-men");
        petTypesList.add(petTypeEight);


        PetType petTypeNine = new PetType();
        petTypeNine.setType("dragon");
        petTypeNine.setImg_url("https://st.depositphotos.com/1967477/3507/v/950/depositphotos_35078867-stock-illustration-cute-baby-dragon-cartoon.jpg");
        petTypeNine.setDescription("puff the magic dragon");
        petTypesList.add(petTypeNine);


        PetType petTypeTen = new PetType();
        petTypeTen.setType("taco monkey");
        petTypeTen.setImg_url("https://images-na.ssl-images-amazon.com/images/I/81ZMdxA0-zL._AC_SL1500_.jpg");
        petTypeTen.setDescription("little big");
        petTypesList.add(petTypeTen);

        if (petTypesRepository.count() == 0) {
            for (PetType name : petTypesList) {
                petTypesRepository.save(name);
            }
        }
    }
}
