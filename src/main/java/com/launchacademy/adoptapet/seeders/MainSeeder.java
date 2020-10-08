package com.launchacademy.adoptapet.seeders;

import com.launchacademy.adoptapet.models.AdoptablePet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainSeeder implements CommandLineRunner {
    @Autowired
    PetTypesSeeder petTypesSeeder;

    @Autowired
    AdoptablePetsSeeder adoptablePetsSeeder;

    @Override
    public void run(String... args) throws Exception {
        petTypesSeeder.seed();
        adoptablePetsSeeder.seed();
//        List<AdoptablePet> seed = adoptablePetsSeeder.getSeedData();
    }
}