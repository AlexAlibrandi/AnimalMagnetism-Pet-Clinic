package com.spring5.animalmagnetismpetclinic.services;

import com.spring5.animalmagnetismpetclinic.models.Vet;

import java.util.Set;

public interface VetService{

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
