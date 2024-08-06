package com.distance.project.repository;
import com.distance.project.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {
}
