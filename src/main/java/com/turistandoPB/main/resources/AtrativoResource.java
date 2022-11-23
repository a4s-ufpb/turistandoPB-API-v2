package com.turistandoPB.main.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turistandoPB.main.services.AtrativoService;

@RestController
@RequestMapping(value = "/atrativos")
public class AtrativoResource {
	
	@Autowired
	private AtrativoService atrativoService;

}
