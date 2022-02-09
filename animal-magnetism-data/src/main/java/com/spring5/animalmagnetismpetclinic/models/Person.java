package com.spring5.animalmagnetismpetclinic.models;

import lombok.Data;

@Data
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;
}
