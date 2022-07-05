package com.cine.cine.service;

import com.cine.cine.entity.Salas;
import com.cine.cine.repository.SalasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalasService implements ISalasService {

    @Autowired
    private SalasRepository salasRepository;
    @Override
    public List<Salas> listSalas() {
        return (List<Salas>) salasRepository.findAll();
    }
    
}