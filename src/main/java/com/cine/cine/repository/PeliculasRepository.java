package com.cine.cine.repository;

import com.cine.cine.entity.Peliculas;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PeliculasRepository extends CrudRepository<Peliculas,Long> {
    
}
