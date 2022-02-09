package com.spring5.animalmagnetismpetclinic.services;

import com.spring5.animalmagnetismpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
