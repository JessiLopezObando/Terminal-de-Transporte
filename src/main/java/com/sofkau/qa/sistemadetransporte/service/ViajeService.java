package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Viaje;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViajeService implements IViaje {
    private List<Viaje> listaViajes = new ArrayList<>();

    @Override
    public Viaje crearViaje(Viaje viaje) {
        viaje.setId(listaViajes.size() + 1);
        listaViajes.add(viaje);
        return viaje;
    }

    @Override
    public List<Viaje> obtenerListaViajes() {
        return listaViajes;
    }

    @Override
    public Viaje obtenerViaje(int id) {
        return listaViajes.stream()
                .filter(viaje -> viaje.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Viaje actualizarViaje(Viaje viaje) {
        int index = listaViajes.indexOf(obtenerViaje(viaje.getId()));
        listaViajes.set(index, viaje);
        return viaje;
    }

    @Override
    public void eliminarViaje(int id) {
        listaViajes.removeIf(viaje -> viaje.getId() == id);
    }

}
