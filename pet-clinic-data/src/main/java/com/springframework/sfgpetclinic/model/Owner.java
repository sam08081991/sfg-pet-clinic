package com.springframework.sfgpetclinic.model;

import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
public class Owner extends Person{
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public Owner(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

}
