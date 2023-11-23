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

import com.br.seniohub.modelos.Repositorio.PlanoRepositorio;
import com.br.seniohub.modelos.entidades.Plano;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class PlanoControlado {
    @Autowired
    PlanoRepositorio planoRepositorio;

    @GetMapping("/plano")
    public ResponseEntity<List<Plano>> mostrarPlano(){
        List<Plano> lista = planoRepositorio.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/mostrarPlanos/{id}")
    public ResponseEntity<Optional<Plano>> mostrarPlanoId(@PathVariable Long id){
        Optional<Plano> Plano = planoRepositorio.findById(id);
        return ResponseEntity.ok().body(Plano);
    }
    @PostMapping("/salvarPlano")
    public void salvarPlano(@RequestBody Plano Plano){
        planoRepositorio.save(Plano);
    }
    @DeleteMapping("deletarPlano/{id}")
    public ResponseEntity<Void> deletarPlano(@PathVariable Long id){
        planoRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
