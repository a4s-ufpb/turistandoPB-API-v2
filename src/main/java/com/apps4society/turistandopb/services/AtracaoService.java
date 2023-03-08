package com.apps4society.turistandopb.services;

import com.apps4society.turistandopb.entities.Atracao;
import com.apps4society.turistandopb.repositories.AtracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AtracaoService {

    @Autowired
    private AtracaoRepository repository;

    public List<Atracao> findAll(){
        return repository.findAll();
    }


}
