package com.apps4society.turistandopb.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import javax.persistence.PostLoad;
import javax.validation.Valid;

import com.apps4society.turistandopb.dto.TuristandoPBDto;
import com.apps4society.turistandopb.model.Attraction;
import com.apps4society.turistandopb.repository.AttractionRepository;
import com.apps4society.turistandopb.services.AttractionService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/attractions")
@AllArgsConstructor
public class AttractionController {

    private final AttractionService attractionSercive;
    private final AttractionRepository attractionRepository;


    @PostMapping
    public ResponseEntity<Object> saveAttraction(@RequestBody @Valid TuristandoPBDto turistandoPBDto){
        if(attractionSercive.existsByNameAndCity(turistandoPBDto.getName(), turistandoPBDto.getCity())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Attraction already exist!");
        }
        var attraction = new Attraction();
        BeanUtils.copyProperties(turistandoPBDto, attraction);
        return ResponseEntity.status(HttpStatus.CREATED).body(attractionSercive.save(attraction));
    }
    
   @GetMapping
    public ResponseEntity<List<Attraction>> getAllAttractions() {
        return ResponseEntity.status(HttpStatus.OK).body(attractionRepository.findAll());
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneAttraction(@PathVariable(value = "id") Long id) {
        Optional<Attraction> attractionOptional = attractionSercive.findById(id);
        if (!attractionOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Attraction not found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(attractionOptional.get());
    } 
    
    public ResponseEntity<Object> findAttractionByCIty(@PathVariable(value = "city") String city) {
        Optional<Attraction> attractionOptional = attractionSercive.findByCity(city);
        if (!attractionOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Attraction not found!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(attractionOptional.get());
    } 
    

    
    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteAttraction (@PathVariable(value = "id") Long id){
        Optional<Attraction> attractionOptional = attractionSercive.findById(id);
        if (!attractionOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Attraction not found!");
        }
        attractionSercive.delete(attractionOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(("Attraction deleted sucessfully."));
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> updateAttraction(@PathVariable(value ="id")Long id,@RequestBody @Valid TuristandoPBDto turistandoPBDto) {
    Optional<Attraction> attractionOptional = attractionSercive.findById(id);                                                    
     if (!attractionOptional.isPresent()){
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Attraction not found!");
    }
    var attraction = new Attraction();
        BeanUtils.copyProperties(turistandoPBDto, attraction);
        attraction.setId(attractionOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(attractionSercive.save(attraction));

    }
    

}
