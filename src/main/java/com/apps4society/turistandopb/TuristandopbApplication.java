package com.apps4society.turistandopb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import com.apps4society.turistandopb.model.Attraction;
import com.apps4society.turistandopb.repository.AttractionRepository;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class TuristandopbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuristandopbApplication.class, args);
	}



}
