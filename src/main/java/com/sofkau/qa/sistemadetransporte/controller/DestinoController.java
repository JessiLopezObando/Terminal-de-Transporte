package com.sofkau.qa.sistemadetransporte.controller;

import com.sofkau.qa.sistemadetransporte.repository.model.Bus;
import com.sofkau.qa.sistemadetransporte.repository.model.Destino;
import com.sofkau.qa.sistemadetransporte.service.BusService;
import com.sofkau.qa.sistemadetransporte.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/destino")
public class DestinoController {
    @Autowired
    private DestinoService destinoService;

    @GetMapping("trae/todos")
    public ResponseEntity obtenerBuses(){
        return new ResponseEntity(destinoService.obtenerDestinos(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public Destino obtenerDestinoPorIdId(@PathVariable Long id){
        return destinoService.obtenerDestino(id);
    }

    @PostMapping
    public ResponseEntity agregarDestino(@RequestBody Destino destino){
        destinoService.crearDestino(destino);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
