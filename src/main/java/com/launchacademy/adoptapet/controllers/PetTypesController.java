package com.launchacademy.adoptapet.controllers;

import com.launchacademy.adoptapet.models.PetType;
import com.launchacademy.adoptapet.repositories.PetTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class PetTypesController {
    private PetTypesRepository petTypesRepository;

    @Autowired
    public PetTypesController(PetTypesRepository petTypesRepository){
        this.petTypesRepository = petTypesRepository;
    }

    @Autowired
    public void PetTypesRepository(PetTypesRepository petTypesRepository){
        this.petTypesRepository = petTypesRepository;
    }


    @GetMapping("/")
    public String listCharacters(Model model){
        List<PetType> petTypes = petTypesRepository.findAll();
        model.addAttribute("petTypes", petTypes);
        return "/";
    }


    @PostMapping("/")
    public String addPetType(@ModelAttribute @Valid PetType petType, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            populateLookupData(model);
            return "/";
        } else {
            petTypesRepository.save(petType);
            model.addAttribute(petType);
            populateLookupData(model);
            return "redirect:/pets";
        }
    }

    private void populateLookupData(Model model){
        List<PetType> petTypeList = petTypesRepository.findAll();
        model.addAttribute("filmsList", petTypeList);
    }
}
