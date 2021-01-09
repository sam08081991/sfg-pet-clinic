package com.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
