package com.sofkau.qa.sistemadetransporte.repository;

import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;
import com.sofkau.qa.sistemadetransporte.repository.model.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ViajeRepository {


    private final List<Viaje> listaViajes;

    public ViajeRepository(List<Viaje> listaViajes) {
        this.listaViajes = listaViajes;
    }

    public Viaje crearViaje(Viaje viaje) {
        viaje.setId(listaViajes.size() + 1);
        listaViajes.add(viaje);
        return viaje;
    }

    public List<Viaje> obtenerListaViajes() {
        return listaViajes;
    }

    public Viaje obtenerViaje(int id) {
        return listaViajes.stream()
                .filter(viaje -> viaje.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Viaje actualizarViaje(Viaje viaje, int id) {
            int index = listaViajes.indexOf(obtenerViaje(viaje.getId()));
            listaViajes.set(index, viaje);
            listaViajes.add(viaje);
            return viaje;
    }

    public void eliminarViaje(int id) {
        listaViajes.removeIf(viaje -> viaje.getId() == id);
    }

}
