package com.distance.project.dto;

import com.distance.project.model.Province;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DistanceResult {
    private Province province;
    private double distance;

    public DistanceResult(Province province, double distance) {
        this.province = province;
        this.distance = distance;
    }
}
