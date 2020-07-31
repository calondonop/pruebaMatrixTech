package com.pruebaMatrix.tiendaVideoJuego.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id")
    private int cliId;

    @Column(name = "cli_nombre")
    private String cliNombre;

    @Column(name = "cli_edad")
    private int cliEdad;

    public int getCliId() {
        return cliId;
    }

    public void setCliId(int cliId) {
        this.cliId = cliId;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public int getCliEdad() {
        return cliEdad;
    }

    public void setCliEdad(int cliEdad) {
        this.cliEdad = cliEdad;
    }
    private static final long serialVersionUID = 1L;
}
