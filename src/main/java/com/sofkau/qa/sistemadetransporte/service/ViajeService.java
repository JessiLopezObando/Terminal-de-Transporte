package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.ViajeRepository;
import com.sofkau.qa.sistemadetransporte.repository.model.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeService implements IViaje {

    /**
     * La clase ViajeService implementa la interfaz IViaje.
     * Proporciona implementaciones concretas para los métodos definidos en la interfaz.
     * En este caso, se almacenan los viajes en una lista en memoria de viajesRepository.
     */
    @Autowired
    private final ViajeRepository viajeRepository;

    public ViajeService(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public Viaje crearViaje(Viaje viaje) {
        return viajeRepository.crearViaje(viaje);
    }

    @Override
    public List<Viaje> obtenerListaViajes() {
        return viajeRepository.obtenerListaViajes();
    }

    @Override
    public Viaje obtenerViaje(int id) {
        return viajeRepository.obtenerViaje(id);
    }

    @Override
    public Viaje actualizarViaje(Viaje viaje, int id) {
        return viajeRepository.actualizarViaje(viaje, id);
    }

    @Override
    public void eliminarViaje(int id) {
        viajeRepository.eliminarViaje(id);
    }

}
