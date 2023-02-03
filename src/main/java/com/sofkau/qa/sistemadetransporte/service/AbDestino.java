package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Destino;

import java.util.List;

public abstract class AbDestino {
    public abstract Destino crearDestino(Destino destino);
    public abstract List<Destino> obtenerDestinos();
    public abstract Destino obtenerDestino(Long id);
    public abstract Destino actualizarDestino(Destino destino);
    public abstract void eliminarDestino(Long id);
}
