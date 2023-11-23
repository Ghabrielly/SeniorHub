package com.br.seniohub.modelos.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_detalheevento")
public class DetalheEvento {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetalheEvento;
    @JoinColumn(name="idIdoso")
    private long idIdoso;
    @JoinColumn(name="idEvento")
    private long idEvento;
    @Column(name = "dataInicio",nullable = false)
    private String dataInicio;
    @Column(name = "dataFinal",nullable = false)
    private String dataFinal;
    @Column(name = "horario",nullable = false)
    private String horario;
    @Column(name = "gratuito",nullable = false)
    private Gratuito gratuito;

    public long getIdDetalheEvento() {
        return idDetalheEvento;
    }
    public void setIdDetalheEvento(long idDetalheEvento) {
        this.idDetalheEvento = idDetalheEvento;
    }
    public long getIdIdoso() {
        return idIdoso;
    }
    public void setIdIdoso(long idIdoso) {
        this.idIdoso = idIdoso;
    }
    public long getIdEvento() {
        return idEvento;
    }
    public void setIdEvento(long idEvento) {
        this.idEvento = idEvento;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public Gratuito getGratuito() {
        return gratuito;
    }
    public void setGratuito(Gratuito gratuito) {
        this.gratuito = gratuito;
    }
    private enum Gratuito{
        sim,nao
    }
}

