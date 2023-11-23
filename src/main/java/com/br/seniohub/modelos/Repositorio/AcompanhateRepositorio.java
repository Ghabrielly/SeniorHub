package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.seniohub.modelos.entidades.Acompanhante;

public interface AcompanhateRepositorio  extends JpaRepository<Acompanhante, Long>{
    
}
