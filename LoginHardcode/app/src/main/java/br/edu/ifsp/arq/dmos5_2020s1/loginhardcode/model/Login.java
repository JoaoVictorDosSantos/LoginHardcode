package br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.model;

import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.constants.Constantes;

public class Login {

    private String usuario;
    private String senha;

    public Login(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
