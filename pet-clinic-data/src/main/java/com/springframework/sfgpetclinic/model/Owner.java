package com.springframework.sfgpetclinic.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Owner extends Person{

    public Owner(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

}
