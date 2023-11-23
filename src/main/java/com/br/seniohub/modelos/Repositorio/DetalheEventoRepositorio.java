package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.seniohub.modelos.entidades.DetalheEvento;

public interface DetalheEventoRepositorio extends JpaRepository<DetalheEvento,Long> {
    
}
