package com.distance.project.repository;

// ProviderRepository.java
import com.distance.project.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    List<Provider> findAll();
}

