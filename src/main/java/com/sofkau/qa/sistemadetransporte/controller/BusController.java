package com.sofkau.qa.sistemadetransporte.controller;

import com.sofkau.qa.sistemadetransporte.repository.model.Bus;
import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;
import com.sofkau.qa.sistemadetransporte.service.BusService;
import com.sofkau.qa.sistemadetransporte.service.IPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("trae/todos")
    public ResponseEntity obtenerBuses(){
        return new ResponseEntity(busService.obtenerBuses(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Bus obtenerBusPorIdId(@PathVariable Long id){
        return busService.obtenerBus(id);
    }

    @PostMapping
    public ResponseEntity agregarBus(@RequestBody Bus bus){
        busService.crearBus(bus);
        return new ResponseEntity(HttpStatus.CREATED);
    }


}
