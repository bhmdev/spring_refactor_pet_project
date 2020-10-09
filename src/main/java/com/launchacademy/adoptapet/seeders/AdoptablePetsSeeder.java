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
        List<PetType> petTypeList = (List<PetType>) petTypesRepository.findAll();

        AdoptablePet garfield = new AdoptablePet();
        garfield.setName("garfield");
        garfield.setImg_url("https://vignette.wikia.nocookie.net/viacom4633/images/f/f2/Garfield.jpg/revision/latest/top-crop/width/360/height/450?cb=20191117205133");
        garfield.setAge(6);
        garfield.setVaccination_status(true);
        garfield.setAdoption_story("this is your story");
        garfield.setAdoption_status("null");
        garfield.setPetType(petTypeList.get(0));
        adoptablePetsRepository.save(garfield);

        AdoptablePet clifford = new AdoptablePet();
        clifford.setName("clifford");
        clifford.setImg_url("https://imgix.bustle.com/uploads/image/2019/11/22/94729f63-9646-4982-a5c1-234dea0f64f6-clf_new_ee_c_leap.jpg");
        clifford.setAge(16);
        clifford.setVaccination_status(true);
        clifford.setAdoption_story("the big red dog");
        clifford.setAdoption_status("null");
        clifford.setPetType(petTypeList.get(1));
        adoptablePetsRepository.save(clifford);


        AdoptablePet simba = new AdoptablePet();
        simba.setName("simba");
        simba.setImg_url("https://static01.nyt.com/images/2019/07/21/arts/23lionking1/merlin_154880472_6647f53b-1be2-43cd-87e0-ce26ebf1d4ed-articleLarge.jpg?quality=75&auto=webp&disable=upscale");
        simba.setAge(23);
        simba.setVaccination_status(true);
        simba.setAdoption_story("everything the light touches");
        simba.setAdoption_status("null");
        simba.setPetType(petTypeList.get(2));
        adoptablePetsRepository.save(simba);
    }
}
