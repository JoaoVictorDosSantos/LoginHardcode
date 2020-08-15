package br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.validations;

import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.constants.Constantes;
import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.model.Login;

public class ValidacaoLogin {

    public static final String LOGIN_USUARIO = "3001695";
    public static final String LOGIN_SENHA = "5961003";

    private Login login;

    public ValidacaoLogin(Login login){
        this.login = login;
    }

    public Boolean isValid(){
        Boolean retorno = false;
        if(login != null && LOGIN_USUARIO.equals(login.getUsuario()) && LOGIN_SENHA.equals(login.getSenha())){
            retorno = true;
        }
        return retorno;
    }
}
