package com.launchacademy.adoptapet.seeders;

import com.launchacademy.adoptapet.models.AdoptablePet;
import com.launchacademy.adoptapet.models.PetType;
import com.launchacademy.adoptapet.repositories.AdoptablePetsRepository;
import com.launchacademy.adoptapet.repositories.PetTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdoptablePetsSeeder {
    private AdoptablePetsRepository adoptablePetsRepository;
    private PetTypesRepository petTypesRepository;

    @Autowired
    public void setAdoptablePetRepository(AdoptablePetsRepository adoptablePetRepository, PetTypesRepository petTypesRepository) {
        this.adoptablePetsRepository = adoptablePetRepository;
        this.petTypesRepository = petTypesRepository;
    }

    public void seed() {
//        List<AdoptablePet> adoptablePetList = new ArrayList();
        List<PetType> petTypeList = (List<PetType>) petTypesRepository.findAll();

        AdoptablePet garfield = new AdoptablePet();
        garfield.setName("garfield");
        garfield.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        garfield.setAge(6);
        garfield.setVaccination_status(true);
        garfield.setAdoption_story("this is your story");
        garfield.setAdoption_status("null");
        garfield.setPetType(petTypeList.get(0));
//        adoptablePetList.add(garfield);
        adoptablePetsRepository.save(garfield);

        AdoptablePet pinky = new AdoptablePet();
        pinky.setName("pinky");
        pinky.setImg_url("https://vignette.wikia.nocookie.net/looneytunes/images/c/c3/Pinky.PNG/revision/latest?cb=20170525045435");
        pinky.setAge(16);
        pinky.setVaccination_status(true);
        pinky.setAdoption_story("best lab rat ever");
        pinky.setAdoption_status("null");
        pinky.setPetType(petTypeList.get(1));
//        adoptablePetList.add(pinky);
        adoptablePetsRepository.save(pinky);


        AdoptablePet simba = new AdoptablePet();
        simba.setName("simba");
        simba.setImg_url("https://static01.nyt.com/images/2019/07/21/arts/23lionking1/merlin_154880472_6647f53b-1be2-43cd-87e0-ce26ebf1d4ed-articleLarge.jpg?quality=75&auto=webp&disable=upscale");
        simba.setAge(23);
        simba.setVaccination_status(true);
        simba.setAdoption_story("everything the light touches");
        simba.setAdoption_status("null");
//        adoptablePetList.add(simba);
        adoptablePetsRepository.save(simba);
//        return adoptablePetList;
    }
}
