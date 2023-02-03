package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Destino;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinoService extends AbDestino{

    private List<Destino> listaDestinos = new ArrayList<>();

    @Override
    public Destino crearDestino(Destino destino) {
        destino.setId((long) (listaDestinos.size() + 1));
        listaDestinos.add(destino);
        return destino;
    }

    @Override
    public List<Destino> obtenerDestinos() {
        return listaDestinos;
    }

    @Override
    public Destino obtenerDestino(Long id) {
        return listaDestinos.stream()
                .filter(destino -> destino.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Destino actualizarDestino(Destino destino) {
        int index = listaDestinos.indexOf(obtenerDestino(destino.getId()));
        listaDestinos.set(index, destino);
        return destino;
    }

    @Override
    public void eliminarDestino(Long id) {
        listaDestinos.removeIf(destino -> destino.getId().equals(id));
    }
}
