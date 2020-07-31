package com.pruebaMatrix.tiendaVideoJuego.servicio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Juego;
import com.pruebaMatrix.tiendaVideoJuego.repositorio.IJuegoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegoService implements IJuegoService {

    @Autowired
    IJuegoDao juegoDao;

    @Override
    public List<Juego> findByjuProtagonista(String protagonista) {
        return juegoDao.findByjuProtagonista(protagonista);
    }

    @Override
    public List<Juego> findByjuDirector(String director) {
        return juegoDao.findByjuDirector(director);
    }

    @Override
    public List<Juego> findByjuMarcaOrjuProductor(String marca, String productor) {
        return juegoDao.findByjuMarcaOrJuProductor(marca, productor);
    }

    @Override
    public List<Juego> findByjuMarcaAndjuProductor(String marca, String productor) {
        return juegoDao.findByjuMarcaAndJuProductor(marca, productor);
    }

    @Override
    public List<Juego> juegoMasRentado() {
        return juegoDao.juegoMasRentado();
    }
}
