package com.distance.project.repository;
import com.distance.project.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProvinceRepository extends JpaRepository<Province, Long> {
    List<Province> findByCountryId(Long countryId);
}
