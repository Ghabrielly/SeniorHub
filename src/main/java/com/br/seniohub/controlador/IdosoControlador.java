package com.br.seniohub.controlador;

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

import com.br.seniohub.modelos.Repositorio.IdosoRepositorio;
import com.br.seniohub.modelos.entidades.Idoso;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class IdosoControlador {

    @Autowired
    IdosoRepositorio idosoRepositorio;

    @GetMapping("/idosos")
    public ResponseEntity<List<Idoso>> mostrarIdoso(){
        List<Idoso> lista = idosoRepositorio.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/mostrarIdosos/{id}")
    public ResponseEntity<Optional<Idoso>> mostrarIdosoId(@PathVariable Long id){
        Optional<Idoso> idoso = idosoRepositorio.findById(id);
        return ResponseEntity.ok().body(idoso);
    }
    @PostMapping("/salvarIdoso")
    public void salvarIdoso(@RequestBody Idoso idoso){
        idosoRepositorio.save(idoso);
    }
    @DeleteMapping("deletarIdoso/{id}")
    public ResponseEntity<Void> deletarIdoso(@PathVariable Long id){
        idosoRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
