package com.spring5.animalmagnetismpetclinic.services;

import com.spring5.animalmagnetismpetclinic.models.Pet;

public interface PetService extends CrudService<Pet,Long>{

    Pet findByLastName(String lastName);

}
