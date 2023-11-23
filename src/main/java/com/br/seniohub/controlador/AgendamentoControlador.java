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

import com.br.seniohub.modelos.Repositorio.AgendamentoRepositorio;
import com.br.seniohub.modelos.entidades.Agendamento;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class AgendamentoControlador {
    @Autowired
    AgendamentoRepositorio agendamentoRepositorio;

    @GetMapping("/Agendamento")
    public ResponseEntity<List<Agendamento>> mostrarAgendamento(){
        List<Agendamento> lista = agendamentoRepositorio.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/mostrarAgendamentos/{id}")
    public ResponseEntity<Optional<Agendamento>> mostrarAgendamentoId(@PathVariable Long id){
        Optional<Agendamento> Agendamento = agendamentoRepositorio.findById(id);
        return ResponseEntity.ok().body(Agendamento);
    }
    @PostMapping("/salvarAgendamento")
    public void salvarAgendamento(@RequestBody Agendamento Agendamento){
        agendamentoRepositorio.save(Agendamento);
    }
    @DeleteMapping("deletarAgendamento/{id}")
    public ResponseEntity<Void> deletarAgendamento(@PathVariable Long id){
        agendamentoRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
