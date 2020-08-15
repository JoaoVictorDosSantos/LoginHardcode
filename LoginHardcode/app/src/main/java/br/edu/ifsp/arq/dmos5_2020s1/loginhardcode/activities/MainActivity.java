package br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.constants.Constantes;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextUsuario;
    private EditText editTextSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsuario = findViewById(R.id.edittext_usuario);
        editTextSenha = findViewById(R.id.edittext_senha);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnLogin){
            login();
        }
    }

    private void login() {
        String usuario = editTextUsuario.getText().toString();
        String senha = editTextSenha.getText().toString();

        if(usuario.isEmpty() && senha.isEmpty()){
            Toast.makeText(this, "Os campos usuário e senha devem ser preenchidos!", Toast.LENGTH_LONG).show();
        }else{
            Bundle argumentos = new Bundle();
            argumentos.putString(Constantes.KEY_USUARIO, usuario);
            argumentos.putString(Constantes.KEY_SENHA, senha);

            this.startDetahlesLoginActivity(argumentos);
        }

    }

    private void startDetahlesLoginActivity(Bundle argumentos){
        Intent novaTela = new Intent(this, DetalhesLoginActivity.class);
        novaTela.putExtras(argumentos);
        startActivity(novaTela);
    }
}
