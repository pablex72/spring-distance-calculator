package com.distance.project.service;


import com.distance.project.model.Country;

import java.util.List;

public interface ICountryService {

    List<Country> getAllCountries();

    Country getCountryById(Long id);
}
