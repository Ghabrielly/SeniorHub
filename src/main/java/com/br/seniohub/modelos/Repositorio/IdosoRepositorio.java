package com.br.seniohub.modelos.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.br.seniohub.modelos.entidades.Idoso;

public interface IdosoRepositorio extends JpaRepository<Idoso, Long> {
    
   /* @Query("SELECT u FROM Usuario u WHERE u.usuario = :usuario AND u.senha = :senha")
    public Idoso buscarLogin(String usuario, String senha);*/
}