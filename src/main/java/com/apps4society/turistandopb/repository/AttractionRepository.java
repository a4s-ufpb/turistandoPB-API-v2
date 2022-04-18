package com.apps4society.turistandopb.repository;

import java.util.List;
import java.util.Optional;

import com.apps4society.turistandopb.model.Attraction;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {

    List<Attraction> findByType(String type);

    boolean existsByNameAndCity(String name, String city);

    List<Attraction> findByName(String name);

    List<Attraction> findByDescription(String description);

    Optional<Attraction> findByCity(String city);
    
    List<Attraction> findBystate(String state);



    
}
