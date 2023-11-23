package com.br.seniohub.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.seniohub.modelos.Repositorio.EventoRepositorio;
import com.br.seniohub.modelos.entidades.Evento;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class EventoContolador {
    @Autowired
    EventoRepositorio eventoRepositorio;

    @GetMapping("/evento")
    public ResponseEntity<List<Evento>> mostrarEvento(){
        List<Evento> lista = eventoRepositorio.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/mostrarEventos/{id}")
    public ResponseEntity<Optional<Evento>> mostrarEventoId(@PathVariable Long id){
        Optional<Evento> Evento = eventoRepositorio.findById(id);
        return ResponseEntity.ok().body(Evento);
    }
    @PostMapping("/salvarEvento")
    public void salvarEvento(@RequestBody Evento Evento){
        eventoRepositorio.save(Evento);
    }
    @DeleteMapping("deletarEvento/{id}")
    public ResponseEntity<Void> deletarEvento(@PathVariable Long id){
        eventoRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
