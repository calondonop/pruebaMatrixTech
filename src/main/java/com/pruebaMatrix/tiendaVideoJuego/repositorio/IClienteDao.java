package com.pruebaMatrix.tiendaVideoJuego.repositorio;

import com.pruebaMatrix.tiendaVideoJuego.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IClienteDao extends JpaRepository<Cliente, Integer> {

    @Query(value = "select * \n" +
            "from alquiler, cliente\n" +
            "where cli_id = al_id_cliente\n" +
            "group by al_id_cliente\n" +
            "order by count(al_id_cliente) desc\n" +
            "limit 1", nativeQuery = true)
    List<Cliente> clienteMasFrecuente();
}
