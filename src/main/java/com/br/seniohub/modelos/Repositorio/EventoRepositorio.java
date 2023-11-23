package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.seniohub.modelos.entidades.Evento;

public interface EventoRepositorio extends JpaRepository<Evento,Long> {
    
}
