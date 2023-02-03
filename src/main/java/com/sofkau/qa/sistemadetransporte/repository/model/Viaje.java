package com.sofkau.qa.sistemadetransporte.repository.model;

import java.time.LocalDateTime;
import java.util.List;

public class Viaje {
    private int id;
    private LocalDateTime fechaHora;
    private Destino destino;
    private Bus bus;
    private List<Pasajero> pasajero;

    public Viaje(int id, LocalDateTime fechaHora, Destino destino, Bus bus, List<Pasajero> pasajero) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.destino = destino;
        this.bus = bus;
        this.pasajero = pasajero;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Pasajero> getPasajero() {
        return pasajero;
    }

    public void setPasajero(List<Pasajero> pasajero) {
        this.pasajero = pasajero;
    }
}
