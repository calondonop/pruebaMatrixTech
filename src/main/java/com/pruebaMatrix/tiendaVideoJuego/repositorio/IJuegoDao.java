package com.pruebaMatrix.tiendaVideoJuego.repositorio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJuegoDao extends JpaRepository<Juego, Integer> {
    List<Juego> findByjuProtagonista(String protagonista);
    List<Juego> findByjuDirector(String director);
    List<Juego> findByjuMarcaOrJuProductor(String marca, String productor);
    List<Juego> findByjuMarcaAndJuProductor(String marca, String productor);

    @Query(value = "select j.*\n" +
            "from alquiler a, juego j\n" +
            "where al_id_juego = ju_id\n" +
            "group by al_id_juego\n" +
            "order by count(al_id_juego) desc\n" +
            "limit 1", nativeQuery = true)
    List<Juego> juegoMasRentado();
}
