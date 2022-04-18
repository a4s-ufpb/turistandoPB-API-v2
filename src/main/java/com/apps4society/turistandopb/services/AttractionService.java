package com.apps4society.turistandopb.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.apps4society.turistandopb.model.Attraction;
import com.apps4society.turistandopb.repository.AttractionRepository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor

@Service
public class AttractionService {
    
    private final AttractionRepository AttractionRepository;

    @Transactional
    public Attraction save(Attraction attraction) {
        return AttractionRepository.save(attraction);
    }
    public List<Attraction> findAll(){
        return AttractionRepository.findAll();
    }

    public Optional<Attraction> findById(Long id) {
        return AttractionRepository.findById(id);
    }
    public Optional<Attraction> findByCity(String city) {
        return AttractionRepository.findByCity(city);
    }

	public boolean existsByNameAndCity(String name, String city) {
		return AttractionRepository.existsByNameAndCity(name, city);
	}
    @Transactional
    public void delete(Attraction attraction) {
        AttractionRepository.delete(attraction);
    }
    

}
