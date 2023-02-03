package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Viaje;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IViaje {
    Viaje crearViaje(Viaje viaje);
    List<Viaje> obtenerListaViajes();
    Viaje obtenerViaje(int id);
    Viaje actualizarViaje(Viaje viaje);
    void eliminarViaje(int id);
}
