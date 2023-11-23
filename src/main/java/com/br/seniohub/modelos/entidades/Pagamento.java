package com.br.seniohub.modelos.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPagamento;
    @JoinColumn(name="idIdoso")
    private long idIdoso;
    @JoinColumn(name="idDetalheEvento")
    private long idDetalheEvento;
    @Column(name = "valorPagar",nullable = false)
    private double valorPagar;
    @Column(name = "valorPlano",nullable = false)
    private double valorPlano;
    @Column(name = "valorEvento",nullable = false)
    private double valorEvento;
    @Column(name = "valorPacoteHora",nullable = false)
    private double valorPacoteHora;
    
    public long getIdPagamento() {
        return idPagamento;
    }
    public void setIdPagamento(long idPagamento) {
        this.idPagamento = idPagamento;
    }
    public long getIdIdoso() {
        return idIdoso;
    }
    public void setIdIdoso(long idIdoso) {
        this.idIdoso = idIdoso;
    }
    public long getIdDetalheEvento() {
        return idDetalheEvento;
    }
    public void setIdDetalheEvento(long idDetalheEvento) {
        this.idDetalheEvento = idDetalheEvento;
    }
    public double getValorPagar() {
        return valorPagar;
    }
    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    public double getValorPlano() {
        return valorPlano;
    }
    public void setValorPlano(double valorPlano) {
        this.valorPlano = valorPlano;
    }
    public double getValorEvento() {
        return valorEvento;
    }
    public void setValorEvento(double valorEvento) {
        this.valorEvento = valorEvento;
    }
    public double getValorPacoteHora() {
        return valorPacoteHora;
    }
    public void setValorPacoteHora(double valorPacoteHora) {
        this.valorPacoteHora = valorPacoteHora;
    }
    
}
