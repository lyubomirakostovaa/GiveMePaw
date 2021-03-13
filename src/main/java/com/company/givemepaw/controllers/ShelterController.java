package com.company.givemepaw.controllers;

import com.company.givemepaw.models.Shelter;
import com.company.givemepaw.services.ShelterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shelters")
public class ShelterController {
    private ShelterServiceImpl shelterService;

    @Autowired
    public ShelterController(ShelterServiceImpl shelterService) {
        this.shelterService = shelterService;
    }

    @GetMapping
    public List<Shelter> getAll() {
        return shelterService.getAll();
    }
}


//TODO http://www.ace-charity.org/nl/
//TODO https://developer.okta.com/blog/2018/07/19/simple-crud-react-and-spring-boot
//TODO https://reactjs.org/tutorial/tutorial.html
