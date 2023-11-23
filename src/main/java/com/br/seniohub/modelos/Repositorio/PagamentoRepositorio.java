package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.seniohub.modelos.entidades.Pagamento;

public interface PagamentoRepositorio extends JpaRepository<Pagamento,Long>{
    
}
