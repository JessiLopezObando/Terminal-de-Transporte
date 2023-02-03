package com.sofkau.qa.sistemadetransporte.controller;

import com.sofkau.qa.sistemadetransporte.repository.model.Bus;
import com.sofkau.qa.sistemadetransporte.repository.model.Destino;
import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;
import com.sofkau.qa.sistemadetransporte.repository.model.Viaje;
import com.sofkau.qa.sistemadetransporte.service.BusService;
import com.sofkau.qa.sistemadetransporte.service.DestinoService;
import com.sofkau.qa.sistemadetransporte.service.PasajeroService;
import com.sofkau.qa.sistemadetransporte.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/terminal")
public class TerminalController {

    @Autowired
    private ViajeService iViaje;
    @Autowired
    private DestinoService destinoService;
    @Autowired
    private PasajeroService pasajeroService;
    @Autowired
    private BusService busService;

     @PostMapping("/viaje")
    public ResponseEntity agregarViaje(@RequestBody Viaje viaje){
        Destino destino = destinoService.obtenerDestino(viaje.getDestino().getId());
        Bus bus = busService.obtenerBus(viaje.getBus().getPlaca());
        //List<Long> idPasajeros = viaje.getPasajero().stream().map(Pasajero::getId).collect(Collectors.toList());
        List<Pasajero> pasajeros = pasajeroService.obtenerListaPasajeros();

        viaje.setDestino(destino);
        viaje.setBus(bus);
        viaje.setPasajero(pasajeros);
        iViaje.crearViaje(viaje);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("trae/todos")
    public ResponseEntity obtenerViajes(){
        return new ResponseEntity(iViaje.obtenerListaViajes(), HttpStatus.FOUND);
    }


    @GetMapping("/{id}")
    public ResponseEntity obtenerViaje(@PathVariable int id) {
        return new ResponseEntity(iViaje.obtenerViaje(id), HttpStatus.FOUND);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarViaje(@PathVariable int id) {
        iViaje.eliminarViaje(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
