package com.microws.entity;

import java.sql.Timestamp;

public class SolicitarFolio {
    private String origen;
    private String destino;
    private Timestamp fechaAtencion;
    private String numeroSiniestro;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Timestamp getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Timestamp fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    
    public String getNumeroSiniestro() {
        return numeroSiniestro;
    }

    public void setNumeroSiniestro(String numeroSiniestro) {
        this.numeroSiniestro = numeroSiniestro;
    }
    
    
}
