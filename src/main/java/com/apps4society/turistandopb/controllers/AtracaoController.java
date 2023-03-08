package com.apps4society.turistandopb.controllers;

import com.apps4society.turistandopb.entities.Atracao;
import com.apps4society.turistandopb.services.AtracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/atracoes")
public class AtracaoController {

    @Autowired
    private AtracaoService service;

    @GetMapping
    public ResponseEntity<List<Atracao>> findAll(){
        List<Atracao> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
