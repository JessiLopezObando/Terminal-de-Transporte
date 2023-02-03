package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PasajeroService implements IPasajero {

     /**
     * La clase PasajeroService implementa la interfaz IPasajero.
     * Proporciona implementaciones concretas para los métodos definidos en la interfaz.
     * En este caso, se almacenan los pasajeros en una lista en memoria.
     */
     private List<Pasajero> listaPasajeros = new ArrayList<>();

    @Override
    public Pasajero crearPasajero(Pasajero pasajero) {
        pasajero.setId((long) (listaPasajeros.size() + 1));
        listaPasajeros.add(pasajero);
        return pasajero;
    }

    @Override
    public List<Pasajero> obtenerListaPasajeros() {
        return listaPasajeros;
    }

    @Override
    public Pasajero obtenerPasajero(Long id) {
        return listaPasajeros.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
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

    @Override
    public void eliminarPasajero(Long id) {
        Pasajero pasajero = obtenerPasajero(id);
        listaPasajeros.remove(pasajero);
    }
}
