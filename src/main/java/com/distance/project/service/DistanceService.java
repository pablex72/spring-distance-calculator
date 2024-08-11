package com.distance.project.service;

import com.distance.project.dto.DistanceResult;
import com.distance.project.model.Coordinates;
import com.distance.project.model.Province;
import com.distance.project.repository.IProvinceRepository;
import com.distance.project.utils.DistanceCalculator;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DistanceService {

    private final IProvinceRepository provinceRepository;
    private final DistanceCalculator distanceCalculator;
    private final GeocodingService geocodingService;

    public DistanceService(IProvinceRepository provinceRepository, DistanceCalculator distanceCalculator, GeocodingService geocodingService) {
        this.provinceRepository = provinceRepository;
        this.distanceCalculator = distanceCalculator;
        this.geocodingService = geocodingService;
    }

    public List<DistanceResult> calculateTop5ShortestDistances(double lat, double lon) {
        List<Province> provinces = provinceRepository.findAll();

        List<DistanceResult> distanceResults = new ArrayList<>();

        for (Province province : provinces) {

            // Normaliza el nombre de la provincia para eliminar acentos
            String normalizedProvinceName = Normalizer.normalize(province.getName(), Normalizer.Form.NFD);
            normalizedProvinceName = normalizedProvinceName.replaceAll("\\p{M}", "");

            // Formatea el nombre de la provincia (reemplaza espacios por +)
            String formattedProvinceName = normalizedProvinceName.replace(" ", "+");

            Coordinates coordinates = geocodingService.getCoordinatesByName(formattedProvinceName);
            double targetLat = Double.parseDouble(coordinates.getLatitude());
            double targetLon = Double.parseDouble(coordinates.getLongitude());
            double distance = distanceCalculator.calculate(lat, lon, targetLat, targetLon);

            distanceResults.add(new DistanceResult(province, distance));
        }

        // Ordena la lista por distancia
        Collections.sort(distanceResults, (dr1, dr2) -> Double.compare(dr1.getDistance(), dr2.getDistance()));

        // Retorna los 5 resultados más cortos
        return distanceResults.size() > 5 ? distanceResults.subList(0, 5) : distanceResults;
    }
}
