package com.distance.project.service;

import com.distance.project.model.Province;

import java.util.List;

public interface IProvinceService {

    Province getProvinceById(Long id);
    List<Province> getProvincesByCountryId(Long countryId);
}
