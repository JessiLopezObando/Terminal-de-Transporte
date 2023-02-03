package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.PasajeroRepository;
import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PasajeroService implements IPasajero {

    private final PasajeroRepository pasajeroRepository;

    public PasajeroService(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    /**
     * La clase PasajeroService implementa la interfaz IPasajero.
     * Proporciona implementaciones concretas para los métodos definidos en la interfaz.
     * En este caso, se almacenan los pasajeros en una lista en memoria en PasajeroRepository.
     */

    @Override
    public Pasajero crearPasajero(Pasajero pasajero) {
        return pasajeroRepository.crearPasajero(pasajero);
    }

    @Override
    public List<Pasajero> obtenerListaPasajeros() {
        return pasajeroRepository.obtenerListaPasajeros();
    }

    @Override
    public Pasajero obtenerPasajero(Long id) {
        return pasajeroRepository.obtenerPasajero(id);
    }

    @Override
    public Pasajero actualizarPasajero(Pasajero pasajero) {
        return pasajeroRepository.actualizarPasajero(pasajero);
    }

    @Override
    public void eliminarPasajero(Long id) {
        pasajeroRepository.eliminarPasajero(id);
    }
}
