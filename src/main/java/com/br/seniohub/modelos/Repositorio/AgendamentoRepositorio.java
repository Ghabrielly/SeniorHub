package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.br.seniohub.modelos.entidades.Agendamento;

public interface AgendamentoRepositorio extends JpaRepository<Agendamento,Long> {
	@Query("select a from Agendamento a where a.idIdoso = :id_idoso  order by a.idAgendamento desc limit 1")
	Agendamento findUltimoAgendamento(@Param("id_idoso") String id_idoso);
}