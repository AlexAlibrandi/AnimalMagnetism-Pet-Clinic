package com.spring5.animalmagnetismpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"vets/index.html","vets","vets/index"})
    public String listVets(){

        return "vets/vetIndex";
    }
}
