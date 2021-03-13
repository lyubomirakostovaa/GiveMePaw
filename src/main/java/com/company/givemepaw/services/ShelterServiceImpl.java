package com.company.givemepaw.services;

import com.company.givemepaw.models.Shelter;
import com.company.givemepaw.repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterServiceImpl {
    private ShelterRepository shelterRepository;

    @Autowired
    public ShelterServiceImpl(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    public List<Shelter> getAll() {
        return shelterRepository.findAll();
    }
}
