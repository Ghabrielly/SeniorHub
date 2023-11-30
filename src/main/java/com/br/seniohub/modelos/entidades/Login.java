package com.br.seniohub.modelos.entidades;

public class Login {
    private String usuario;
    private String senha;
    private String tipoLogin;

    public Login() {
    }

    public Login(String usuario, String senha, String tipoLogin) {
        this.usuario = usuario;
        this.senha = senha;
        this.tipoLogin = tipoLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoLogin() {
        return tipoLogin;
    }

    public void setTipoLogin(String tipoLogin) {
        this.tipoLogin = tipoLogin;
    }
}
