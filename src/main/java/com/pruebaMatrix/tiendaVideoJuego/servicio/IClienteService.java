package com.pruebaMatrix.tiendaVideoJuego.servicio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Cliente;

import java.util.List;

public interface IClienteService {
    //métodos del CRUD
    public List<Cliente> findAll();
    public List<Cliente> clienteMasFrecuente();
}
