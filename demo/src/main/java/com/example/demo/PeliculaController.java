package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController(){
        peliculas.add(new Pelicula(1,"Gladiador", 2000,"Ridley Scott","Acción","Máximo, general romano, desea volver a casa, pero el emperador Marco Aurelio quiere que herede el imperio."));
        peliculas.add(new Pelicula(2, "La Momia", 1999,"Stephen Sommers","Acción", "Rick O'Connell y un compañero descubren las ruinas de Hamunaptra, donde, luego, un grupo de jóvenes provocan la resurrección de la momia de un diabólico sacerdote egipcio"));
        peliculas.add(new Pelicula(3, "Armageddon", 1998,"Michael Bay","Acción","Cuando el Gobierno estadounidense descubre que solo tiene 18 días para salvar al mundo de un asteroide, un equipo de astronautas es enviado al espacio con la misión de salvar a la Tierra de la destrucción."));
        peliculas.add(new Pelicula(4,"La Lista de Schindler", 1993,"Steven Spielberg","Cine bélico, cine biográfico y drama","El empresario alemán Oskar Schindler, miembro del Partido Nazi, pone en marcha un elaborado, costoso y arriesgado plan para salvar a más de mil judíos del Holocausto."));
        peliculas.add(new Pelicula(5, "La naranja mecánica", 1971, "Stanley Kubrick","Ciencia ficción,Comedia negra","Un criminal en la Inglaterra del futuro pasa una serie de procesos experimentales para corregir sus impulsos violentos."));
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas(){
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula: peliculas){
            if(pelicula.getId() == id){
                return pelicula;
            }
        }
        return null;
    }
    
    

    
}
