package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;

import java.util.List;

public interface IPasajero {
    Pasajero crearPasajero(Pasajero pasajero);
    List<Pasajero> obtenerListaPasajeros();
    Pasajero obtenerPasajero(Long id);
    Pasajero actualizarPasajero(Pasajero pasajero);
    void eliminarPasajero(Long id);
}
