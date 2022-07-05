package com.cine.cine.service;

import com.cine.cine.entity.Peliculas;
import com.cine.cine.repository.PeliculasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class PeliculasService implements IPeliculasService{

    @Autowired
    private PeliculasRepository peliculasRepository;
    
    @Override
    public List<Peliculas> getALLPeliculas() {
      return (List<Peliculas>)peliculasRepository.findAll();
    }

    @Override
    public Peliculas getPeliculasById(long id) {
        return peliculasRepository.findById(id).orElse(null);
    }

    @Override
    public void savePeliculas(Peliculas peliculas) {
        peliculasRepository.save(peliculas);
    }

    @Override
    public void delete(long id) {
    peliculasRepository.deleteById(id);
    }
    
}
