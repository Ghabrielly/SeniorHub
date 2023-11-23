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

import com.br.seniohub.modelos.Repositorio.DetalheEventoRepositorio;
import com.br.seniohub.modelos.entidades.DetalheEvento;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class DetalheEventoControlador {
    @Autowired
    DetalheEventoRepositorio detalheEventoRepositorio;

    @GetMapping("/detalheEvento")
    public ResponseEntity<List<DetalheEvento>> mostrarDetalheEvento(){
        List<DetalheEvento> lista = detalheEventoRepositorio.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/mostrarDetalheEventos/{id}")
    public ResponseEntity<Optional<DetalheEvento>> mostrarDetalheEventoId(@PathVariable Long id){
        Optional<DetalheEvento> DetalheEvento = detalheEventoRepositorio.findById(id);
        return ResponseEntity.ok().body(DetalheEvento);
    }
    @PostMapping("/salvarDetalheEvento")
    public void salvarDetalheEvento(@RequestBody DetalheEvento DetalheEvento){
        detalheEventoRepositorio.save(DetalheEvento);
    }
    @DeleteMapping("deletarDetalheEvento/{id}")
    public ResponseEntity<Void> deletarDetalheEvento(@PathVariable Long id){
        detalheEventoRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
