package com.company.givemepaw.repositories;

import com.company.givemepaw.models.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRepository extends JpaRepository<Shelter, Integer> {
}
