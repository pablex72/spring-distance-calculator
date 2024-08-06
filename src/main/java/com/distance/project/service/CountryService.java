package com.distance.project.service;

import com.distance.project.model.Country;
import com.distance.project.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private ICountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }
}
