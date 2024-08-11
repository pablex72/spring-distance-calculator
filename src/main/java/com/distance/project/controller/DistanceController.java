package com.distance.project.controller;

import aj.org.objectweb.asm.TypeReference;
import com.distance.project.dto.DistanceResult;
import com.distance.project.dto.NominatimResponseUpd;
import com.distance.project.service.DistanceService;
import com.distance.project.model.Province;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/distance")
public class DistanceController {

    @Autowired
    RestTemplate restTemplate;
    private final DistanceService distanceService;

    public DistanceController(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping("/calculate")
    public List<DistanceResult> calculateTop5ShortestDistances(@RequestParam double lat, @RequestParam double lon) {
        return distanceService.calculateTop5ShortestDistances(lat, lon);
    }

    @GetMapping("/test")
    public ResponseEntity<String> getApi() {
//        String url = "https://nominatim.openstreetmap.org/search?q=Buenos%20Aires,Argentina&format=json&limit=1";
        String url = "https://jsonplaceholder.typicode.com/todos/1";

        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                String.class
        );
        System.out.println(response);
        String responseBody = response.getBody();
        System.out.println("Response Body: " + responseBody);
        return ResponseEntity.ok(responseBody);
    }

    @GetMapping("/test/list")
    public List<NominatimResponseUpd> getList() {
        String url = "https://nominatim.openstreetmap.org/search?q=Buenos+Aires,Argentina&format=json&limit=1";

        NominatimResponseUpd[] results = restTemplate.getForObject(url, NominatimResponseUpd[].class);
        System.out.println("results --> " + Arrays.toString(results));
        return Arrays.asList(results);
    }




//    private final RestTemplate restTemplate;
//
//    public ApiController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }


}
