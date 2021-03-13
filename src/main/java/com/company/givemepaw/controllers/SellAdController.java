package com.company.givemepaw.controllers;

import com.company.givemepaw.models.SellAd;
import com.company.givemepaw.services.SellAdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sell-add")
public class SellAdController {
    private SellAdServiceImpl sellAdService;

    @Autowired
    public SellAdController(SellAdServiceImpl sellAdService) {
        this.sellAdService = sellAdService;
    }

    @GetMapping
    public List<SellAd> getAll() {
        return sellAdService.getAll();
    }
}
