package com.cine.cine.service;

import com.cine.cine.entity.Peliculas;
import java.util.List;


public interface IPeliculasService {
    public  List<Peliculas> getALLPeliculas();
    public Peliculas getPeliculasById (long id);
    public void savePeliculas(Peliculas peliculas);
    public void delete (long id);
}