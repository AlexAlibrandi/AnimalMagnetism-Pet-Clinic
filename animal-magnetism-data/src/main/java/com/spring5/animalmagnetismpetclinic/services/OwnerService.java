package com.spring5.animalmagnetismpetclinic.services;

import com.spring5.animalmagnetismpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
