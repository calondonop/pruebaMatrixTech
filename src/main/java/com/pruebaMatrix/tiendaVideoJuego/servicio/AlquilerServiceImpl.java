package com.pruebaMatrix.tiendaVideoJuego.servicio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Alquiler;
import com.pruebaMatrix.tiendaVideoJuego.repositorio.IAlquilerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AlquilerServiceImpl implements IAlquilerService {

    @Autowired
    private IAlquilerDao alquilerDao;

    @Override
    public List<Alquiler> findByAlFechaInicio(Date fechaInicio) {
        return alquilerDao.findByAlFechaInicio(fechaInicio);
    }
}
