package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.br.seniohub.modelos.entidades.Idoso;

public interface IdosoRepositorio extends JpaRepository<Idoso, Long> {
    
   /* @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.senha = :senha")
    public Idoso buscarLogin(String usuario, String senha);*/
	
	@Query("SELECT i FROM Idoso i WHERE i.usuario = :usuario AND i.senha = :senha")
    Idoso findByUsuarioAndSenha(@Param("usuario") String usuario, @Param("senha") String senha);
}