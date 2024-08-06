package com.distance.project.service;

import com.distance.project.model.Province;
import com.distance.project.repository.IProvinceRepository;
import com.distance.project.utils.DistanceCalculator;
import org.springframework.stereotype.Service;

@Service
public class DistanceService {

    private final IProvinceRepository provinceRepository;
    private final DistanceCalculator distanceCalculator;

    public DistanceService(IProvinceRepository provinceRepository, DistanceCalculator distanceCalculator) {
        this.provinceRepository = provinceRepository;
        this.distanceCalculator = distanceCalculator;
    }

    public double calculateDistance(double lat, double lon, Long provinceId) {
        Province targetProvince = provinceRepository.findById(provinceId)
                .orElseThrow(() -> new IllegalArgumentException("Province not found"));

        double targetLat = targetProvince.getLatitude();  // assuming Province has getLatitude() and getLongitude() methods
        double targetLon = targetProvince.getLongitude();

        return distanceCalculator.calculate(lat, lon, targetLat, targetLon);
    }
}
