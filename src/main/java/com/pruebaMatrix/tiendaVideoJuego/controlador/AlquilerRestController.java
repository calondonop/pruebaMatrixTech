package com.pruebaMatrix.tiendaVideoJuego.controlador;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Alquiler;
import com.pruebaMatrix.tiendaVideoJuego.servicio.AlquilerServiceImpl;
import com.pruebaMatrix.tiendaVideoJuego.servicio.IAlquilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/alquiler")
public class AlquilerRestController {

    @Autowired
    private IAlquilerService alquilerService;

    @GetMapping("/deldia")
    public List<Alquiler> findByAlFechaInicio(){
        return alquilerService.findByAlFechaInicio(new Date());
    }
}
