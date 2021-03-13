package com.company.givemepaw.services;

import com.company.givemepaw.models.SellAd;
import com.company.givemepaw.repositories.SellAdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellAdServiceImpl {
    private SellAdRepository sellAdRepository;

    @Autowired
    public SellAdServiceImpl(SellAdRepository sellAdRepository) {
        this.sellAdRepository = sellAdRepository;
    }

    public List<SellAd> getAll() {
        return sellAdRepository.findAll();
    }
}
