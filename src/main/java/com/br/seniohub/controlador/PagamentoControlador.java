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

import com.br.seniohub.modelos.Repositorio.PagamentoRepositorio;
import com.br.seniohub.modelos.entidades.Pagamento;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class PagamentoControlador {
    @Autowired
    PagamentoRepositorio pagamentoRepositorio;

    @GetMapping("/Pagamento")
    public ResponseEntity<List<Pagamento>> mostrarPagamento(){
        List<Pagamento> lista = pagamentoRepositorio.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/mostrarPagamentos/{id}")
    public ResponseEntity<Optional<Pagamento>> mostrarPagamentoId(@PathVariable Long id){
        Optional<Pagamento> Pagamento = pagamentoRepositorio.findById(id);
        return ResponseEntity.ok().body(Pagamento);
    }
    @PostMapping("/salvarPagamento")
    public void salvarPagamento(@RequestBody Pagamento Pagamento){
        pagamentoRepositorio.save(Pagamento);
    }
    @DeleteMapping("deletarPagamento/{id}")
    public ResponseEntity<Void> deletarPagamento(@PathVariable Long id){
        pagamentoRepositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
