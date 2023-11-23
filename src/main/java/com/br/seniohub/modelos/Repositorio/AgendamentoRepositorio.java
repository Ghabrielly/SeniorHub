package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.seniohub.modelos.entidades.Agendamento;

public interface AgendamentoRepositorio extends JpaRepository<Agendamento,Long> {
    
}
