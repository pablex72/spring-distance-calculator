package com.distance.project.service;

import com.distance.project.model.Province;
import com.distance.project.repository.IProvinceRepository;
import com.distance.project.utils.DistanceCalculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistanceService {

    private final IProvinceRepository provinceRepository;
    private final DistanceCalculator distanceCalculator;

    public DistanceService(IProvinceRepository provinceRepository, DistanceCalculator distanceCalculator) {
        this.provinceRepository = provinceRepository;
        this.distanceCalculator = distanceCalculator;
    }

    public double calculateShortestDistance(double lat, double lon) {
        List<Province> provinces = provinceRepository.findAll();
        double shortestDistance = Double.MAX_VALUE;

        for (Province province : provinces) {
            double targetLat = province.getLatitude();
            double targetLon = province.getLongitude();
            double distance = distanceCalculator.calculate(lat, lon, targetLat, targetLon);

            if (distance < shortestDistance) {
                shortestDistance = distance;
            }
        }

        return shortestDistance;
    }
}
