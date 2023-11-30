package com.br.seniohub.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.seniohub.modelos.Repositorio.AcompanhateRepositorio;
import com.br.seniohub.modelos.Repositorio.IdosoRepositorio;
import com.br.seniohub.modelos.entidades.Acompanhante;
import com.br.seniohub.modelos.entidades.Idoso;
import com.br.seniohub.modelos.entidades.Login;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class LoginControlador {

    @Autowired
    AcompanhateRepositorio acompanhanteRepositorio;

    @Autowired
    IdosoRepositorio idosoRepositorio;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login login) {
        if ("idoso".equalsIgnoreCase(login.getTipoLogin())) {
            Idoso idoso = idosoRepositorio.findByUsuarioAndSenha(login.getUsuario(), login.getSenha());
            if (idoso != null) {
                return ResponseEntity.ok().body(idoso);
            } else {
                return ResponseEntity.badRequest().body("Login ou senha incorretos para o Idoso");
            }
        } else if ("acompanhante".equalsIgnoreCase(login.getTipoLogin())) {
            Acompanhante acompanhante = acompanhanteRepositorio.findByUsuarioAndSenha(login.getUsuario(), login.getSenha());
            if (acompanhante != null) {
                return ResponseEntity.ok().body(acompanhante);
            } else {
                return ResponseEntity.badRequest().body("Login ou senha incorretos para o Acompanhante");
            }
        } else {
            return ResponseEntity.badRequest().body("Tipo de login inválido");
        }
    }

}
