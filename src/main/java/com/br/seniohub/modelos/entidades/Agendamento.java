package com.br.seniohub.modelos.entidades;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgendamento;
    @JoinColumn(name="idIdoso")
    private long idIdoso;
    @JoinColumn(name="idAcompanhante")
    private long idAcompanhante;
    @Column(name = "quantidadeHora",nullable = false)
    private Long quantidadeHora;
    @Column(name = "valorHora",nullable = false)
    private Long valorHora;
    @Column(name = "local",nullable = false)
    private String local;
    @Column(name = "atividade",nullable = false)
    private String atividade;
    @Column(name = "dataContratacao",nullable = false)
    private Date dataContratacao;
    
    public long getIdAgendamento() {
        return idAgendamento;
    }
    public void setIdAgendamento(long idAgendamento) {
        this.idAgendamento = idAgendamento;
    }
    public long getIdIdoso() {
        return idIdoso;
    }
    public void setIdIdoso(long idIdoso) {
        this.idIdoso = idIdoso;
    }
    public long getIdAcompanhante() {
        return idAcompanhante;
    }
    public void setIdAcompanhante(long idAcompanhante) {
        this.idAcompanhante = idAcompanhante;
    }
    public Long getQuantidadeHora() {
        return quantidadeHora;
    }
    public void setQuantidadeHora(Long quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }
    public Long getValorHora() {
        return valorHora;
    }
    public void setValorHora(Long valorHora) {
        this.valorHora = valorHora;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public Date getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
}
