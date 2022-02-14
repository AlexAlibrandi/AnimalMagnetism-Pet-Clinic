package com.spring5.animalmagnetismpetclinic.controllers;

import com.spring5.animalmagnetismpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","vets/index.html","vets","vets/index"})
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/vetIndex";
    }
}
