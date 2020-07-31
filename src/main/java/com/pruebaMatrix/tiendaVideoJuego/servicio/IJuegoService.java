package com.pruebaMatrix.tiendaVideoJuego.servicio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Juego;

import java.util.List;

public interface IJuegoService {
    List<Juego> findByjuProtagonista(String protagosnita);
    List<Juego> findByjuDirector(String protagosnita);
    List<Juego> findByjuMarcaOrjuProductor(String marca, String productor);
    List<Juego> findByjuMarcaAndjuProductor(String marca, String productor);
    List<Juego> juegoMasRentado();
}
