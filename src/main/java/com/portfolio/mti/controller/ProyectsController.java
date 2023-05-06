package com.portfolio.mti.controller;

import com.portfolio.mti.models.Proyects;
import com.portfolio.mti.services.ProyectsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyects")
public class ProyectsController {

    private final ProyectsService proyectsService;

    public ProyectsController(ProyectsService proyectsService) {
        this.proyectsService = proyectsService;
    }

    @GetMapping
    public ResponseEntity<List<Proyects>> getProyects(){
        List<Proyects> proyects = proyectsService.getProyects();
        return new ResponseEntity<>(proyects, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Proyects> addProyect(@RequestBody Proyects newProyect) {
        Proyects proyect = proyectsService.addProyect(newProyect);
        return new ResponseEntity<>(proyect, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Proyects> updateProyect(@RequestBody Proyects proyectToUpdate) {
        Proyects proyectUpdated = proyectsService.updateProyect(proyectToUpdate);
        return new ResponseEntity<>(proyectUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProyect(@PathVariable("id") Long id) {
        proyectsService.deleteProyect(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
