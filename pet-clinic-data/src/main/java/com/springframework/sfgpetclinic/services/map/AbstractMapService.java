package com.springframework.sfgpetclinic.services.map;

import com.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long>{

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(this.map.values());
    }

    T findById(ID id) {
        return this.map.get(id);
    }

    T save(ID id, T object) {

        if (object != null ) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id) {
        this.map.remove(id);
    }

    void delete(T object) {
        this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1;
        }
        catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
