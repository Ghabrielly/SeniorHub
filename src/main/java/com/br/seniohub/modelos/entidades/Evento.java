package com.br.seniohub.modelos.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_evento")
public class Evento {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEvento;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "descricao",nullable = false,columnDefinition = "TEXT")
    private String descricao;
    @Column(name = "local",nullable = false)
    private String local;
    @Column(name = "eventoCol",nullable = false)
    private String eventoCol;
    
    public long getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(long idEvento) {
        this.idEvento = idEvento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getEventoCol() {
        return eventoCol;
    }
    public void setEventoCol(String eventoCol) {
        this.eventoCol = eventoCol;
    }

    
}
