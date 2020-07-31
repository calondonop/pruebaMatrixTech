package com.pruebaMatrix.tiendaVideoJuego.controlador;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Juego;
import com.pruebaMatrix.tiendaVideoJuego.servicio.IJuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/juegos")
public class JuegoRestController {

    @Autowired
    IJuegoService juegoService;

    @GetMapping("/protagonista")
    public List<Juego> findByjuProtagonista(){
        return juegoService.findByjuProtagonista("Natan Drake");
    }

    @GetMapping("/director")
    public List<Juego> findByjuDirector(){
        return juegoService.findByjuDirector("Susan");
    }

    @GetMapping("/marcaoproductor")
    public List<Juego> findByjuMarcaOrjuProductor(String marca, String productor){
        return juegoService.findByjuMarcaOrjuProductor("EA", "Y");
    }

    @GetMapping("/marcayproductor")
    public List<Juego> findByjuMarcaAndjuProductor(String marca, String productor){
        return juegoService.findByjuMarcaAndjuProductor("EA", "Charles");
    }

    @GetMapping("/juegomasrentado")
    public List<Juego> juegoMasRentado(){
        return juegoService.juegoMasRentado();
    }


}

