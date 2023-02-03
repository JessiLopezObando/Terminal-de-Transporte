package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Bus;
import com.sofkau.qa.sistemadetransporte.repository.model.Destino;

import java.util.List;

public abstract class AbBus {

    public abstract Bus crearBus(Bus bus);
    public abstract List<Bus> obtenerBuses();
    public abstract Bus obtenerBus(Long id);
    public abstract Bus actualizarBus(Bus bus);
    public abstract void eliminarBus(Long id);

}
