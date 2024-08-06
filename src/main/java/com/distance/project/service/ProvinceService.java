package com.distance.project.service;


import com.distance.project.model.Province;
import com.distance.project.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService implements IProvinceService {

    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Province getProvinceById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Province> getProvincesByCountryId(Long countryId) {
        return provinceRepository.findByCountryId(countryId);
    }
}
