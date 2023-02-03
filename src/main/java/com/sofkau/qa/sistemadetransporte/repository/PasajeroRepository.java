package com.sofkau.qa.sistemadetransporte.repository;

import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PasajeroRepository {

    private List<Pasajero> listaPasajeros = new ArrayList<>();

    public PasajeroRepository(List<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    public Pasajero crearPasajero(Pasajero pasajero) {
        pasajero.setId((long) (listaPasajeros.size() + 1));
        listaPasajeros.add(pasajero);
        return pasajero;
    }

    public List<Pasajero> obtenerListaPasajeros() {
        return listaPasajeros;
    }

    public Pasajero obtenerPasajero(Long id) {
        return listaPasajeros.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public Pasajero actualizarPasajero(Pasajero pasajero) {
        /**
         *  Busca el índice del pasajero en la lista de pasajeros (listaPasajeros) que se desea actualizar,
         *  utilizando el método "indexOf" y pasándole como parámetro el resultado de llamar al método
         *  "obtenerPasajero" con el ID del pasajero que se desea actualizar.
         */
        int index = listaPasajeros.indexOf(obtenerPasajero(pasajero.getId()));
        //Para actualizar el pasajero en la posición del índice encontrado con el nuevo objeto pasajero recibido como parámetro.
        listaPasajeros.set(index, pasajero);
        return pasajero;
    }

    public void eliminarPasajero(Long id) {
        Pasajero pasajero = obtenerPasajero(id);
        listaPasajeros.remove(pasajero);
    }
}
