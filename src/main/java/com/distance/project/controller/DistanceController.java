package com.distance.project.controller;

import com.distance.project.service.DistanceService;
import com.distance.project.model.Province;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/distance")
public class DistanceController {

    private final DistanceService distanceService;

    public DistanceController(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping("/calculate")
    public double calculateDistance(@RequestParam double lat, @RequestParam double lon, @RequestParam Long provinceId) {
        return distanceService.calculateDistance(lat, lon, provinceId);
    }
}
