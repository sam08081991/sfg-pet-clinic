package com.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class Vet extends Person{

    private Set<Speciality> specialities;

    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
