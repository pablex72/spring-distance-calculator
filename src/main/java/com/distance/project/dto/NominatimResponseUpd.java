package com.distance.project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NominatimResponseUpd {
        @JsonProperty("place_id")
        private String placeId;

        private String licence;

        @JsonProperty("osm_type")
        private String osmType;

        @JsonProperty("osm_id")
        private String osmId;

        private String lat;

        private String lon;

        @JsonProperty("class")
        private String classType;

        private String type;

        @JsonProperty("place_rank")
        private int placeRank;

        private double importance;

        @JsonProperty("addresstype")
        private String addressType;

        private String name;

        @JsonProperty("display_name")
        private String displayName;

        @JsonProperty("boundingbox")
        private List<String> boundingBox;

        // Getters and Setters
}

