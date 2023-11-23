package com.br.seniohub.modelos.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_plano")
public class Plano {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPlano;
    @Column(name = "nomePlano",nullable = false)
    private String nomePlano;
    @Column(name = "descricao",nullable = false)
    private String descricao;
    @Column(name = "eventoExclusivo",nullable = false)
    private String eventoExclusivo;
    @Column(name = "pacoteHora",nullable = false)
    private int pacoteHora;
    
    public long getIdPlano() {
        return idPlano;
    }
    public void setIdPlano(long idPlano) {
        this.idPlano = idPlano;
    }
    public String getNomePlano() {
        return nomePlano;
    }
    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getEventoExclusivo() {
        return eventoExclusivo;
    }
    public void setEventoExclusivo(String eventoExclusivo) {
        this.eventoExclusivo = eventoExclusivo;
    }
    public int getPacoteHora() {
        return pacoteHora;
    }
    public void setPacoteHora(int pacoteHora) {
        this.pacoteHora = pacoteHora;
    }
       
}
