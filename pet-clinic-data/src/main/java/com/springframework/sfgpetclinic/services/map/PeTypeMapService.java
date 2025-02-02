package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.PetType;
import com.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PeTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType.getId(), petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
