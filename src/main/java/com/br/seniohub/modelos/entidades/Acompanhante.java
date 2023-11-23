package com.br.seniohub.modelos.entidades;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_acompanhante")
public class Acompanhante {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAcompanhante;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "usuario",nullable = false)
    private String usuario;
    @Column(name = "telefone",nullable = false)
    private String telefone;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "endereco",nullable = false)
    private String endereco;    
    @Column(name = "descricao",nullable = false,columnDefinition = "TINYTEXT")
    private String descricao;
    @Column(name = "certificado",nullable = false)
    private String certificado;    
    @Column(name = "hobbies",nullable = false)
    private String hobbies;    
    @Column(name = "senha",nullable = false)
    private String senha;       
    @Column(name = "cpf",nullable = false)
    private int cpf;
    @Column(name = "genero",nullable = false)
    private genero genero;
    @Column(name = "nasc",nullable = false)
    private Date nasc;
    
    public long getIdAcompanhante() {
        return idAcompanhante;
    }
    public void setIdAcompanhante(long idAcompanhante) {
        this.idAcompanhante = idAcompanhante;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCertificado() {
        return certificado;
    }
    public void setCertificado(String cert) {
        certificado = cert;
    }
    public String getHobbies() {
        return hobbies;
    }
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public genero getGenero() {
        return genero;
    }
    public void setGenero(genero gen) {
        genero = gen;
    }
    public Date getNasc() {
        return nasc;
    }
    public void setNasc(Date nascimento) {
        nasc = nascimento;
    }

    private enum genero {
        Masculino,
        Feminino
    }
}
