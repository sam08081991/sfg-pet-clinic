package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.Specialty;
import com.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty speciality) {
        super.delete(speciality);
    }

    @Override
    public Specialty save(Specialty speciality) {
        return super.save(speciality.getId(), speciality);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
