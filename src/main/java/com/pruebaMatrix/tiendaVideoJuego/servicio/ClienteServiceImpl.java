package com.pruebaMatrix.tiendaVideoJuego.servicio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Cliente;
import com.pruebaMatrix.tiendaVideoJuego.repositorio.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> clienteMasFrecuente() {
        return (List<Cliente>) clienteDao.clienteMasFrecuente();
    }


}
