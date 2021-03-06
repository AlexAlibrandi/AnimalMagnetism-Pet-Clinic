package com.spring5.animalmagnetismpetclinic.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
