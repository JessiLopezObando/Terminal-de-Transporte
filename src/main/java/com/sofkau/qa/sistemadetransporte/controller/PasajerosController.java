package com.sofkau.qa.sistemadetransporte.controller;

import com.sofkau.qa.sistemadetransporte.repository.model.Destino;
import com.sofkau.qa.sistemadetransporte.repository.model.Pasajero;
import com.sofkau.qa.sistemadetransporte.service.IPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pasajeros")
public class PasajerosController {

        @Autowired
        private IPasajero iPasajero;

        @GetMapping("trae/todos")
        public ResponseEntity obtenerPasajeros(){
        return new ResponseEntity(iPasajero.obtenerListaPasajeros(), HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity obtenerPasajeroPorIdId(@PathVariable Long id){
                return new ResponseEntity(iPasajero.obtenerPasajero(id),HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity agregarPasajero(@RequestBody Pasajero pasajeros){
            iPasajero.crearPasajero(pasajeros);
            return new ResponseEntity(HttpStatus.CREATED);
        }

        @PutMapping("/{id}")
        public Pasajero actualizarPasajero(@PathVariable Long id, @RequestBody Pasajero pasajero) {
                return iPasajero.actualizarPasajero(pasajero);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity eliminarPasajero(@PathVariable Long id) {
                iPasajero.eliminarPasajero(id);
                return new ResponseEntity(HttpStatus.ACCEPTED);
        }
}
