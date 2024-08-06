package com.distance.project.model;

// Provider.java
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private String province;
    private String city;
    private double latitude;
    private double longitude;
    private int distance; // Añadir campo para almacenar la distancia

    // Getters y setters

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
