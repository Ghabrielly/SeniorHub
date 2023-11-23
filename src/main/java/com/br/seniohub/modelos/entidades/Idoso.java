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
@Table(name = "tb_idoso")
public class Idoso {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIdoso;
    @JoinColumn(name="idPlano")
    private long idPlano;
    @Column(name = "usuario",nullable = false)
    private String usuario;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "cpf",nullable = false)
    private int cpf;
    @Column(name = "telefone",nullable = false)
    private String telefone;
    @Column(name = "nascimento",nullable = false)
    private Date nascimento;
    @Column(name = "genero",nullable = false)
    private genero genero;
    @Column(name = "hobbie",nullable = false)
    private String hobbie;
    @Column(name = "endereco",nullable = false)
    private String endereco;
    @Column(name = "senha",nullable = false)
    private String senha;
    
	public long getIdIdoso() {
        return idIdoso;
    }
    public void setIdIdoso(long idIdoso) {
        this.idIdoso = idIdoso;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nasc) {
        nascimento = nasc;
    }
    public genero getGenero() {
        return genero;
    }
    public void setGenero(genero gen) {
        genero = gen;
    }
    public String getHobbie() {
        return hobbie;
    }
    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    private enum genero {
        Masculino,
        Feminino
    }
}
