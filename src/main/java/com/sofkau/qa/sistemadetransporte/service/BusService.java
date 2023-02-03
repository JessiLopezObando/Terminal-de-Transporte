package com.sofkau.qa.sistemadetransporte.service;

import com.sofkau.qa.sistemadetransporte.repository.model.Bus;
import com.sofkau.qa.sistemadetransporte.repository.model.Destino;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService extends AbBus{

    private List<Bus> listaBuses = new ArrayList<>();
    @Override
    public Bus crearBus(Bus bus) {
        listaBuses.add(bus);
        return bus;
    }

    @Override
    public List<Bus> obtenerBuses() {
        return listaBuses;
    }

    @Override
    public Bus obtenerBus(Long placa) {
        return listaBuses.stream()
                .filter(bus -> bus.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Bus actualizarBus(Bus bus) {
        int index = listaBuses.indexOf(obtenerBus(bus.getPlaca()));
        listaBuses.set(index, bus);
        return bus;
    }

    @Override
    public void eliminarBus(Long placa) {
        listaBuses.removeIf(destino -> destino.getPlaca().equals(placa));
    }
}
