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

import com.br.seniohub.modelos.Repositorio.AcompanhateRepositorio;
import com.br.seniohub.modelos.entidades.Acompanhante;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class AcompanhateControlador {
    @Autowired
    AcompanhateRepositorio acompanhanteRepositorio;

    @GetMapping("/acompanhate")
    public ResponseEntity<List<Acompanhante>> mostrarAcompanhante(){
        List<Acompanhante> lista = acompanhanteRepositorio.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/mostrarAcompanhantes/{id}")
    public ResponseEntity<Optional<Acompanhante>> mostrarAcompanhanteId(@PathVariable Long id){
        Optional<Acompanhante> Acompanhante = acompanhanteRepositorio.findById(id);
        return ResponseEntity.ok().body(Acompanhante);
    }
    @PostMapping("/salvarAcompanhante")
    public void salvarAcompanhante(@RequestBody Acompanhante Acompanhante){
        acompanhanteRepositorio.save(Acompanhante);
    }
    @DeleteMapping("deletarAcompanhante/{id}")
    public ResponseEntity<Void> deletarAcompanhante(@PathVariable Long id){
        acompanhanteRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
