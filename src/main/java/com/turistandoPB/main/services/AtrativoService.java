package com.turistandoPB.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turistandoPB.main.repositories.AtrativoRepository;

@Service
public class AtrativoService {
	
	@Autowired
	private AtrativoRepository atrativoRepositoty;
	

}
