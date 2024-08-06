package com.distance.project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "provinces")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double latitude;  // Add latitude field
    private double longitude; // Add longitude field

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    @JsonBackReference
    private Country country;

    public Province(String name, double latitude, double longitude, Country country) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
    }
}
