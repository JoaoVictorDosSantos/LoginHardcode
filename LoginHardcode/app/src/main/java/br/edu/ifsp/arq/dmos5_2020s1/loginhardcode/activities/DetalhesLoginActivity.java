package br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.constants.Constantes;
import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.model.Login;
import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.validations.ValidacaoLogin;

public class DetalhesLoginActivity extends AppCompatActivity {

    private TextView textViewLogin;
    private ValidacaoLogin validacaoLogin;
    private Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_login);

        textViewLogin = findViewById(R.id.textview_login);

        desembrulhar();
        mostrar();
    }

    public void desembrulhar(){
        Intent intencao = getIntent();
        Bundle embrulho = intencao.getExtras();

        if(embrulho != null){
            String usuario = embrulho.getString(Constantes.KEY_USUARIO);
            String senha = embrulho.getString(Constantes.KEY_SENHA);
            login = new Login(usuario, senha);
            validacaoLogin = new ValidacaoLogin(login);
        }
    }

    private void mostrar(){
        String mensagem = Constantes.ERRO_LOGIN;
        if(validacaoLogin != null && validacaoLogin.isValid()){
            mensagem = Constantes.VALIDO_LOGIN + " " + login.getUsuario();
        }
        textViewLogin.setText(mensagem);
    }
}
