package com.qualco.challenge.repositories;

import com.qualco.challenge.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
