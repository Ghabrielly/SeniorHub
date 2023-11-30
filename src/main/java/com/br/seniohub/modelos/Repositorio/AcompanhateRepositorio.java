package com.br.seniohub.modelos.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.br.seniohub.modelos.entidades.Acompanhante;

public interface AcompanhateRepositorio  extends JpaRepository<Acompanhante, Long>{
	@Query("SELECT a FROM Acompanhante a WHERE a.usuario = :usuario AND a.senha = :senha")
	Acompanhante findByUsuarioAndSenha(@Param("usuario") String usuario, @Param("senha") String senha);
}
