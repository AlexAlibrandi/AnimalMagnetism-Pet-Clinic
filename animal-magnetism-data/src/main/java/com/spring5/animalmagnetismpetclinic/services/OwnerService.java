package com.spring5.animalmagnetismpetclinic.services;

import com.spring5.animalmagnetismpetclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
