package com.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class Vet extends Person{

    private Set<Specialty> specialities = new HashSet<>();

    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
