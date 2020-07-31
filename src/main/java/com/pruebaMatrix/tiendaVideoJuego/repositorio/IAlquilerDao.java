package com.pruebaMatrix.tiendaVideoJuego.repositorio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Alquiler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IAlquilerDao extends CrudRepository<Alquiler, Integer> {
    public List<Alquiler> findByAlFechaInicio(Date fechaInicio);
}
