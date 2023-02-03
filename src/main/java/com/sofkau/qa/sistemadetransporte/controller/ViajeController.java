package com.sofkau.qa.sistemadetransporte.controller;

import com.sofkau.qa.sistemadetransporte.repository.model.Viaje;
import com.sofkau.qa.sistemadetransporte.service.IViaje;
import com.sofkau.qa.sistemadetransporte.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/terminal")
public class ViajeController {

    List<Viaje> viajeRequest = new ArrayList<>();

    @Autowired
    private ViajeService iViaje;

    @PostMapping("/viaje")
    public ResponseEntity agregarViaje(@RequestBody Viaje viaje){
        iViaje.crearViaje(viaje);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping("trae/todos")
    public ResponseEntity obtenerViajes(){
        return new ResponseEntity(iViaje.obtenerListaViajes(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerViaje(@PathVariable int id) {
        return new ResponseEntity(iViaje.obtenerViaje(id), HttpStatus.FOUND);
    }

    @PutMapping("/{Id}")
    public ResponseEntity updateNote(@PathVariable("Id") int id,
                                     @RequestBody Viaje viaje){
        List<Viaje> nuevoViaje = viajeRequest.stream()
                   .map(n -> n.getId() == id?viaje:n).collect(Collectors.toList());
        this.viajeRequest = nuevoViaje;
        return new ResponseEntity(viaje, HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarViaje(@PathVariable int id) {
        iViaje.eliminarViaje(id);
        return ResponseEntity.noContent().build();
    }

}
