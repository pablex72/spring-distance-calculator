package com.distance.project.service;

import com.distance.project.dto.NominatimResponse;
import com.distance.project.model.Coordinates;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Service
public class GeocodingService {

    @Value("${nominatim.api.url}")
    private String nominatimApiUrl;

    private final RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(GeocodingService.class);

    public GeocodingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Coordinates getCoordinatesByName(String placeName) {
        // Ajusta el nombre del lugar para incluir el país si es necesario
        String adjustedPlaceName = placeName;

        String url = UriComponentsBuilder.fromHttpUrl(nominatimApiUrl)
                .queryParam("q", adjustedPlaceName)
                .queryParam("format", "json")
                .queryParam("limit", 1)
                .toUriString();

        Object answersJson = restTemplate.getForObject(url, Object.class);
        NominatimResponse[] response = restTemplate.getForObject(url, NominatimResponse[].class);

        if (response == null || response.length == 0) {
            logger.error("No coordinates found for the given place name: {}", placeName);
            throw new IllegalArgumentException("No coordinates found for the given place name.");
        }
        NominatimResponse result = response[0];
        return new Coordinates(result.getLat(), result.getLon());
    }
}
