package com.cine.cine.controller;

import com.cine.cine.entity.Salas;
import com.cine.cine.entity.Peliculas;
import com.cine.cine.service.ISalasService;
import com.cine.cine.service.IPeliculasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author carlo
 */
@Controller
public class PeliculasController {

    @Autowired
    private IPeliculasService peliculasService;
    @Autowired
    private ISalasService salasService;

    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Peliculas> listaPeliculas = peliculasService.getALLPeliculas();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("peliculas", listaPeliculas);
        //retorna el html 
        return "peliculas";

    }

    @GetMapping("/peliculasN")
    public String crearPeliculas(Model model) {
        List<Salas> listaSalas = salasService.listSalas();
        model.addAttribute("peliculas", new Peliculas());
        model.addAttribute("salas", listaSalas);
        return "Crear";

    }

    @PostMapping("/save")
    public String guardarPeliculas(@ModelAttribute Peliculas peliculas) {
        peliculasService.savePeliculas(peliculas);

        return "redirect:/peliculas";
    }

    @GetMapping("/editPeliculas/{id}")
    public String editarPeliculas(@PathVariable("id") Long idPeliculas, Model model) {
        Peliculas peliculas = peliculasService.getPeliculasById(idPeliculas);
        List<Salas> listaSalas = salasService.listSalas();
        model.addAttribute("peliculas", peliculas);
        model.addAttribute("salas", listaSalas);
        return "Crear";
    }

    @GetMapping("/delete/{id}")
    public String editarPeliculas(@PathVariable("id") Long idPeliculas) {
        peliculasService.delete(idPeliculas);

        return "redirect:/peliculas";
    }

}
