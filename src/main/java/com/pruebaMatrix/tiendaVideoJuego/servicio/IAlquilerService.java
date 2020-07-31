package com.pruebaMatrix.tiendaVideoJuego.servicio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Alquiler;

import java.util.Date;
import java.util.List;

public interface IAlquilerService {
    List<Alquiler> findByAlFechaInicio(Date fechaInicio);
}
