package com.pruebaMatrix.tiendaVideoJuego.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "alquiler")
public class Alquiler implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "al_id")
    private int alId;
    //La notación @Column se usa cuando la columna tiene un nombre diferente en BD
    @Column(name = "al_id_cliente")
    private int alIdCliente;
    @Column(name = "al_id_juego")
    private int alIdJuego;

    @Temporal(TemporalType.DATE)
    @Column(name = "al_fecha_inicio")
    private Date alFechaInicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "al_fecha_devolucion")
    private Date alFechaDevolucion;

    public int getAlId() {
        return alId;
    }

    public void setAlId(int alId) {
        this.alId = alId;
    }

    public int getAlIdCliente() {
        return alIdCliente;
    }

    public void setAlIdCliente(int alIdCliente) {
        this.alIdCliente = alIdCliente;
    }

    public int getAlIdJuego() {
        return alIdJuego;
    }

    public void setAlIdJuego(int alIdJuego) {
        this.alIdJuego = alIdJuego;
    }

    public Date getAlFechaInicio() {
        return alFechaInicio;
    }

    public void setAlFechaInicio(Date alFechaInicio) {
        this.alFechaInicio = alFechaInicio;
    }

    public Date getAlFechaDevolucion() {
        return alFechaDevolucion;
    }

    public void setAlFechaDevolucion(Date alFechaDevolucion) {
        this.alFechaDevolucion = alFechaDevolucion;
    }
    private static final long serialVersionUID = 1L;
}
