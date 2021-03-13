package com.company.givemepaw.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shelters")
@Data
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "shelter_name")
    private String shelterName;

    @Column(name = "address")
    private String address;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "availability")
    private int availability;

    @Column(name = "has_doctor")
    private boolean hasDoctor;
}
