package com.cine.cine.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Peliculas implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long id;
        private String pelicula;
        private int entrada;
        private String fecha;
        private int capacidad;
        
        @ManyToOne
        @JoinColumn (name="salas_id")
        private Salas salas;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the pelicula
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * @return the entrada
     */
    public int getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the salas
     */
    public Salas getSalas() {
        return salas;
    }

    /**
     * @param salas the salas to set
     */
    public void setSalas(Salas salas) {
        this.salas = salas;
    }

        
    
}
