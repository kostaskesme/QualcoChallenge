package com.qualco.challenge.controllers;

import com.qualco.challenge.model.Country;
import com.qualco.challenge.model.Language;
import com.qualco.challenge.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;
    @GetMapping(value = "/countries")
    @CrossOrigin
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @GetMapping(value = "/countries/{id}")
    @CrossOrigin
    public Country getAllCountries(@PathVariable("id") Integer id) {
        return  Optional.of(countryRepository.findById(id).get()).orElse(null);
    }
}
