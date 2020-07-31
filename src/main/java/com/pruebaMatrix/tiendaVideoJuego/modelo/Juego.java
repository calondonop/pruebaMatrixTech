package com.pruebaMatrix.tiendaVideoJuego.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "juego")
public class Juego implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ju_id")
    private int juId;

    @Column(name = "ju_anio")
    private int juAnio;

    @Column(name = "ju_titulo")
    private String juTitulo;

    @Column(name = "ju_director")
    private String juDirector;

    @Column(name = "ju_protagonista")
    private String juProtagonista;

    @Column(name = "ju_productor")
    private String juProductor;

    @Column(name = "ju_marca")
    private String juMarca;

    @Column(name = "ju_tecnologia")
    private String juTecnologia;

    @Column(name = "ju_precio_alquiler")
    private int juPrecioAlquiler;

    public int getJuId() {
        return juId;
    }

    public void setJuId(int juId) {
        this.juId = juId;
    }

    public int getJuAnio() {
        return juAnio;
    }

    public void setJuAnio(int juAnio) {
        this.juAnio = juAnio;
    }

    public String getJuTitulo() {
        return juTitulo;
    }

    public void setJuTitulo(String juTitulo) {
        this.juTitulo = juTitulo;
    }

    public String getJuDirector() {
        return juDirector;
    }

    public void setJuDirector(String juDirector) {
        this.juDirector = juDirector;
    }

    public String getJuProtagonista() {
        return juProtagonista;
    }

    public void setJuProtagonista(String juProtagonista) {
        this.juProtagonista = juProtagonista;
    }

    public String getJuProductor() {
        return juProductor;
    }

    public void setJuProductor(String juProductor) {
        this.juProductor = juProductor;
    }

    public String getJuMarca() {
        return juMarca;
    }

    public void setJuMarca(String juMarca) {
        this.juMarca = juMarca;
    }

    public String getJuTecnologia() {
        return juTecnologia;
    }

    public void setJuTecnologia(String juTecnologia) {
        this.juTecnologia = juTecnologia;
    }

    public int getJuPrecioAlquiler() {
        return juPrecioAlquiler;
    }

    public void setJuPrecioAlquiler(int juPrecioAlquiler) {
        this.juPrecioAlquiler = juPrecioAlquiler;
    }

    private static final long serialVersionUID = 1L;
}
